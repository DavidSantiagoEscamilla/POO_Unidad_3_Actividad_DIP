package EjemploUno;

public class Paypal implements MetodoPago {
    @Override
    public void procesarPago(double monto) {
    System.out.println("Procesando pago con PayPal: $" + monto);
    }
}