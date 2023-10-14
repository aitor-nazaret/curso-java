
public class Nombres {

	public static void main(String[] args) {
	   String nombre;
	   String apellido;
	   String nombreCompleto;
	   
	   int cantidadLetrasNombre;
	   int cantidadLetrasApellido;
	   
	   nombre = "Marta";
	   apellido = "García";
	   
	   nombreCompleto = nombre + " " + apellido;
	   
	   cantidadLetrasNombre = nombre.length();
	   cantidadLetrasApellido = apellido.length();
	   
	   System.out.println("Tu nombre completo es " + nombre + " " + apellido);
	   System.out.println("Tu nombre tiene " + cantidadLetrasNombre + " letras");
	}

}
