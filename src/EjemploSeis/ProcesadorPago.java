package EjemploSeis;

public class ProcesadorPago {
    private TarjetaCredito tarjeta;
    public ProcesadorPago(TarjetaCredito tarjeta) {
    this.tarjeta = tarjeta;
    }
    public void realizarPago(double monto) {
    tarjeta.procesarPago(monto);
    }
}