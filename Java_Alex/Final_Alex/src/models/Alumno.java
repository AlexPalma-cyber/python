package models;


/*deberá agregar 1 comentario explicando el contenido de la clase*/
//Comentario 1: Esta clase contiene los datos del alumno, conectado a la clase persona, trayendo los datos como institucion y asignatura
public class Alumno extends Persona {

    private String institucion;
    private String materias;

    // Constructor vacío
    public Alumno() {
        super(); // Llama al constructor vacío de la clase Persona
    }

    // Constructor con parámetros para la clase y la superclase
    public Alumno(String nombre, int cedula, String institucion, String materias) {
        super(cedula); // Llama al constructor de la superclase Persona
        this.institucion = institucion;
        this.materias = materias;
    }

    // Getter para institucion
    public String getInstitucion() {
        return institucion;
    }

    // Setter para institucion
    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }

    // Getter para materias
    public String getMaterias() {
        return materias;
    }

    // Setter para materias
    public void setMaterias(String string) {
        this.materias = string;
    }
}

/*agregar el constructor vacío y otro que recibe los parámetos para
la clase y la superclase
Agregar los métodos GET y SET necesarios
*/
