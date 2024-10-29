package Pokemon;

import java.util.Random;

public class Pokemon {
    String tipo;
    String nombre;
    int nivel;
    int poder_ataque;
    int poder_defensa;
    int velocidad;

    public Pokemon() {}

    public Pokemon(Tipo t, String n, int nv, int pda, int pde, int v) {
        this.tipo = t;
        this.nombre = n;
        this.nivel = nv;
        this.poder_ataque = pda;
        this.poder_defensa = pde;
        this.velocidad = v;
    }

    public int atacar() {
        return 0;
    }

    public boolean esquivar() {
        return true;
    }

    public void set_vida(int v) {
    }

    public int get_vida() {
        return 0;
    }
}
