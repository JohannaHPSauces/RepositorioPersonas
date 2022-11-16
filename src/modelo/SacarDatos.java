package modelo;


public class SacarDatos {

	public static void main(String[] args) {
		//Creamos un objeto de persona y le metemos datos
		Persona p=  new Persona("Florentino","Flores", "Jardines",55);
		
		String nombre=p.getNombre();
		String apellido1=p.getApellido1();
		String apellido2=p.getApellido2();
		int edad=p.getEdad();
		
		System.out.print("Tu nombre es "+nombre+" te apellidas "+apellido1+" "+apellido2+" y tienes "+edad+" años");

	}

}
