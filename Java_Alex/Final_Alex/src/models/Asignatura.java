package models;


public class Asignatura { 
	static int codigo;
    static String nombre;

    public Asignatura() {
    	
    }

	public static int getCodigo() {
		return codigo;
	}

	public static void setCodigo(int codigo) {
		Asignatura.codigo = codigo;
	}

	public static String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		Asignatura.nombre = nombre;
	}

	public Asignatura(int codigo, String nombre) {
		super();
		Asignatura.codigo = codigo;
		Asignatura.nombre = nombre;
		
	}

	public static void getCodigo(int i) {
		// TODO Auto-generated method stub
		
	}
    
    
    
/*implementar contructor vacío y otro que reciba ambos parámetros,
y los metodos getters and setters necesarios, según los atributos indicados*/
}