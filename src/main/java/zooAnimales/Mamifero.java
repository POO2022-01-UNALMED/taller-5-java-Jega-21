package zooAnimales;
import java.util.ArrayList;

// Clase.
public class Mamifero extends Animal {
	
	// Atributos.
	private static ArrayList<Mamifero> listado = new ArrayList<Mamifero>();
	public static int caballos;
	public static int leones;
	private boolean pelaje;
	private int patas;
	
	// Getters and Setters.
	public static ArrayList<Mamifero> getListado() {
		return listado;
	}
	
	public static void setListado(ArrayList<Mamifero> listado) {
		Mamifero.listado = listado;
	}
	
	public static int getCaballos() {
		return caballos;
	}
	
	public static void setCaballos(int caballos) {
		Mamifero.caballos = caballos;
	}
	
	public static int getLeones() {
		return leones;
	}
	
	public static void setLeones(int leones) {
		Mamifero.leones = leones;
	}
	
	public boolean isPelaje() {
		return pelaje;
	}
	
	public void setPelaje(boolean pelaje) {
		this.pelaje = pelaje;
	}
	
	public int getPatas() {
		return patas;
	}
	
	public void setPatas(int patas) {
		this.patas = patas;
	}
	
	// Constructor.
	public Mamifero() {
		this("", 0, "", "", false, 0);
	}
	
	public Mamifero(String nombre, int edad, String habitat, String genero, boolean pelaje, int patas) {
		this.setNombre(nombre);
		this.setEdad(edad);
		this.setHabitat(habitat);
		this.setGenero(genero);
		this.pelaje = pelaje;
		this.patas = patas;
		Mamifero.listado.add(this);
	}
	
	// Métodos.
	public int cantidadMamiferos() {
		return Mamifero.listado.size();
	}
	
	public static Mamifero crearCaballo(String nombre, int edad, String genero) {
		Mamifero.caballos += 1;
		return new Mamifero(nombre, edad, "pradera", genero, true, 4);
	}
	
	public static Mamifero crearLeon(String nombre, int edad, String genero) {
		Mamifero.leones += 1;
		return new Mamifero(nombre, edad, "selva", genero, true, 4);
	}
}