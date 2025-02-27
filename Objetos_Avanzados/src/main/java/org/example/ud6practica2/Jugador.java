package org.example.ud6practica2;

public class Jugador extends MutxamelFC implements AccionesDeportivas {
    private Equipos categoria;
    private int dorsal;
    private Posiciones posicion;

    public Jugador(Equipos categoria, int dorsal, Posiciones posicion) {
        this.categoria = categoria;
        this.dorsal = dorsal;
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
        this.dorsal = dorsal;
    }

    public Posiciones getPosicion() {
        return posicion;
    }

    public void setPosicion(Posiciones posicion) {
        this.posicion = posicion;
    }

    public void calentar() {
    }
    public void descansar() {
    }
    public void marcarGol() {
    }

    @Override
    public void entrenar() {

    }

    @Override
    public void jugarPartido(String rival) {

    }
}
