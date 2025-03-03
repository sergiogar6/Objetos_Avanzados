package org.example.ud6practica2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class AppMantenimiento {
    static Scanner entry = new Scanner(System.in);
    public static ArrayList<Jugador> jugadores = new ArrayList<>();

    public static void main(String[] args) {
        Jugador jugador1 = new Jugador("Paco", 22, Equipos.SENIOR, 23, Posiciones.PORTERO);
        Jugador jugador2 = new Jugador("Pepe", 21,Equipos.SENIOR, 11, Posiciones.DEFENSA);
        Jugador jugador3 = new Jugador("Juan", 22,Equipos.SENIOR, 29, Posiciones.DELANTERO);
        Jugador jugador4 = new Jugador("Pedro", 28,Equipos.SENIOR, 3, Posiciones.CENTROCAMPISTA);

        jugadores.addAll(Arrays.asList(jugador1, jugador2, jugador3, jugador4));

        while (true) {
            mainMenu();
            String opcion = entry.next();

            switch (opcion) {
                case "1":
                    System.out.println("---");
                    break;
                case "2":
                    jugadoresMenu();
                    break;
                case "3":
                    System.out.println("---");
                    break;
                case "4":
                    System.out.println("---");
                    break;
                case "X":
                    break;
            }
        }
    }


    public static void mainMenu() {
        System.out.println("=== App de mantenimiento de MUTXAMEL FC ====");
        System.out.println("[1]. Mantenimiento de jugadores");
        System.out.println("    Dentro podremos añadir jugadores, modificar datos, y añadir acompañantes (sólo seniors).");
        System.out.println("[2]. Mantenimiento de entrenadores (añadir-modificar-salir)");
        System.out.println("    Dentro podremos añadir entrenadores y modificar sus datos.");
        System.out.println("[3]. Mantenimiento de masajistas (añadir-modificar datos-salir)");
        System.out.println("    Dentro podremos añadir masajistas y modificar sus datos");
        System.out.println("[4]. Consultar equipos");
        System.out.println("    Dentro se deben listar los tipos de equipos del club y elegir uno");
        System.out.println("[X]. Salir");
        System.out.println("===========================================");
        System.out.println("Selecciona una opción:");
    }

    public static void jugadoresMenu() {
        System.out.println("=== Mantenimiento de Jugadores ===");
        System.out.println("[1]. Añadir nuevo jugador");
        System.out.println("[2]. Modificar datos de jugador existente");
        System.out.println("[3]. Crear acompañantes (sólo seniors)");
        System.out.println("[X]. Volver al menu principal");
        System.out.println("====================================");
        System.out.println("Selecciona una opción:");
        String opcion = entry.next();

        switch (opcion) {
            case "1":
                anadirJugador();
                break;
            case "2":
                modificarJugadorExistente();
                break;
            case "3":
                crearAcompanantes();
                break;
            case "X":
                break;
        }
    }
    public static void anadirJugador() {
        System.out.println("=== Añadiendo nuevo jugador. Introduce sus datos ===");
        System.out.print("Nombre:");
        String nombre = entry.next();
        System.out.print("Edad:");
        int edad = entry.nextInt();
        entry.nextLine();
        System.out.print("Categoria:");
        Equipos categoria = Equipos.valueOf(entry.next());
        System.out.print("Dorsal:");
        int dorsal = entry.nextInt();
        entry.nextLine();
        System.out.print("Posicion:");
        Posiciones posicion = Posiciones.valueOf(entry.next());

        Jugador jugador = new Jugador(nombre,edad,categoria,dorsal,posicion);
        jugadores.add(jugador);
        System.out.println("Jugador creado con exito.");
    }

    public static void modificarJugadorExistente() {
        System.out.println("=== Mantenimiento de Jugadores. Modificar datos de jugador existente ===");
        System.out.println("¿De que jugador quieres hacer cambios?");
        int count = 0;
        for (Jugador jugador : jugadores) {
            System.out.println("[" + count + "]" + jugador);
            count++;
        }
        System.out.println("====================================");
        System.out.println("Selecciona una opción:");
        int jugador = entry.nextInt();
        entry.nextLine();
        System.out.println("Modificando jugador:");
        System.out.println(jugadores.get(jugador));
        System.out.println("¿Qué quieres modificar? [nombre,edad,categoria,dorsal,posicion]");
        String opcion = entry.next();
        System.out.println("Nuevo " + opcion);
        switch (opcion) {
            case "nombre":
                String newName = entry.nextLine();
                jugadores.get(jugador).setNombre(newName);
                break;
            case "edad":
                int newEdad = entry.nextInt();
                jugadores.get(jugador).setEdad(newEdad);
                break;
            case "categoria":
                Equipos newCategoria = Equipos.valueOf(entry.nextLine());
                jugadores.get(jugador).setCategoria(newCategoria);
                break;
            case "dorsal":
                int newDorsal = entry.nextInt();
                jugadores.get(jugador).setDorsal(newDorsal);
                break;
            case "posicion":
                Posiciones newPosicion = Posiciones.valueOf(entry.next());
                jugadores.get(jugador).setPosicion(newPosicion);
                break;
        }

    }
    public static void crearAcompanantes() {
        System.out.println("=== Añadiendo nuevo acompañante. Introduce sus datos ===");
        System.out.print("Nombre:");
        String nombre = entry.next();
        System.out.print("Edad:");
        int edad = entry.nextInt();
        entry.nextLine();
        System.out.print("Parentesco:");
        String parentesco = entry.next();
        System.out.print("Introduce a quien va a acompañar:");
        String acompanante = entry.next();
        for (Jugador jugador : jugadores) {
            if (jugador.getNombre().equals(acompanante)) {
                Acompañante acompañante = new Acompañante(nombre, edad, jugador, parentesco);
            }
        }
        System.out.println("Acompañante creado con exito");

    }
}
