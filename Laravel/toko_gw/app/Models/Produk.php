<?php

namespace App\Models;

use Illuminate\Database\Eloquent\Factories\HasFactory;
use Illuminate\Database\Eloquent\Model;

class Produk extends Model
{
    use HasFactory;
    protected $table = 'produk';
    protected $primaryKey = 'id';
    public $incrementing = false;
    public $timestamps = false;
    protected $fillable = ['id','nama','harga_perunit','stok','deskripsi','gambar','id_kategori'];
}
