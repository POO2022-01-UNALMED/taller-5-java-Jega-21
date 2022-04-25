package gestion;
import java.util.ArrayList;

// Clase.
public class Zoologico {
	
	// Atributos.
	private String nombre;
	private String ubicacion;
	private ArrayList<Zona> zonas = new ArrayList<Zona>() ;
	
	// Constructor.
		public Zoologico() {
		}
		public Zoologico(String nombre, String ubicacion) {
			this.nombre = nombre;
			this.ubicacion = ubicacion;
		}
	
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
	
	// M�todos.
	public void agregarZonas(Zona zona) {
		zonas.add(zona);
	}
	
	public int cantidadTotalAnimales() {
		int sum = 0;
		for(int i = 0; i < zonas.size(); i++) {
			sum += zonas.get(i).cantidadAnimales();
		}
		return sum;
	}
}