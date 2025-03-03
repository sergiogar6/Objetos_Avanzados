package org.example.ud6practica2;

public class Entrenador extends MutxamelFC implements AccionesDeportivas {
    private Equipos equipo;
    private String formacionPreferida;

    public Entrenador(String nombre, int edad, Equipos equipo, String formacionPreferida) {
        super(nombre, edad);
        this.equipo = equipo;
        setFormacionPreferida(formacionPreferida);
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
        if (!formacionPreferida.matches("\\d-\\d-\\d")) {
            throw new FormatoFormacionException("Error: La formación '" + formacionPreferida + "' no tiene el formato N-N-N");
        } else {
            this.formacionPreferida = formacionPreferida;
        }

    }

    public void planificarEntrenamiento() {
        System.out.println("El entrenador " + this.nombre + " esta planificando el entrenamiento para el equipo");
    }

    public void hacerCambios() {
        System.out.println("El entrenador " + this.nombre + " realiza cambios en el equipo");
    }

    @Override
    public void entrenar() {
        System.out.println("El entrenador " + this.nombre + " esta entrenado al equipo " + this.equipo);
    }

    @Override
    public void jugarPartido(String rival) {

    }
}
