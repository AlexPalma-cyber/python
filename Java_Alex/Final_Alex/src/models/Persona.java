package models;

/*deberá agregar 5 comentarios explicando el contenido de la clase. Los comentarios corresponden a los bloques de código.*/
public class Persona {
//Comentario 1: Se crearon 3 constructores 1 de tipo int para cargar el numero de la cedulo, luego 2 de tipo string para ingresar los datos de nombre y apellido.

private int cedula;
private String nombre;
private String apellido;

public Persona() {
	
}
//Comentario 2: Se llamo a una funcion de la clase persona, donde se integran con setCedula, los datos a cargar y se creo, las variables de nombre y apellido, para luego llamarlas en las sigtes funciones.
public Persona(int c){
   setCedula(c);
   nombre = new String("Desconocido"); 
   apellido = new String("desconocido");
}
   public Persona(int c, String n, String a)
   {
   setCedula(c); 
   setNombre(n); 
   setApellido(a);
   }
//Comentario 3: Se creo una funcion de validacion de la cedula, para que sea mayor a 500000
public void setCedula (int c) {
if (c > 500000) cedula = c; 
else c = 525000;
}

//Comentario 4:
public void setNombre(String n) {
   if (n.equals("")) //Comentario 6: Se crearon las funciones de setNombre y setApellido, para llamar los datos cargados para luego imprimirlos.
   {
      System.out.println("Nombre no valido, se asignó Desconocido"); 
      nombre = new String("Desconocido");
   }
   else nombre = n; 
 }
public void setApellido (String a) {
   if (a.equals(""))
   {
      System.out.println("Apellio no valido, se asignó desconocido"); 
      apellido = new String("desconocido");
   }
   else apellido = a;
}

public int getCedula() { return cedula; }

public String getNombre(){ return nombre; }

public String getApellido(){ return apellido; }

//Comentario 5: En este apartado se retorna e imprime los datos ya incluidos para tener; cedula, nombre y apellido impresos.
@Override
public String toString() {
     return cedula + "," + nombre + ","+ apellido;
}

}
