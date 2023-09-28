<?php

require_once(__DIR__. "/util/Connection.php");

$conn = Connection::getConnection();
print_r($conn);
