public class PokemonPlanta extends Pokemon{ 
	
	public String mote; 
	public String ataque;
	public String tipo = "Planta";
	
public PokemonPlanta (String nombre, int nivel, String region, String mote, String ataque) {		
		super (nombre, nivel, region);	
		this.mote = mote;
		this.ataque = ataque;	
	}
	
	public void atacar (String ataque) {
		System.out.print("¡" + nombre + ",utiliza" + ataque + "!");

	}
	
	public String getMote() {
		return mote;
	}
	
	public void setMote(String mote) {
		this.mote = mote;
	}
	
	public String getAtaque() {
		return ataque;
	}
	
	public void setAtaque(String ataque) {
		this.ataque = ataque;
	}
	
	public String getTipo() {
		return tipo;
	}
	
}
