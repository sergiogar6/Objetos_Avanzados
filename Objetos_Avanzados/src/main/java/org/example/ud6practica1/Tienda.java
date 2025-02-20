package org.example.ud6practica1;

import java.util.Scanner;

public class Tienda {
    public static Scanner entry = new Scanner(System.in);
    public static void realizarPago(MetodoPago metodo, double importe) {
        metodo.procesarPago(importe);
    }

    public static void iniciarPago() {
        Scanner entry = new Scanner(System.in);
        System.out.println("¿Que metodo de pago quieres utilizar? [Bizum, Paypal, Tarjeta]");
        String metodo = entry.next().toLowerCase();
        MetodoPago metodopago;

        switch (metodo) {
            case "bizum":
                System.out.println("Introduce los datos de tu Bizum");
                metodopago = new Bizum();
                if (((Bizum) metodopago).validarBizum()) {
                    realizarPago(metodopago, preguntarImporte());
                }
                break;

            case "paypal":
                System.out.println("Introduce los datos de tu PayPal:");
                metodopago = new PayPal();
                double importe = preguntarImporte();
                if (((PayPal) metodopago).validarPaypal(importe)) {
                    realizarPago(metodopago, importe);
                }
                break;

            case "tarjeta":
                System.out.println("Introduce los datos de tu tarjeta:");
                metodopago = new TarjetaCredito();
                 if (((TarjetaCredito) metodopago).validarTarjeta()) {
                     realizarPago(metodopago, preguntarImporte());
                 }
                break;
            default:
                System.out.println("Metodo desconocido");
                break;
        }
    }

    public static String preguntarTexto(String mensaje) {
        System.out.println(mensaje);
        return entry.next();
    }

    public static double preguntarImporte() {
        System.out.println("Introduce el importe a pagar");
        return entry.nextDouble();
    }
}
