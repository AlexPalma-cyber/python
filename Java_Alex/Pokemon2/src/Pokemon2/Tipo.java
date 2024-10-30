// Tipo.java
package Pokemon2;

public class Tipo {
    private String tipo; // Convierte tipo en private para encapsulamiento

    public Tipo() {}

    public Tipo(String tipo) {
        this.tipo = tipo;
    }

    public void setTipo(String t) {
        this.tipo = t;
    }

    public String getTipo() {
        return this.tipo;
    }
}

