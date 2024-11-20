package Sistema_de_Reportes;

public class ReportePDF implements GeneradorReporte {
    @Override
    public void generar(String datos) {
        System.out.println("Generando reporte en formato PDF con los datos: " + datos);
    }
}