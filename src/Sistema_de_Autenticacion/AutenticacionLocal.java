package Sistema_de_Autenticacion;

public class AutenticacionLocal implements ServicioAutenticacion {
    @Override
    public boolean autenticar(String usuario, String contraseña) {
        System.out.println("Autenticando localmente al usuario: " + usuario);
        return "usuario_local".equals(usuario) && "12345".equals(contraseña);
    }
}
