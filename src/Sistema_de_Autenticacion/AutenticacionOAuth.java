package Sistema_de_Autenticacion;

public class AutenticacionOAuth implements ServicioAutenticacion {
    @Override
    public boolean autenticar(String usuario, String contraseña) {
        System.out.println("Autenticando mediante OAuth al usuario: " + usuario);
        return "usuario_oauth".equals(usuario) && "oauth123".equals(contraseña);
    }
}
