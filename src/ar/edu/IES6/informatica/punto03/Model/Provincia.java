package ar.edu.IES6.informatica.punto03.Model;

import ar.edu.IES6.informatica.punto03.util.Region;

public class Provincia {
	private int identificador;
    private String nombre;
    private Region region;
    private int poblacion;
    private int superficie;
    private boolean estado;
        
    public Provincia(int identificador, String nombre, Region region, int poblacion, int superficie, boolean estado) {
		super();
		this.identificador = identificador;
		this.nombre = nombre;
		this.region = region;
		this.poblacion = poblacion;
		this.superficie = superficie;
		this.estado = estado;
	}

	public double calcularDesnsidadPoblacion() {
    	return this.poblacion / this.superficie;
    	}
    
    public int getIdentificador() {
		return identificador;
	}
	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Region getRegion() {
		return region;
	}
	public void setRegion(Region region) {
		this.region = region;
	}
	public int getPoblacion() {
		return poblacion;
	}
	public void setPoblacion(int poblacion) {
		this.poblacion = poblacion;
	}
	public int getSuperficie() {
		return superficie;
	}
	public void setSuperficie(int superficie) {
		this.superficie = superficie;
	}
	public boolean isEstado() {
		return estado;
	}
	public void setEstado(boolean estado) {
		this.estado = estado;
	}

}
