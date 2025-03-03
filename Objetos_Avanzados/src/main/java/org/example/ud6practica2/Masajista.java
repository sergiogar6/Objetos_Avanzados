package org.example.ud6practica2;

public class Masajista extends MutxamelFC {
    private String titulacion;
    private int añosExperiencia;

    public Masajista(String nombre, int edad, String titulacion, int añosExperiencia) {
        super(nombre, edad);
        this.titulacion = titulacion;
        this.añosExperiencia = añosExperiencia;
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
        System.out.println("El masajista " + this.nombre + " le esta dando un masaje al jugador " + jugador.getNombre());
    }


}
