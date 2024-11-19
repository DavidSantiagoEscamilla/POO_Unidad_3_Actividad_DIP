package Almacenamiento_de_Archivos;

public class Gestor_de_Archivos {
    private final Almacenamiento almacenamiento;

    public Gestor_de_Archivos(Almacenamiento almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public void guardar(String nombre, String contenido) {
        almacenamiento.guardarArchivo(nombre, contenido);
    }

    public String recuperar(String nombre) {
        return almacenamiento.recuperarArchivo(nombre);
    }
}
