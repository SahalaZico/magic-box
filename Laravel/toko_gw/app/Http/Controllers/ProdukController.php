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

    public function show($id)
    {
        $produk=Produk::find($id);
        return view('show_produk', compact('produk'));
    }

    public function update_stok($id,request $req)
    {
        $produk=Produk::find($id);
        $data = $req->input();
        $produk->stok = $data['stok'];
        $produk->save();
        return redirect('/produk');
    }
}
