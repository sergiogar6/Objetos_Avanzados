package org.example.ud6practica2;

public abstract class MutxamelFC implements FuncionesIntegrantes {
    private String nombre;
    private int edad;

    @Override
    public void concentrarse() {
        System.out.println(this.nombre + " se concentra para el partido...");
    }

    @Override
    public void viajar(String ciudad) {
        System.out.println("Viajando a " + ciudad);
    }

    @Override
    public void celebrarGol() {
        System.out.println("GOOOOOOOOOOL");
    }
}
