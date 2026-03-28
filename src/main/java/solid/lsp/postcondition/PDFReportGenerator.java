package solid.lsp.postcondition;

public class PDFReportGenerator implements ReportGeneratorInterface{
    @Override
    public String generate() {
        // Codigo para gerar o relatorio em PDF
        return "/reports/report.pdf";
    }
}
