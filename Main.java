public class Main {
	
	public static void main (String[] args) {
		
		PokemonAgua squirtle = new PokemonAgua ("Squirtle",  25, "Kanto", "Caracolillo", "Pistola Agua");
		
		PokemonFuego charmander = new PokemonFuego ("Charmander", 20, "Kanto", "Lagarto", "Ascuas");
		
		PokemonPlanta bulbasaur = new PokemonPlanta ("Bulbasaur", 80, "Kanto", "Lechuguilla","Látigo Cepa");
		
		Entrenador Ash = new Entrenador ("Ash", 200, 8, "Pueblo Paleta", charmander);
		
		Entrenador Brock = new Entrenador ("Brock", 150, 5, "Ciudad Plateada", bulbasaur);
		
		Entrenador Misty = new Entrenador ("Misty", 120, 6, "Ciudad Celeste", squirtle);
		
		Combate combate1 = new Combate (Ash, Misty); 
		combate1.comenzarCombate();				
		
		Combate combate2 = new Combate (Ash, Brock);
		combate2.comenzarCombate();
		
		Combate combate3 = new Combate (Brock, Misty);
		combate3.comenzarCombate();
	}
		
	
	
}
