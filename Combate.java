import java.util.Random;

public class Combate {

    private Entrenador entrenador1;
    private Entrenador entrenador2;

    public Combate(Entrenador entrenador1, Entrenador entrenador2) {
        this.entrenador1 = entrenador1;
        this.entrenador2 = entrenador2;
    }
//Presentación de los entrenadores y los Pokemon del combate
    public void comenzarCombate() {
        System.out.println("----------------------------------");
        System.out.println("Entrenador: " + entrenador1.getNombre() + ", Experiencia: " + entrenador1.getExperiencia() + ", Medallas: " + entrenador1.getMedallas() + ", Origen: " + entrenador1.getOrigen());
        System.out.println("Pokémon que entrena: " + "Nombre: " + entrenador1.getPokemon().getNombre() + " , Nivel: " + entrenador1.getPokemon().getNivel() + ", Tipo: " + entrenador1.getPokemon().getTipo() + ", Vida: " + entrenador1.getPokemon().getVida());
        System.out.println("Ataques: " + entrenador1.getPokemon().getAtaque1() + " y " + entrenador1.getPokemon().getAtaque2());
        System.out.println("");
        System.out.println("Entrenador: " + entrenador2.getNombre() + ", Experiencia: " + entrenador2.getExperiencia() + ", Medallas: " + entrenador2.getMedallas() + ", Origen: " + entrenador2.getOrigen());
        System.out.println("Pokémon que entrena: " + "Nombre: " + entrenador2.getPokemon().getNombre() + " , Nivel: " + entrenador2.getPokemon().getNivel() + ", Tipo: " + entrenador2.getPokemon().getTipo() + ", Vida: " + entrenador2.getPokemon().getVida());
        System.out.println("Ataques: " + entrenador2.getPokemon().getAtaque1() + " y " + entrenador2.getPokemon().getAtaque2());
        System.out.println(" ");
        System.out.println(entrenador1.getPokemon().getNombre() + " CONTRA " + entrenador2.getPokemon().getNombre());
        System.out.println("¡Que comience el combate!");
        System.out.println("----------------------------------");

        int vidaPK1 = entrenador1.getPokemon().getVida();
        int vidaPK2 = entrenador2.getPokemon().getVida();

        System.out.println("Vida " + entrenador1.getPokemon().getNombre() + " : " + vidaPK1);
        System.out.println("Vida " + entrenador2.getPokemon().getNombre() + " : " + vidaPK2);

        String tipoPK1 = entrenador1.getPokemon().getTipo().toLowerCase();
        String tipoPK2 = entrenador2.getPokemon().getTipo().toLowerCase();

        String tipoAtaque1PK1 = entrenador1.getPokemon().getTipoAtaque1().toLowerCase();
        String tipoAtaque2PK1 = entrenador1.getPokemon().getTipoAtaque2().toLowerCase();

        String tipoAtaque1PK2 = entrenador2.getPokemon().getTipoAtaque1().toLowerCase();
        String tipoAtaque2PK2 = entrenador2.getPokemon().getTipoAtaque2().toLowerCase();

        int danoBasePK1 = 10;
        int danoBasePK2 = 10;
        
        int turno = 0;

        while (vidaPK1 > 0 && vidaPK2 > 0) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Ha ocurrido un error durante la ejecución del programa");
                Thread.currentThread().interrupt();
                return;
            }

            Random random = new Random();
            int ataqueSeleccionadoPK1 = random.nextInt(2) + 1;
            int ataqueSeleccionadoPK2 = random.nextInt(2) + 1;

            //  Turno Pokémon 1 
            turno = turno + 1;
            System.out.println("\n------------------------------------");
            System.out.println("Turno Nº " + turno);
            System.out.println("Turno de " + entrenador1.getPokemon().getNombre());
            System.out.println("------------------------------------");

            String nombreAtaquePK1;
            String tipoAtaqueActualPK1;
            int danoEfectivoPK1 = danoBasePK1;

            if (ataqueSeleccionadoPK1 == 1) {
                nombreAtaquePK1 = entrenador1.getPokemon().getAtaque1();
                tipoAtaqueActualPK1 = tipoAtaque1PK1;
            } else {
                nombreAtaquePK1 = entrenador1.getPokemon().getAtaque2();
                tipoAtaqueActualPK1 = tipoAtaque2PK1;
            }
            System.out.println(entrenador1.getPokemon().getNombre() + " va a usar " + nombreAtaquePK1);

            // Lógica de efectividad para el ataque de Pokemon 1 contra Pokemon 2
            // Reglas de super efectivo (+10 daño)
            if (tipoAtaqueActualPK1.equals("fuego") && tipoPK2.equals("planta")) {
                danoEfectivoPK1 += 10;
                System.out.println("¡Es muy efectivo!");
            } else if (tipoAtaqueActualPK1.equals("agua") && tipoPK2.equals("fuego")) {
                danoEfectivoPK1 += 10;
                System.out.println("¡Es muy efectivo!");
            } else if (tipoAtaqueActualPK1.equals("planta") && tipoPK2.equals("agua")) {
                danoEfectivoPK1 += 10;
                System.out.println("¡Es muy efectivo!");
            }
            // Reglas de poco efectivo (-5 daño)
            else if (tipoAtaqueActualPK1.equals("planta") && tipoPK2.equals("fuego")) {
                danoEfectivoPK1 -= 5;
                System.out.println("No es muy efectivo...");
            } else if (tipoAtaqueActualPK1.equals("fuego") && tipoPK2.equals("agua")) {
                danoEfectivoPK1 -= 5;
                System.out.println("No es muy efectivo...");
            } else if (tipoAtaqueActualPK1.equals("agua") && tipoPK2.equals("planta")) {
                danoEfectivoPK1 -= 5;
                System.out.println("No es muy efectivo...");
            }
            
          
            if (danoEfectivoPK1 < 1) {
                danoEfectivoPK1 = 1;
            }

            System.out.println(entrenador1.getPokemon().getNombre() + " hace " + danoEfectivoPK1 + " de daño a " + entrenador2.getPokemon().getNombre());
            vidaPK2 = vidaPK2 - danoEfectivoPK1;

            if (vidaPK2 < 0) {
                vidaPK2 = 0;
            }

            System.out.println("Vida " + entrenador1.getPokemon().getNombre() + " : " + vidaPK1);
            System.out.println("Vida " + entrenador2.getPokemon().getNombre() + " : " + vidaPK2);

            if (vidaPK2 <= 0) {
                System.out.println(entrenador2.getPokemon().getNombre() + " ha sido debilitado.");
                break;
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Ha ocurrido un error durante la ejecución del programa");
                Thread.currentThread().interrupt();
                return;
            }

            //  Turno Pokémon 2 
            turno = turno + 1;
            System.out.println("\n------------------------------------");
            System.out.println("Turno Nº " + turno);
            System.out.println("Turno de " + entrenador2.getPokemon().getNombre());
            System.out.println("------------------------------------");

            String nombreAtaquePK2;
            String tipoAtaqueActualPK2;
            int danoEfectivoPK2 = danoBasePK2;

            if (ataqueSeleccionadoPK2 == 1) {
                nombreAtaquePK2 = entrenador2.getPokemon().getAtaque1();
                tipoAtaqueActualPK2 = tipoAtaque1PK2;
            } else {
                nombreAtaquePK2 = entrenador2.getPokemon().getAtaque2();
                tipoAtaqueActualPK2 = tipoAtaque2PK2;
            }
            System.out.println(entrenador2.getPokemon().getNombre() + " va a usar " + nombreAtaquePK2);

            // Lógica de efectividad para el ataque de Pokemon 2 contra Pokemon 1
            // Reglas de super efectivo (+10 daño)
            if (tipoAtaqueActualPK2.equals("agua") && tipoPK1.equals("fuego")) {
                danoEfectivoPK2 += 10;
                System.out.println("¡Es muy efectivo!");
            } else if (tipoAtaqueActualPK2.equals("fuego") && tipoPK1.equals("planta")) {
                danoEfectivoPK2 += 10;
                System.out.println("¡Es muy efectivo!");
            } else if (tipoAtaqueActualPK2.equals("planta") && tipoPK1.equals("agua")) {
                danoEfectivoPK2 += 10;
                System.out.println("¡Es muy efectivo!");
            }
            // Reglas de poco efectivo (-5 daño)
            else if (tipoAtaqueActualPK2.equals("planta") && tipoPK1.equals("fuego")) {
                danoEfectivoPK2 -= 5;
                System.out.println("No es muy efectivo...");
            } else if (tipoAtaqueActualPK2.equals("fuego") && tipoPK1.equals("agua")) {
                danoEfectivoPK2 -= 5;
                System.out.println("No es muy efectivo...");
            } else if (tipoAtaqueActualPK2.equals("agua") && tipoPK1.equals("planta")) {
                danoEfectivoPK2 -= 5;
                System.out.println("No es muy efectivo...");
            }

           
            if (danoEfectivoPK2 < 1) {
                danoEfectivoPK2 = 1;
            }

            System.out.println(entrenador2.getPokemon().getNombre() + " hace " + danoEfectivoPK2 + " de daño a " + entrenador1.getPokemon().getNombre());
            vidaPK1 = vidaPK1 - danoEfectivoPK2;

            if (vidaPK1 < 0) {
                vidaPK1 = 0;
            }

            System.out.println("Vida " + entrenador1.getPokemon().getNombre() + " : " + vidaPK1);
            System.out.println("Vida " + entrenador2.getPokemon().getNombre() + " : " + vidaPK2);

            if (vidaPK1 <= 0) {
                System.out.println(entrenador1.getPokemon().getNombre() + " ha sido debilitado.");
                break;
            }
        }

        System.out.println("\n----------------------------------");
        System.out.println("¡Combate finalizado! Ha durado " + turno + " turnos.");
        if (vidaPK1 > 0) {
            System.out.println(entrenador1.getPokemon().getNombre() + " ha ganado el combate!");
            System.out.println("Vida restante de " + entrenador1.getPokemon().getNombre() + ": " + vidaPK1);
        } else if (vidaPK2 > 0) {
            System.out.println(entrenador2.getPokemon().getNombre() + " ha ganado el combate!");
            System.out.println("Vida restante de " + entrenador2.getPokemon().getNombre() + ": " + vidaPK2);
        } else {
            System.out.println("¡Ambos Pokémon han sido debilitados! Es un empate.");
        }
        System.out.println("----------------------------------");
        
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println("Ha ocurrido un error durante la ejecución del programa");
            Thread.currentThread().interrupt();
            return;
        }
    }
}