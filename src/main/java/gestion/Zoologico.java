package gestion;
import java.util.ArrayList;

// Clase.
public class Zoologico {
	
	// Atributos.
	private String nombre;
	private String ubicacion;
	private static ArrayList<Zona> zonas = new ArrayList<Zona>() ;
	
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
	
	public static ArrayList<Zona> getZona() {
		return zonas;
	}
	
	public void setZonas(ArrayList<Zona> zonas) {
		Zoologico.zonas = zonas;
	}
	
	// Metodos.
	public void agregarZonas(Zona zona) {
		Zoologico.zonas.add(zona);
	}
	
	public int cantidadTotalAnimales() {
		int sum = 0;
		for(int i = 0; i < zonas.size(); i++) {
			sum += zonas.get(i).cantidadAnimales();
		}
		return sum;
	}
}