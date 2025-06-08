public class Combate {
	
	private Entrenador entrenador1; 
	private Entrenador entrenador2;
	
	
	public Combate (Entrenador entrenador1, Entrenador entrenador2) {
		this.entrenador1 = entrenador1;
		this.entrenador2 = entrenador2;
		
	}
	
	
	public void comenzarCombate() {
		System.out.println("Entrenador: " + entrenador1.getNombre() + ", Experiencia: " + entrenador1.getExperiencia() + ", Medallas: " + entrenador1.getMedallas() + ", Origen: " + entrenador1.getOrigen());
		System.out.println("Pokémon que entrena: " + "Nombre: " + entrenador1.getPokemon() + ", Mote: " + entrenador1.getPokemon().getMote() + " , Nivel: " + entrenador1.getPokemon().getNivel() + ", Tipo: " + entrenador1.getPokemon().getTipo());
		System.out.println("Ataque: " + entrenador1.getPokemon().getAtaque());
		System.out.println("");
		System.out.println("Entrenador: " + entrenador2.getNombre() + ", Experiencia: " + entrenador2.getExperiencia() + ", Medallas: " + entrenador2.getMedallas() + ", Origen: " + entrenador2.getOrigen());
		System.out.println("Pokémon que entrena: " + "Nombre: " + entrenador2.getPokemon() + ", Mote: " + entrenador2.getPokemon().getMote() + " , Nivel: " + entrenador2.getPokemon().getNivel() + ", Tipo: " + entrenador2.getPokemon().getTipo());
		System.out.println("Ataque: " + entrenador2.getPokemon().getAtaque());
		System.out.println(" ");
		System.out.println(entrenador1.getPokemon() + " (Nivel: " + entrenador1.getPokemon().getNivel() + ") CONTRA " + entrenador2.getPokemon() + " (Nivel: " + entrenador2.getPokemon().getNivel() + ")");
		System.out.println ("¡Que comienze el combate!");
		
		if (entrenador1.getPokemon().getNivel() > entrenador2.getPokemon().getNivel()) {
			System.out.println("El ganador es: " + entrenador1.getPokemon().toString() + " del entrenador " + entrenador1.getNombre());
			System.out.println(" ");
		} 
		else if (entrenador1.getPokemon().getNivel() < entrenador2.getPokemon().getNivel()) {
			System.out.println("El ganador es: " + entrenador2.getPokemon().toString() + " del entrenador " + entrenador2.getNombre());
			System.out.println(" ");
		}
		else {
			System.out.println("¡Empate! Ambos Pokemon tienen el mismo nivel");
			System.out.println(" ");
		}
	}
		
}

