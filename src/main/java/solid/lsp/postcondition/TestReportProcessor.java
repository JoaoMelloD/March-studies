package solid.lsp.postcondition;

import java.nio.file.Files;
import java.nio.file.Path;

public class TestReportProcessor {
    public void process(ReportGeneratorInterface reportGeneratorInterface){
        String path = reportGeneratorInterface.generate();

        if(!Files.exists(Path.of(path))){
            System.out.println("O arquivo não existe");
        }

        //Logica para processar o arquivo
    }
}
