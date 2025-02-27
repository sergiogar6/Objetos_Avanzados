package org.example.ud6practica2;

public class Masajista extends MutxamelFC {
    private String titulacion;
    private int edad;

    public Masajista(String titulacion, int edad) {
        this.titulacion = titulacion;
        this.edad = edad;
    }

    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void darMasaje(Jugador jugador) {

    }


}
