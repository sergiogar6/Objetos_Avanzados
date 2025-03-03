package org.example.ud6practica2;

public abstract class MutxamelFC implements FuncionesIntegrantes {
    protected String nombre;
    protected int edad;

    public MutxamelFC(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public void concentrarse() {
        System.out.println(this.nombre + " se concentra para el partido...");
    }

    @Override
    public void viajar(String ciudad) {
        System.out.println(this.nombre + " viajando a " + ciudad);
    }

    @Override
    public void celebrarGol() {
        System.out.println(this.nombre + " celebra el gol: GOOOOOOOL");
    }
}
