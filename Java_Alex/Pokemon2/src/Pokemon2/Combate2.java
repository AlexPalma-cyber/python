package Pokemon2;
//Combate.java con variaciones en el combate


import java.util.Random;

public class Combate2 {
 Pokemon p1;
 Pokemon p2;
 Random random = new Random();

 public Combate2(Pokemon p1, Pokemon p2) {
     this.p1 = p1;
     this.p2 = p2;
 }

 // Método para iniciar el combate con posibles variaciones de resultado
 public void iniciar() {
     System.out.println("¡El combate comienza entre " + p1.nombre + " y " + p2.nombre + "!");
     
     // Determinar quién ataca primero basado en la velocidad
     Pokemon atacante = p1.velocidad >= p2.velocidad ? p1 : p2;
     Pokemon defensor = atacante == p1 ? p2 : p1;

     // Ciclo de combate hasta que uno de los Pokémon se quede sin vida
     while (p1.get_vida() > 0 && p2.get_vida() > 0) {
         System.out.println(atacante.nombre + " ataca a " + defensor.nombre);

         // Ver si el defensor logra esquivar
         if (defensor.esquivar()) {
             System.out.println(defensor.nombre + " esquiva el ataque.");
         } else {
             // Variación en el ataque: posibilidad de golpe crítico
             int danio = atacante.atacar();
             boolean golpeCritico = random.nextInt(100) < 20; // 20% de probabilidad de crítico
             if (golpeCritico) {
                 danio *= 1.5; // Aumenta el daño en un 50% en caso de crítico
                 System.out.println("¡Golpe crítico de " + atacante.nombre + "!");
             }
             
             // Variación en el daño si el tipo es efectivo o débil contra el otro
             if (esEfectivo(atacante.tipo, defensor.tipo)) {
                 danio *= 1.2; // Aumenta en 20% si es efectivo
                 System.out.println("Es super efectivo!");
             } else if (esDebil(atacante.tipo, defensor.tipo)) {
                 danio *= 0.8; // Reduce en 20% si es débil
                 System.out.println("No es muy efectivo...");
             }

             // Aplicar el daño al defensor
             defensor.recibir_ataque((int) danio);
             System.out.println(defensor.nombre + " recibe " + (int) danio + " de daño. Vida restante: " + defensor.get_vida());
         }

         // Cambiar roles de atacante y defensor para el próximo turno
         Pokemon temp = atacante;
         atacante = defensor;
         defensor = temp;

         // Pausa para mejorar la lectura de cada turno
         try {
             Thread.sleep(1000); // Pausa de 1 segundo
         } catch (InterruptedException e) {
             e.printStackTrace();
         }
     }

     // Resultado del combate con tres resultados diferentes
     if (p1.get_vida() <= 0 && p2.get_vida() <= 0) {
         System.out.println("¡Ambos Pokémon han sido derrotados! Es un empate.");
     } else if (p1.get_vida() <= 0) {
         System.out.println(p1.nombre + " ha sido derrotado. " + p2.nombre + " es el ganador.");
     } else if (p2.get_vida() <= 0) {
         System.out.println(p2.nombre + " ha sido derrotado. " + p1.nombre + " es el ganador.");
     }
 }

 // Métodos para verificar la efectividad y debilidad de tipos
 private boolean esEfectivo(String tipoAtacante, String tipoDefensor) {
     return (tipoAtacante.equals("Fuego") && tipoDefensor.equals("Hierba")) ||
            (tipoAtacante.equals("Agua") && tipoDefensor.equals("Fuego")) ||
            (tipoAtacante.equals("Hierba") && tipoDefensor.equals("Agua"));
 }

 private boolean esDebil(String tipoAtacante, String tipoDefensor) {
     return (tipoAtacante.equals("Fuego") && tipoDefensor.equals("Agua")) ||
            (tipoAtacante.equals("Agua") && tipoDefensor.equals("Hierba")) ||
            (tipoAtacante.equals("Hierba") && tipoDefensor.equals("Fuego"));
 }
}