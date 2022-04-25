package gestion;
import java.util.ArrayList;

// Clase.
public class Zoologico {
	
	// Atributos.
	private String nombre;
	private String ubicacion;
	private ArrayList<Zona> zonas = new ArrayList<Zona>() ;
	
	// Getters and Setters.
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getUbicacion() {
		return ubicacion;
	}
	
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	
	public ArrayList<Zona> getZonas() {
		return zonas;
	}
	
	public void setZonas(ArrayList<Zona> zonas) {
		this.zonas = zonas;
	}
	
	// Constructor.
	public Zoologico(String nombre, String ubicacion) {
		this.nombre = nombre;
		this.ubicacion = ubicacion;
	}
	
	// Métodos.
	public void agregarZonas(Zona zona) {
		this.zonas.add(zona);
	}
	
	public int cantidadTotalAnimales() {
		int suma = 0;
		for(int i = 0; i < this.zonas.size(); i++) {
			suma += this.zonas.get(i).cantidadAnimales();
		}
		return suma;
	}
}