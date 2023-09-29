package Views;

import controllers.EmpleadoController;

public class EmpleadoWiew {

	public static void main(String[] args) {

		String empleado = new EmpleadoController().createEmpleado("Molina", "Paolo", 25, "M", 300.0);
		
		
		//String empleado = new EmpleadoController().deleteEmpleado(1);
		
		
	    //String empleado = new EmpleadoController().updateEmpleado(2, "Morales");
		System.out.print(empleado);
		
	}

	
}
