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

if ($_SESSION["loggedIn"]) {
    header("Location: index.php");
    exit;
}

$email = $_POST["email"];
$password = $_POST["psw"];

$database->insert("akun", [
	"email" => $email,
	"password" => $password,
	"role" => 0
]);

header("Location: index.php");