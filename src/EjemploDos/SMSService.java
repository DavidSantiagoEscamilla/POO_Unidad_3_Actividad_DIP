package EjemploDos;

public class SMSService implements ServicioNotificacion {
    @Override
    public void enviarMensaje(String destinatario, String mensaje) {
    System.out.println("Enviando SMS a: " + destinatario);
    System.out.println("Mensaje: " + mensaje);
    }
}
