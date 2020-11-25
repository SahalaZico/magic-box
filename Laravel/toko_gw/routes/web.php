<?php

use Illuminate\Support\Facades\Route;
use App\Http\Controllers\PageController;
use App\Http\Controllers\ProdukController;

Route::get('/',  [PageController::class, 'home']);

Route::get('/login',  [PageController::class, 'login']);
Route::post('/auth',[PageController::class, 'auth']);
Route::get('/logout',[PageController::class, 'logout']);

Route::get('/registration',  [PageController::class, 'registration']);
Route::post('/registration_process',  [PageController::class, 'registration_process']);

Route::get('/produk', [ProdukController::class, 'all']);
Route::get('/produk/{id}', [ProdukController::class, 'show']);
Route::put('/produk/{id}', [ProdukController::class, 'update_stok']);
