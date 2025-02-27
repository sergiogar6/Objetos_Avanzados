package org.example.pruebas_enums;

import java.util.Arrays;
import java.util.Scanner;

public class AppPelis {

    static Scanner entry = new Scanner(System.in);

    public static void main(String[] args) {
        SagasPelis peli = SagasPelis.SHREK;
        System.out.println(peli);

        for (SagasPelis pelis : SagasPelis.values()) {
            System.out.println("Peli: " + pelis + " con " + pelis.getNum_pelis());
        }

        System.out.println("Introduce una saga " + Arrays.toString(SagasPelis.values()));
        String saga = entry.next();

        SagasPelis saga_enum = SagasPelis.valueOf(saga);
        System.out.println("La saga escogida es " + saga_enum + " con " + saga_enum.getNum_pelis() + " peliculas");

        int posicion = saga_enum.ordinal();
        System.out.println("La saga consultada esta en la posicion " + posicion);

        String saga_string = SagasPelis.CREPUSCULO.name();
        System.out.println(saga_string);
    }

}
