package org.example.ud6practica2;

import java.util.ArrayList;
import java.util.Arrays;

public class AppMutxamelFC {
    public static void main(String[] args) {

        Entrenador entrenador1 = new Entrenador("Jorge", 44,Equipos.SENIOR, "4-3-4");

        Jugador jugador1 = new Jugador("Paco", 22, Equipos.SENIOR, 23, Posiciones.PORTERO);
        Jugador jugador2 = new Jugador("Pepe", 21,Equipos.SENIOR, 11, Posiciones.DEFENSA);
        Jugador jugador3 = new Jugador("Juan", 22,Equipos.SENIOR, 29, Posiciones.DELANTERO);
        Jugador jugador4 = new Jugador("Pedro", 28,Equipos.SENIOR, 3, Posiciones.CENTROCAMPISTA);

        Masajista masajista1 = new Masajista("Lucas", 22,"Masajista", 24);
        Masajista masajista2 = new Masajista("Maria", 29,"Masajista", 33);
        Masajista masajista3 = new Masajista("Roberto", 25,"Masajista", 28);

        Acompañante acompañante1 = new Acompañante("German", 18,jugador1, "Hermano");
        Acompañante acompañante2 = new Acompañante("Samuel", 55,jugador2, "Padre");

        ArrayList<Jugador> jugadores = new ArrayList<>();
        jugadores.addAll(Arrays.asList(jugador1, jugador2, jugador3, jugador4));

        ArrayList<Masajista> masajistas = new ArrayList<>();
        masajistas.addAll(Arrays.asList(masajista1, masajista2, masajista3));

        //TODOS SE CONCENTRAN
        entrenador1.concentrarse();
        for (Jugador jugador : jugadores) {
            jugador.concentrarse();
        }
        for (Masajista masajista : masajistas) {
            masajista.concentrarse();
        }
        acompañante1.concentrarse();
        acompañante2.concentrarse();
        System.out.println();

        //ENTRENADOR ENTRENA A LOS JUGADORES
        entrenador1.entrenar();
        for (Jugador jugador : jugadores) {
            jugador.entrenar();
        }
        System.out.println();

        //DAR MASAJE
        masajista1.darMasaje(jugador1);
        System.out.println();

        //VIAJAR A MADRID
        entrenador1.viajar("Madrid");
        for (Jugador jugador : jugadores) {
            jugador.viajar("Madrid");
        }
        for (Masajista masajista : masajistas) {
            masajista.viajar("Madrid");
        }
        acompañante1.viajar("Madrid");
        acompañante2.viajar("Madrid");
        System.out.println();

        //ENTRENADOR PLANIFICA ENTRENAMIENTO
        entrenador1.planificarEntrenamiento();
        System.out.println();

        //ENTRENADOR VUELVE A ENTRENAR A LOS JUGADORES
        entrenador1.entrenar();
        for (Jugador jugador : jugadores) {
            jugador.entrenar();
        }
        System.out.println();

        //LOS JUGADORES DESCANSAN DEL ENTRENAMIENTO
        for (Jugador jugador : jugadores) {
            jugador.descansar();
        }
        System.out.println();

        //LOS JUGADORES CALIENTAN
        for (Jugador jugador : jugadores) {
            jugador.calentar();
        }
        System.out.println();

        //JUEGAN PARTIDO CONTRA EL MADRID
        entrenador1.jugarPartido("REAL MADRID");
        for (Jugador jugador : jugadores) {
            jugador.jugarPartido("REAL MADRID");
        }
        System.out.println();


        //LOS ACOMPAÑANTES ANIMAN AL EQUIPO
        acompañante1.animarEquipo();
        acompañante2.animarEquipo();
        System.out.println();

        //EL ENTRENADOR HACE CAMBIOS
        entrenador1.hacerCambios();
        System.out.println();

        //EL JUGADOR 1 MARCA GOL
        jugador1.marcarGol();
        System.out.println();

        //TODOS CELEBRAN EL GOL
        entrenador1.celebrarGol();
        for (Jugador jugador : jugadores) jugador.celebrarGol();
        for (Masajista masajista : masajistas) masajista.celebrarGol();
        acompañante1.celebrarGol();
        acompañante2.celebrarGol();
        System.out.println();

        //LOS MASAJISTAS DAN VARIOS MASAJES
        masajista1.darMasaje(jugador1);
        masajista2.darMasaje(jugador2);
        masajista3.darMasaje(jugador3);
        System.out.println();

        //TODOS VUELVEN A MUTXAMEL
        entrenador1.viajar("Mutxamel");
        for (Jugador jugador : jugadores) {
            jugador.viajar("Mutxamel");
        }
        for (Masajista masajista : masajistas) {
            masajista.viajar("Mutxamel");
        }
        acompañante1.viajar("Mutxamel");
        acompañante2.viajar("Mutxamel");
        System.out.println();

        //LOS JUGADORES DESCANSAN
        for (Jugador jugador : jugadores) {
            jugador.descansar();
        }

    }
}
