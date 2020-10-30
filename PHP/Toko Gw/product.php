<?php
include_once("vendor/autoload.php");
include_once("session.php");

use Medoo\Medoo;

$database = new Medoo([
    'database_type' => 'mysql',
    'server' => 'localhost',
    'database_name' => 'toko_gw_db',
    'username' => 'root',
    'password' => 'zico101121'
]);
$produk = $database->select(
    "produk",
    "*",
    [
        "ORDER" => [
            "nama" => "ASC"
        ]
    ]
);

$loader = new Twig_Loader_Filesystem("templates");
$twig = new Twig_Environment($loader);
$template = $twig->load('product.html');
echo $template->render([
    "user" => $_SESSION["loggedIn"],
    "login" => $_SESSION["loggedInUser"],
    "products" => $produk
]);
