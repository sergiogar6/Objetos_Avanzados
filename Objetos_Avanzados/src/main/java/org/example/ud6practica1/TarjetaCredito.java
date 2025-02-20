package org.example.ud6practica1;

import java.util.Arrays;

public class TarjetaCredito extends MetodoPago {

    private String num_tarjeta;
    private String tipo;
    private final String[] tipos_validos = {"VISA","MASTERCARD","MAESTRO"};
    private final int longitud_num = 16;

    public TarjetaCredito() {
        this.num_tarjeta = Tienda.preguntarTexto("Número (16 digitos)");
        this.tipo = Tienda.preguntarTexto("Tipo (VISA, MASTERCARD O MAESTRO)");
    }

    @Override
    public void procesarPago(double importe) {
        System.out.println("Procesando pago de importe: " + importe + " con tarjeta de credito " + this.tipo);

    }

    public boolean validarTarjeta() {
        System.out.println("Validando tarjeta...");
        if (num_tarjeta.length() != longitud_num || !Arrays.asList(tipos_validos).contains(tipo.toUpperCase())) {
            System.out.println("Los datos de la tarjeta no son correctos");
            return false;
        }
        return true;
    }
}
