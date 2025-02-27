package org.example.ud6practica2;

public class Acompañante extends MutxamelFC {
    private Jugador integrante;
    private String parentesco;

    public Acompañante(Jugador integrante, String parentesco) {
        this.integrante = integrante;
        this.parentesco = parentesco;
    }

    public Jugador getIntegrante() {
        return integrante;
    }

    public void setIntegrante(Jugador integrante) {
        this.integrante = integrante;
    }

    public String getParentesco() {
        return parentesco;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }

    public void animarEquipo() {

    }
}
