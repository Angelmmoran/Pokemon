public class Pokemon {
	
	protected String nombre; 
	protected int nivel;	 
	protected int vida = 50;
	protected String region;
	public String ataque1;
	public String tipoAtaque1;
	public String ataque2;
	public String tipoAtaque2;
	protected String tipo;
	
	
	public Pokemon (String nombre, int nivel, String region, String ataque1, String ataque2, String tipoAtaque1, String tipoAtaque2, String tipo) {
		
		this.nombre = nombre;
		this.nivel = nivel;
		this.region = region;
		this.ataque1 = ataque1;
		this.ataque2 = ataque2;
		this.tipoAtaque1 = tipoAtaque1;
		this.tipoAtaque2 = tipoAtaque2;
		this.tipo = tipo;
	}
	
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getNivel() {
		return nivel;
	}
	
	public void setNivel (int nivel) {
		this.nivel = nivel;
	}
	
	public int getVida() {
		return vida;
	}
	
	public void setVida (int vida) {
		this.vida = vida;
	}
	
	public String getRegion() {
		return region;
	}
	
	public void setRegion(String region) {
		this.region = region;
	}
	
	
	
	public String getAtaque1() {
		return ataque1;
	}
	
	public void setAtaque1 (String ataque1) {
		this.ataque1 = ataque1;
	}
	
	public String getTipoAtaque1() {
		return tipoAtaque1;
	}
	
	public void setTipoAtaque1 (String tipoAtaque1) {
		this.tipoAtaque1 = tipoAtaque1;
	}
	
	
	
	public String getAtaque2() {
		return ataque2;
	}
	
	public void setAtaque2 (String ataque2) {
		this.ataque2 = ataque2;;
	}
	
	public String getTipoAtaque2() {
		return tipoAtaque2;
	}
	
	public void setTipoAtaque2 (String tipoAtaque2) {
		this.tipoAtaque2 = tipoAtaque2;
	}
	
	
	
	public String getTipo() {
		return tipo;
	}
	
	@Override			
	public String toString() {
		return nombre;
	}
	
}