
<?php
// reference the Dompdf namespace
require 'vendor/autoload.php';
// include autoloader
//require_once 'dompdf/autoload.inc.php';
use Dompdf\Dompdf;

// instantiate and use the dompdf class

$dompdf = new Dompdf();
$dompdf->loadHtml('<h1>Prueba final de PHP</h1>');

// (Optional) Setup the paper size and orientation
$dompdf->setPaper('A4', 'landscape');

// Render the HTML as PDF

$dompdf->render();

// Output the generated PDF to Browser

$dompdf->stream("prueba.pdf",['Attachment' => false]);
?>

