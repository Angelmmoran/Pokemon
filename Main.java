public class Main {
	
	public static void main (String[] args) {
		
		PokemonAgua squirtle = new PokemonAgua ("Squirtle",  25, "Kanto", "Pistola Agua", "Agua", "Placaje", "Normal");
		
		PokemonFuego charmander = new PokemonFuego ("Charmander", 20, "Kanto", "Ascuas", "Fuego", "Arañazo", "Normal");
		
		PokemonPlanta bulbasaur = new PokemonPlanta ("Bulbasaur", 80, "Kanto","Látigo Cepa", "Planta",  "Golpe Cuerpo" , "Normal");
		
		Entrenador Ash = new Entrenador ("Ash", 200, 8, "Pueblo Paleta", charmander);
		
		Entrenador Brock = new Entrenador ("Brock", 150, 5, "Ciudad Plateada", bulbasaur);
		
		Entrenador Misty = new Entrenador ("Misty", 120, 6, "Ciudad Celeste", squirtle);
		
		Combate combate1 = new Combate (Ash, Misty); 
		combate1.comenzarCombate();				
		
		Combate combate2 = new Combate (Brock, Ash);
		combate2.comenzarCombate();
	
	}
		
	
	
}
