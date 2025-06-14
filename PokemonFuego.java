public class PokemonFuego extends Pokemon{ 
	
	public String mote; 
	public String ataque1;
	public String ataque2;
	public String tipo = "Fuego";
	public String debilidad = "Agua";
	
public PokemonFuego (String nombre, int nivel, String region, String ataque1, String tipoAtaque1, String ataque2, String tipoAtaque2) {		
		super (nombre, nivel, region, tipoAtaque2, tipoAtaque2, tipoAtaque2, tipoAtaque2, tipoAtaque2);		
		this.ataque1 = ataque1;	
		this.tipoAtaque1 = tipoAtaque1;
		this.ataque2 = ataque2;	
		this.tipoAtaque2 = tipoAtaque2;
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
	
	public String getAtaque1() {
		return ataque1;
	}
	
	public void setAtaque1(String ataque1) {
		this.ataque1 = ataque2;
	}
	
	public String getAtaque2() {
		return ataque2;
	}
	
	public void setAtaque2(String ataque2) {
		this.ataque2 = ataque2;
	}
	
	public String getTipo() {
		return tipo;
	}
}