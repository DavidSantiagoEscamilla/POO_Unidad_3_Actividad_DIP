package Sistema_de_Autenticacion;

public class GestorAutenticacion {
    private final ServicioAutenticacion servicioAutenticacion;

    public GestorAutenticacion(ServicioAutenticacion servicioAutenticacion) {
        this.servicioAutenticacion = servicioAutenticacion;
    }

    public void autenticarUsuario(String usuario, String contraseña) {
        if (servicioAutenticacion.autenticar(usuario, contraseña)) {
            System.out.println("Autenticación exitosa para el usuario: " + usuario);
        } else {
            System.out.println("Autenticación fallida para el usuario: " + usuario);
        }
    }
}
