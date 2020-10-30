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
$password = $_POST["password"];
$authenticated = false;

$account = $database->select(
    "akun",
    "*",
    [
        "email" => $email,
        "password" => $password
    ]
);
$account = $account[0];

if ($account) {
    $authenticated = true;
}

if (!$authenticated) {
    header("Location: login.php");
} else {
    $_SESSION["loggedInUser"] = $account["email"];
    $_SESSION["loggedIn"] = true;
    header("Location: index.php");
}
echo($account["email"]);