<?php

namespace App\Http\Controllers;

use App\Http\Controllers\Controller;
use Illuminate\Http\Request;
use App\Models\Akun;

class PageController extends Controller
{
    public function home()
    {
        return view('index');
    }

    public function login(){
        return view('login');
    }

    public function auth(Request $req){
        $data = $req->input();
        $req->session()->put('username', $data['email']);
        return redirect('/produk');
    }

    public function auth2(Request $req){
        $data = $req->input();
        $akun = Akun::where('email',$data['email']);
        print('hai');
        print($akun->get('email'));
        return redirect('/produk');
    }

    public function logout(){
        if(session()->has('username')){
            session()->pull('username');
        }
        return redirect('/produk');
    }
}
