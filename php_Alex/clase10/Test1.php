<?php
class Animal{
    private $nombre;
    private $edad;

    public function __construct($nombre, $edad){
        $this->nombre = $nombre;
        $this->edad = $edad;
    }

    public function setNombre($nombre){
        $this->nombre = $nombre;
    }

    public function getNombre(){
        return $this->nombre;
    }

    public function setEdad($edad){
        $this->edad = $edad;
    }

    public function  getEdad(){
        return $this->edad;
    }

    public function tostring(){
        return "Soy un animal ".$this->nombre;
    }
}


Class Perro extends Animal{

    public function __construct($nombre, $edad){
        parent::__construct($nombre, $edad);
    }
    //sobreescritura
    public function getEdad(){
        return parent::getEdad() *7;
    }
    public function tostring(){
        return "soy un perro".parent::getNombre();
    }
}

$miPerrito = new Perro("Puppy", 4);

print($miPerrito->getNombre());
echo "<br>";
print($miPerrito->getEdad());
echo "<br>";
print($miPerrito->tostring());

$miPerrito2 = new Perro("Dalmata", 6);

print($miPerrito2->getNombre());
echo "<br>";
print($miPerrito2->getEdad());
echo "<br>";
print($miPerrito2->tostring());