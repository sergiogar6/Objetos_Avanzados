package org.example.ud6practica2;

public class AppMutxamelFC {
    public static void main(String[] args) {
        Jugador jugador1 = new Jugador(Equipos.SENIOR, 23, Posiciones.PORTERO);
        Jugador jugador2 = new Jugador(Equipos.SENIOR, 11, Posiciones.DEFENSA);
        Jugador jugador3 = new Jugador(Equipos.SENIOR, 29, Posiciones.DELANTERO);
        Jugador jugador4 = new Jugador(Equipos.SENIOR, 3, Posiciones.CENTROCAMPISTA);

        Entrenador entrenador1 = new Entrenador(Equipos.SENIOR, "4-3-4");

        Masajista masajista1 = new Masajista("Masajista", 24);
        Masajista masajista2 = new Masajista("Masajista", 33);
        Masajista masajista3 = new Masajista("Masajista", 28);

        Acompañante acompañante1 = new Acompañante(jugador1, "Hermano");
        Acompañante acompañante2 = new Acompañante(jugador2, "Padre");

        jugador1.concentrarse();

    }
}
