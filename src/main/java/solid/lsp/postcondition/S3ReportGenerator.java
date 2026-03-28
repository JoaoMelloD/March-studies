package solid.lsp.postcondition;

public class S3ReportGenerator implements ReportGeneratorInterface{
    @Override
    public String generate() {
        // Codigo para gerar o relatório e salvar no s3 da AWS
        String filekey = "s3_reports_txt";
        return "http://s3.amazonaws.com/mybucket/" + filekey;
    }
}
