
public class Entrenador {
	
	private String nombre;   
	private int experiencia;
	private int medallas;
	private String origen;
	private Pokemon pokemon;
	
	public Entrenador (String nombre, int experiencia, int medallas, String origen, Pokemon pokemon) {
		this.nombre = nombre;
		this.experiencia = experiencia;
		this.medallas = medallas;
		this.origen = origen;
		this.pokemon = pokemon;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getExperiencia() {
		return experiencia;
	}
	
	public void setExperiencia(int experiencia) {
		this.experiencia = experiencia;
	}
	
	public int getMedallas() {
		return medallas;
	}
	
	public void setMedallas(int medallas) {
		this.medallas = medallas;
	}
	
	public String getOrigen() {
		return origen;
	}
	
	public void setOrigen(String origen) {
		this.origen = origen;
	}
	
	public Pokemon getPokemon() {
		return pokemon;
	}
	
	public void setPokemon(Pokemon pokemon) {
		this.pokemon = pokemon;
	}
}
