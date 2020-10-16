<?php
include_once('session.php');
$_SESSION["loggedIn"] = false;
$_SESSION["loggedInUser"] = NULL;
header("Location: index.php");
exit;