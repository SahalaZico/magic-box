<?php

include_once("session.php");
include_once("vendor/autoload.php");
if ($_SESSION["loggedIn"]) {
  header("Location: index.php");
  exit;
}

$loader = new Twig_Loader_Filesystem("templates");
$twig = new Twig_Environment($loader);
$template = $twig->load('registration.html');
echo $template->render();