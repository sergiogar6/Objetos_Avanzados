package org.example.ud6practica1;

import java.util.Random;
import java.util.Scanner;

public class Bizum extends MetodoPago {

    private String telefono;
    private final int longitud_telefono = 9;
    private int pin;

    public Bizum() {
        Random random = new Random();
        this.telefono = Tienda.preguntarTexto("Introduce tu numero de telefono:");
        this.pin = random.nextInt(1000000);
    }

    @Override
    public void procesarPago(double importe) {
        System.out.println("Procesando pago de " + importe + " € con Bizum");
    }

    public boolean validarBizum() {
        if (telefono.length() == longitud_telefono) {
            Scanner entry = new Scanner(System.in);
            System.out.println("Introduce el PIN: ");
            int pinIntroducido = entry.nextInt();

            if (pinIntroducido != pin) {
                System.out.println("El PIN introducido no coincide");
                return false;
            }
        } else {
            System.out.println("El formato del telefono introducido NO es correcto");
            return false;
        }
        return true;
    }
}
