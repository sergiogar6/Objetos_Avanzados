package org.example.ud6practica2;

import java.util.ArrayList;

public class Jugador extends MutxamelFC implements AccionesDeportivas {
    private Equipos categoria;
    private int dorsal;
    private Posiciones posicion;
    private static ArrayList<Integer> dorsalesEnUso = new ArrayList<>();

    public Jugador(String nombre, int edad, Equipos categoria, int dorsal, Posiciones posicion) {
        super(nombre, edad);
        this.categoria = categoria;
        setDorsal(dorsal);
        this.posicion = posicion;
    }

    public Equipos getCategoria() {
        return categoria;
    }

    public void setCategoria(Equipos categoria) {
        this.categoria = categoria;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        if (dorsalesEnUso.contains(dorsal)) {
            throw new DorsalRepetidoException("Error: El dorsal " + dorsal + " ya esta en uso por algun jugador del equipo");
        } else {
            if (dorsalesEnUso.contains(this.dorsal)) {
                dorsalesEnUso.remove(this.dorsal);
            }
            this.dorsal = dorsal;
            dorsalesEnUso.add(dorsal);
        }
    }

    public Posiciones getPosicion() {
        return posicion;
    }

    public void setPosicion(Posiciones posicion) {
        this.posicion = posicion;
    }

    public void calentar() {
        System.out.println("El jugador " + this.nombre + " está calentando...");
    }
    public void descansar() {
        System.out.println("El jugador " + this.nombre + " está descansando...");
    }
    public void marcarGol() {
        System.out.println("El jugador " + this.nombre + " ha marcado GOOOL!!!");
    }

    @Override
    public void entrenar() {
        System.out.println("El jugador " + this.nombre + " esta entrenando...");
    }

    @Override
    public void jugarPartido(String rival) {
        System.out.println("El jugador " + this.nombre + " juega contra el " + rival);
    }

    @Override
    public String toString() {
        return "Nombre: " + this.nombre + ", Edad: " + this.edad + ", Categoria: " + this.categoria + ", Dorsal: " + this.dorsal + ", Posición: " + this.posicion;
    }
}
