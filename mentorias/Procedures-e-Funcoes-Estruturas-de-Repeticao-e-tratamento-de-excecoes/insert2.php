<?php

$conn = oci_connect('plsql1', 'plsql1', 'localhost/XE');
if (!$conn) {
    $e = oci_error();
    trigger_error(htmlentities($e['message'], ENT_QUOTES), E_USER_ERROR);
}

$sql = "begin incluir_registro2 (65, 5);end;";
$stid = oci_parse($conn, $sql);
oci_execute($stid);


?>
