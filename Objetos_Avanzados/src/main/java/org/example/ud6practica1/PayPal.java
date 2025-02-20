package org.example.ud6practica1;

public class PayPal extends MetodoPago {
    private String cuenta;
    private double saldo;
    private final String formato_cuenta = "^[A-Za-z0-9+_.-]+@+^[A-Za-z0-9+_.-]+.com$";

    @Override
    public void procesarPago(double importe) {
        System.out.println("Procesando pago de " + importe + " € con PayPal");
    }

    public boolean validarPaypal(double importe) {
        if (!cuenta.matches(formato_cuenta)) {
            System.out.println("El formato del correo introducido no es válido");
            return false;
        }
        if (saldo < importe) {
            System.out.println("Saldo insuficiente");
            return false;
        }
        return true;
    }

}
