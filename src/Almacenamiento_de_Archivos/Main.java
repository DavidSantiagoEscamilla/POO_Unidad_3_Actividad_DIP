package Almacenamiento_de_Archivos;

public class Main {
    public static void main(String[] args) {
        
        Almacenamiento local = new AlmacenamientoLocal();
        Gestor_de_Archivos gestorLocal = new Gestor_de_Archivos(local);
        gestorLocal.guardar("documento1.txt", "Contenido local");
        System.out.println(gestorLocal.recuperar("documento1.txt"));

        // Usar almacenamiento en la nube
        Almacenamiento nube = new AlmacenamientoNube();
        Gestor_de_Archivos gestorNube = new Gestor_de_Archivos(nube);
        gestorNube.guardar("documento2.txt", "Contenido en la nube");
        System.out.println(gestorNube.recuperar("documento2.txt"));
    }
}
