package EjemploDos;

public class Notificador {
    private ServicioNotificacion servicioNotificacion;
    public Notificador(ServicioNotificacion servicioNotificacion) {
    this.servicioNotificacion = servicioNotificacion;
    }
    
    public void notificar(String destinatario, String mensaje) {
    servicioNotificacion.enviarMensaje(destinatario, mensaje);
    }
}
