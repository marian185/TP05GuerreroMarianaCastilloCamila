package ar.edu.IES6.informatica.punto02.Main;

import java.util.ArrayList;

import ar.edu.IES6.informatica.punto02.Model.Efemeride;
import ar.edu.IES6.informatica.punto02.util.Mes;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Efemeride> efemerides = new ArrayList<>();
	       
		efemerides.add(new Efemeride(1, "Cumpleaños", Mes.ENERO, 24, "Cumple Mari"));
		efemerides.add(new Efemeride(2, "Aniversario", Mes.FEBRERO, 2, "Virgen de la Candelaria"));
		efemerides.add(new Efemeride(3, "Navidad", Mes.DICIEMBRE, 24, "Se junta la familia"));
		efemerides.add(new Efemeride(4, "Fiesta Patronales", Mes.OCTUBRE, 1, "Fiesta de Puesto Viejo"));
		efemerides.add(new Efemeride(5, "Dia de la Madre", Mes.OCTUBRE, 18, "Se junta la familia"));
		
		System.out.println("Listado de efemerides");
		for (Efemeride efemeride : efemerides) {
			System.out.println("Nombre: "+ efemeride.getNombre() + ", Dia: "+ efemeride.getDia()+ ", Mes "+ efemeride.getMes());
		}
		
	    // Eliminar la 3ra efemeride 
	       efemerides.remove(2);

	    // Modificar la 2da efemeride
	    
	    Efemeride efemeride2 = efemerides.get(1);
	    efemeride2.setNombre("Dia de la Virgen");
	    efemeride2.setDetalle("Aniversario Virgen de Urkupinia");
	    

	    // Mostrar las 4 efemérides restantes
	    System.out.println("Listado de efemerides despues de las modificaciones:");
	    for (Efemeride efemeride : efemerides) {
	    	efemeride.mostrarDatos();
	    	}

	}

}
