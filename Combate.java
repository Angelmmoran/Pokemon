import java.util.Scanner;

public class Combate {
	
	private Entrenador entrenador1; 
	private Entrenador entrenador2;
	
	
	public Combate (Entrenador entrenador1, Entrenador entrenador2) {
		this.entrenador1 = entrenador1;
		this.entrenador2 = entrenador2;
		
	}
	
	
	public void comenzarCombate() {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println ("----------------------------------");
		System.out.println("Entrenador: " + entrenador1.getNombre() + ", Experiencia: " + entrenador1.getExperiencia() + ", Medallas: " + entrenador1.getMedallas() + ", Origen: " + entrenador1.getOrigen());
		System.out.println("Pokémon que entrena: " + "Nombre: " + entrenador1.getPokemon() + " , Nivel: " + entrenador1.getPokemon().getNivel() + ", Tipo: " + entrenador1.getPokemon().getTipo() + ", Vida: " + entrenador1.getPokemon().getVida());
		System.out.println("Ataques: " + entrenador1.getPokemon().getAtaque1() + " y " +  entrenador1.getPokemon().getAtaque2());
		System.out.println("");
		System.out.println("Entrenador: " + entrenador2.getNombre() + ", Experiencia: " + entrenador2.getExperiencia() + ", Medallas: " + entrenador2.getMedallas() + ", Origen: " + entrenador2.getOrigen());
		System.out.println("Pokémon que entrena: " + "Nombre: " + entrenador2.getPokemon() + " , Nivel: " + entrenador2.getPokemon().getNivel() + ", Tipo: " + entrenador2.getPokemon().getTipo() + ", Vida: " + entrenador2.getPokemon().getVida());
		System.out.println("Ataques: " + entrenador2.getPokemon().getAtaque1() + " y " + entrenador2.getPokemon().getAtaque2());
		System.out.println(" ");
		System.out.println(entrenador1.getPokemon() + " (Nivel: " + entrenador1.getPokemon().getNivel() + ") CONTRA " + entrenador2.getPokemon() + " (Nivel: " + entrenador2.getPokemon().getNivel() + ")");
		System.out.println ("¡Que comienze el combate!");
		System.out.println ("----------------------------------");
		
		int ataque;
			
		do {
            System.out.println("Entrenador, elige qué ataque usará tu Pokémon: " +
                               "(1) " + entrenador1.getPokemon().getAtaque1() + " o " +
                               "(2) " + entrenador1.getPokemon().getAtaque2() + ":");

           
            if (scanner.hasNextInt()) { 
                ataque = scanner.nextInt(); 
                scanner.nextLine(); 

                
                if (ataque != 1 && ataque != 2) {
                    System.out.println("¡Error! Por favor, introduce 1 o 2 para seleccionar un ataque.");
                }
            } else { 
                System.out.println("¡Entrada inválida! Por favor, introduce un número (1 o 2).");
                scanner.nextLine(); 
                ataque = 0; 
            }

        } while (ataque != 1 && ataque != 2); 

        System.out.println("Has elegido el ataque número: " + ataque);
        
        switch (ataque) {
        
        case 1:
        	
        	String tipo1 = ( entrenador1.getPokemon().getTipoAtaque1());
        	
        	String tipo1LowerCase = tipo1.toLowerCase();
        	
        	 System.out.println(tipo1LowerCase);
        	
        	break;
        }
        
        
        scanner.close();
	
}
	
}

