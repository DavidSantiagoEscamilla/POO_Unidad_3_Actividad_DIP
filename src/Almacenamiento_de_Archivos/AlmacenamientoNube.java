package Almacenamiento_de_Archivos;

import java.util.HashMap;
import java.util.Map;

public class AlmacenamientoNube implements Almacenamiento {
    private final Map<String, String> nubeArchivos = new HashMap<>();

    @Override
    public void guardarArchivo(String nombre, String contenido) {
        nubeArchivos.put(nombre, contenido);
        System.out.println("Archivo guardado en la nube: " + nombre);
    }

    @Override
    public String recuperarArchivo(String nombre) {
        String contenido = nubeArchivos.get(nombre);
        if (contenido != null) {
            System.out.println("Archivo recuperado desde la nube: " + nombre);
            return contenido;
        } else {
            System.out.println("Archivo no encontrado en la nube: " + nombre);
            return null;
        }
    }
}
