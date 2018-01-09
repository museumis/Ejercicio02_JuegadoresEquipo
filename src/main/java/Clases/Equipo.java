package Clases;

import java.util.ArrayList;

/**
 * Clase equipo
 * @author Ismael Martin
 *
 */
public class Equipo {
	private String nombre;
	private String categoria;
	private String pais;
	private String estadio;
	private ArrayList<Jugador> jugadores;
	
	//Constructor
	public Equipo() {
		// TODO Auto-generated constructor stub
	}

	public Equipo(String nombre, String categoria, String pais, String estadio, ArrayList<Jugador> jugadores) {
	
		this.nombre = nombre;
		this.categoria = categoria;
		this.pais = pais;
		this.estadio = estadio;
		this.jugadores = jugadores;
	}
	
	//Informacion
	@Override
	public String toString() {
	String data = "Equipo -> "+this.nombre + "\nSu categoría es "+ this.categoria +",en "+this.pais+",juega en el estadio "+this.estadio+".";
	for (int i = 0; i < jugadores.size(); i++) {
		data += jugadores.get(i);
	}
	return data;
	}

	//Get and Set
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getEstadio() {
		return estadio;
	}

	public void setEstadio(String estadio) {
		this.estadio = estadio;
	}

	public ArrayList<Jugador> getJugadores() {
		return jugadores;
	}

	public void setJugadores(ArrayList<Jugador> jugadores) {
		this.jugadores = jugadores;
	}
	
	
	
}
