<?php
// List of all empty values/

$testCase = array(
    1 => '',
    2 => "",
    3 => null,
    4 => array(),
    5 => FALSE,
    6 => NULL,
    7=>'0',
    8=>0,
    
);
foreach ($testCase as $k => $v) {
    if (empty($v)) {
    echo "<br> $k=> is empty";
    }
}
/**
Output
1=> is empty
2=> is empty
3=> is empty
4=>Array is empty
5=> is empty
6=> is empty
7=>0 is empty
8=>0 is empty
**/
?>