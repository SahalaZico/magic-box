<?php

use Illuminate\Support\Facades\Route;
use App\Http\Controllers\PageController;
use App\Http\Controllers\ProdukController;

Route::get('/',  [PageController::class, 'home']);
Route::get('/login',  [PageController::class, 'login']);
Route::post('/auth',[PageController::class, 'auth']);
Route::get('/logout',[PageController::class, 'logout']);
Route::get('/produk', [ProdukController::class, 'all']);
Route::get('/produk/{id}', [ProdukController::class, 'detail']);
