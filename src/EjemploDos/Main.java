package EjemploDos;

public class Main {
    public static void main(String[] args) {
    ServicioNotificacion emailService = new EmailService();
    Notificador notificador = new Notificador(emailService);
    notificador.notificar("juan@example.com", "Hola Juan!");
    ServicioNotificacion smsService = new SMSService();
    notificador = new Notificador(smsService);
    notificador.notificar("123456789", "Hola, este es un mensaje SMS.");
    }
}