package Pokemon;

public class Combate {
    Pokemon p1;
    Pokemon p2;

    public Combate(Pokemon p1, Pokemon p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public void iniciar() {
        int turno = (int) (Math.random() * 2) + 1; // 1 o 2, aleatorio
        while (true) {
            if (p1.nivelvida <= 0 || p2.nivelvida <= 0) {
                if (p1.nivelvida > p2.nivelvida) {
                    System.out.println("Ganador: " + p1.nombre);
                } else if (p1.nivelvida < p2.nivelvida) {
                    System.out.println("Ganador: " + p2.nombre);
                } else {
                    System.out.println("Empate");
                }
                break;
            }
            // realizar combate
            if (turno == 2) {
                System.out.println("Ataca " + p2.nombre);
                p1.nivelvida = p1.nivelvida - p2.atacar();
                turno = 1;
            } else {
                System.out.println("Ataca " + p1.nombre);
                p2.nivelvida = p2.nivelvida - p1.atacar();
                turno = 2;
            }
            // Thread.sleep(1000); // Simular una pausa
        }
    }
}