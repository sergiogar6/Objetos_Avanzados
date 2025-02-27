package org.example.excepciones;

public class ExcepcionesMain {
    public static void main(String[] args) throws NivelValidoException {
        int nivel = 150;
        if (nivel > 100) {
            throw new NivelValidoException("El nivel no puede ser mayor que 100");
        }
    }
}
