package Sistema_de_Autenticacion;

public class Main {
    public static void main(String[] args) {
        ServicioAutenticacion autenticacionLocal = new AutenticacionLocal();
        GestorAutenticacion gestorLocal = new GestorAutenticacion(autenticacionLocal);
        gestorLocal.autenticarUsuario("usuario_local", "12345");

        ServicioAutenticacion autenticacionOAuth = new AutenticacionOAuth();
        GestorAutenticacion gestorOAuth = new GestorAutenticacion(autenticacionOAuth);
        gestorOAuth.autenticarUsuario("usuario_oauth", "oauth123");
    }
}
