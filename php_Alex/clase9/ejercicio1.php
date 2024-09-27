<?php
class Client{
    var $name;
    var $age;
    var $city;
    public function __contruct(){}
}

#objeto a json
$client = new Client();
$client->name = "Pepe";
$client->age = 35;
$client->city = "San Lorenzo";

$code_json = json_encode($client);

echo $code_json;
?>
