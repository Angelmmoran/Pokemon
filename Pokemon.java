public class Pokemon {
	
	protected String nombre; 
	protected int nivel;	 
	protected String region;
	protected String mote;
	protected String ataque;
	protected String tipo;
	
	
	public Pokemon (String nombre, int nivel, String region) {
		
		this.nombre = nombre;
		this.nivel = nivel;
		this.region = region;
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
	
	public String getRegion() {
		return region;
	}
	
	public void setRegion(String region) {
		this.region = region;
	}
	
	public String getMote() {
		return mote;
	}
	
	public String getAtaque() {
		return ataque;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	@Override			
	public String toString() {
		return nombre;
	}
	
}