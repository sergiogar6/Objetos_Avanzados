package org.example.ud6practica2;

public class Entrenador extends MutxamelFC implements AccionesDeportivas {
    private Equipos equipo;
    private String formacionPreferida;

    public Entrenador(Equipos equipo, String formacionPreferida) {
        this.equipo = equipo;
        this.formacionPreferida = formacionPreferida;
    }

    public Equipos getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipos equipo) {
        this.equipo = equipo;
    }

    public String getFormacionPreferida() {
        return formacionPreferida;
    }

    public void setFormacionPreferida(String formacionPreferida) {
        this.formacionPreferida = formacionPreferida;
    }

    public void planificarEntrenamiento() {

    }

    public void hacerCambios() {

    }

    @Override
    public void entrenar() {

    }

    @Override
    public void jugarPartido(String rival) {

    }
}
