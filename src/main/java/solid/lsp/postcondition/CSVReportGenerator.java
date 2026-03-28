package solid.lsp.postcondition;

public class CSVReportGenerator implements ReportGeneratorInterface{

    @Override
    public String generate() {
        //Codigo para gerar relatorio CSV
        //Retorna o path da onde foi gerado o csf
        return "/reports/report.csf";
    }
}
