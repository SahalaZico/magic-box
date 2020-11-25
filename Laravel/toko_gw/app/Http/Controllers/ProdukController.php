<?php

namespace App\Http\Controllers;

use App\Http\Controllers\Controller;
use Illuminate\Http\Request;
use App\Models\Produk;

class ProdukController extends Controller
{
    public function all()
    {
        $produk = Produk::all();
        return view('produk', compact('produk'));
    }

    public function detail($id)
    {
        $produk=Produk::find($id);
        return view('produk_detail', compact('produk'));
    }
}
