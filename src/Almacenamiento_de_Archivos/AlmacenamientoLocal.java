package Almacenamiento_de_Archivos;

import java.util.HashMap;
import java.util.Map;

public class AlmacenamientoLocal implements Almacenamiento {
    private final Map<String, String> sistemaArchivos = new HashMap<>();

    @Override
    public void guardarArchivo(String nombre, String contenido) {
        sistemaArchivos.put(nombre, contenido);
        System.out.println("Archivo guardado localmente: " + nombre);
    }

    @Override
    public String recuperarArchivo(String nombre) {
        String contenido = sistemaArchivos.get(nombre);
        if (contenido != null) {
            System.out.println("Archivo recuperado localmente: " + nombre);
            return contenido;
        } else {
            System.out.println("Archivo no encontrado localmente: " + nombre);
            return null;
        }
    }
}
