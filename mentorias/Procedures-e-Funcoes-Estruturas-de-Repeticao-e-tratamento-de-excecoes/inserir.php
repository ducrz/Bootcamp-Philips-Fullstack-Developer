<?php
$conn = oci_connect('plsql1', 'plsql1', 'localhost/XE');
if (!$conn) {
    $e = oci_error();
    trigger_error(htmlentities($e['message'], ENT_QUOTES), E_USER_ERROR);
}

$sql = "INSERT INTO VENDA (ID_VENDA, QUANTIDADE, DESCRICAO) VALUES (150, 40, 'PHP XXX')";
$stid = oci_parse($conn, $sql);
oci_execute($stid);
print("Registro Inserido com Sucesso!!!");

?>