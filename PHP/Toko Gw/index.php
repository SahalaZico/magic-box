<?php
include_once("session.php");
include_once("vendor/autoload.php");

$loader = new Twig_Loader_Filesystem("templates");
$twig = new Twig_Environment($loader);
$template = $twig->load('index.html');
echo $template->render([
    "user" => $_SESSION["loggedIn"],
    "login" => $_SESSION["loggedInUser"]
]);
