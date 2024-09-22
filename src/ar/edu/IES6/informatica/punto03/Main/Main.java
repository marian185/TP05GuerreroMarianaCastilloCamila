package ar.edu.IES6.informatica.punto03.Main;

import ar.edu.IES6.informatica.punto03.Model.Provincia;
import ar.edu.IES6.informatica.punto03.util.Region;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Provincia[] provincias = new Provincia[10];
		
        provincias[0] = new Provincia(1, "Buenos Aires", Region.CENTRO, 16000123, 308000, true);
        provincias[1] = new Provincia(2, "Salta", Region.NOA, 160000111, 308045, false);
        provincias[2] = new Provincia(3, "Jujuy", Region.NOA, 16000222, 308056, true);
        provincias[3] = new Provincia(4, "Tucuman", Region.NOA, 16000333, 308078, false);
        provincias[4] = new Provincia(5, "Neuquen", Region.PATAGONIA, 16000099, 308000, true);
        provincias[5] = new Provincia(6, "Formosa", Region.NEA, 16000444, 308010, true);
        provincias[6] = new Provincia(7, "Chaco", Region.NOA, 16000556, 308011, false);
        provincias[7] = new Provincia(8, "Entre Ríos", Region.NEA, 16000345, 308012, false);
        provincias[8] = new Provincia(9, "Chubut", Region.PATAGONIA, 1600678, 308013, true);
        provincias[9] = new Provincia(10, "Santa Cruz", Region.PATAGONIA, 16000910, 308001, false);

        
        // Mostrar provincias con estado true
       
        for (Provincia provincia : provincias) {
            if (provincia.isEstado()) {
                System.out.println("Nombre: " + provincia.getNombre() + ", Región: " + provincia.getRegion() + ", Población: " + provincia.getPoblacion()
                        + ", Superficie: " + provincia.getSuperficie() + ", Densidad: " + provincia.calcularDesnsidadPoblacion());
            }  
        }
	}

}
