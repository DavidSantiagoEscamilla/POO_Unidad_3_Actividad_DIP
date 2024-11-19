package Sistema_de_Reportes;

public class Main {
    public static void main(String[] args) {
        GeneradorReporte generadorPDF = new ReportePDF();
        GestorReportes gestorPDF = new GestorReportes(generadorPDF);
        gestorPDF.generarReporte("Datos para el reporte en PDF");

        GeneradorReporte generadorExcel = new ReporteExcel();
        GestorReportes gestorExcel = new GestorReportes(generadorExcel);
        gestorExcel.generarReporte("Datos para el reporte en Excel");
    }
}
