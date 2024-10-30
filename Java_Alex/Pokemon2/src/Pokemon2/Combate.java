package Pokemon2;


public class Combate {
 Pokemon p1;
 Pokemon p2;

 public Combate(Pokemon p1, Pokemon p2) {
     this.p1 = p1;
     this.p2 = p2;
 }

 // Método para iniciar el combate
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
             int danio = atacante.atacar();
             defensor.recibir_ataque(danio);
             System.out.println(defensor.nombre + " recibe " + danio + " de daño. Vida restante: " + defensor.get_vida());
         }

         // Cambiar roles de atacante y defensor para el próximo turno
         Pokemon temp = atacante;
         atacante = defensor;
         defensor = temp;

         // Pausar para mejorar la lectura de cada turno
         try {
             Thread.sleep(1000); // Pausa de 1 segundo
         } catch (InterruptedException e) {
             e.printStackTrace();
         }
     }

     // Resultado del combate
     if (p1.get_vida() <= 0) {
         System.out.println(p1.nombre + " ha sido derrotado. " + p2.nombre + " es el ganador.");
     } else {
         System.out.println(p2.nombre + " ha sido derrotado. " + p1.nombre + " es el ganador.");
     }
 }
}

