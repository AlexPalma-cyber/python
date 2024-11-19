package models;

public class libro extends material {
	public libro(int codigo, String autor, String titulo, int anio, String estado, String editorial) {
		super(codigo, autor, titulo, anio, estado);
		this.editorial = editorial;
		// TODO Auto-generated constructor stub
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	private String editorial;

	@Override
	public String toString() {
		return "libro [editorial=" + editorial + ", getCodigo()=" + getCodigo() + ", getAutor()=" + getAutor() + ", getTitulo()=" + getTitulo() + ", getAnio()=" + getAnio() + ", getEstado()=" + getEstado() + "]";
	}
	
	

}
