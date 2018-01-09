package Clases;

/**
 * Clase Jugador
 * 
 * @author Ismael Martin R
 *
 */
public class Jugador {
	private String nombre;
	private String apellidos;
	private String nacionalidad;
	private String posicion;
	private int dorsal;

	// Constructor
	public Jugador() {
	}

	public Jugador(String nombre, String apellidos, String nacionalidad, String posicion, int dorsal) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.nacionalidad = nacionalidad;
		this.posicion = posicion;
		this.dorsal = dorsal;
	}

	// Informacion
	@Override
	public String toString() {
		return "\n--------------\n + " + this.nombre + " " + this.apellidos + ", " + this.nacionalidad + ", "
				+ this.posicion + ", n:" + this.dorsal;
	}
	//Get and Set
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public String getPosicion() {
		return posicion;
	}

	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}

	public int getDorsal() {
		return dorsal;
	}

	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}
	

}
