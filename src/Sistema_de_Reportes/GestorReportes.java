package Sistema_de_Reportes;

public class GestorReportes {
    private final GeneradorReporte generadorReporte;

    public GestorReportes(GeneradorReporte generadorReporte) {
        this.generadorReporte = generadorReporte;
    }

    public void generarReporte(String datos) {
        generadorReporte.generar(datos);
    }
}