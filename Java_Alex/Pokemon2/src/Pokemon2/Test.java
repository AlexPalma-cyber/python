package Pokemon2;


public class Test {
 public static void main(String[] args) {
     // Crear tipos de Pokémon
     Tipo tipoFuego = new Tipo("Fuego");
     Tipo tipoAgua = new Tipo("Agua");

     // Crear instancias de Pokémon con sus atributos
     Pokemon charmander = new Pokemon(tipoFuego, "Charmander", 5, 10, 8, 15, 50); // Pokémon de tipo Fuego
     Pokemon squirtle = new Pokemon(tipoAgua, "Squirtle", 5, 8, 10, 12, 55); // Pokémon de tipo Agua

     // Mostrar información inicial de los Pokémon
     System.out.println("Charmander - Vida: " + charmander.get_vida() + ", Ataque: " + charmander.poder_ataque + ", Defensa: " + charmander.poder_defensa + ", Velocidad: " + charmander.velocidad);
     System.out.println("Squirtle - Vida: " + squirtle.get_vida() + ", Ataque: " + squirtle.poder_ataque + ", Defensa: " + squirtle.poder_defensa + ", Velocidad: " + squirtle.velocidad);

     // Crear un combate entre los dos Pokémon
     Combate combate = new Combate(charmander, squirtle);

     // Iniciar el combate
     combate.iniciar();
 }
}

