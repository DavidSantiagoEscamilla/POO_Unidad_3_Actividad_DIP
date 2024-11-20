package Sistema_de_Reportes;

public class ReporteExcel implements GeneradorReporte {
    @Override
    public void generar(String datos) {
        System.out.println("Generando reporte en formato Excel con los datos: " + datos);
    }
}