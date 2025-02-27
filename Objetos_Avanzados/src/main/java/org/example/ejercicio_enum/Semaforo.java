package org.example.ejercicio_enum;

public enum Semaforo {
    AMARILLO, ROJO, VERDE;

    public Semaforo siguiente(Semaforo pos) {
        switch (pos) {
            case ROJO :
                return VERDE;
            case VERDE :
                return AMARILLO;
            case AMARILLO :
                return ROJO;
        }
        return ROJO;
    }

    public static void main(String[] args) {
        Semaforo estado = Semaforo.ROJO;

        for (int i = 0; i < 10; i++) {
            estado = estado.siguiente(estado);
            System.out.println(estado);
        }
    }

}
