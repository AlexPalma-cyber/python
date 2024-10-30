package Pokemon2;


import java.util.Random;

public class Pokemon {
 String tipo;
 String nombre;
 int nivel;
 int poder_ataque;
 int poder_defensa;
 int velocidad;
 int vida;  // Nueva variable para la vida del Pokémon

 public Pokemon() {}

 public Pokemon(Tipo t, String n, int nv, int pda, int pde, int v, int vidaInicial) {
     this.tipo = t.getTipo();  // Usa el método getTipo() de la clase Tipo
     this.nombre = n;
     this.nivel = nv;
     this.poder_ataque = pda;
     this.poder_defensa = pde;
     this.velocidad = v;
     this.vida = vidaInicial; // Inicializa la vida
 }

 // Método para realizar un ataque, calcula el daño
 public int atacar() {
     Random random = new Random();
     int danioBase = (poder_ataque * nivel) / 2; // Fórmula de daño
     int variacion = random.nextInt(10) - 5; // Variación aleatoria entre -5 y 5
     return danioBase + variacion;
 }

 // Método para esquivar un ataque, probabilidad basada en la velocidad
 public boolean esquivar() {
     Random random = new Random();
     int chance = random.nextInt(100); // Genera un número entre 0 y 99
     return chance < this.velocidad; // Probabilidad de esquivar basada en la velocidad
 }

 // Métodos para establecer y obtener la vida del Pokémon
 public void set_vida(int v) {
     this.vida = Math.max(v, 0); // Evita que la vida sea negativa
 }

 public int get_vida() {
     return this.vida;
 }

 // Método para recibir un ataque y calcular el daño recibido
 public void recibir_ataque(int danio) {
     int danioReal = danio - this.poder_defensa; // Daño neto después de la defensa
     danioReal = Math.max(danioReal, 0); // Evita daño negativo
     set_vida(this.vida - danioReal); // Reduce la vida
 }
}
