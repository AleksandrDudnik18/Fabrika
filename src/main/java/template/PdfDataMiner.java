package template;

public class PdfDataMiner extends DataMiner{

    @Override
    protected String extractData(String path) {
        System.out.println("extract data PDF file: " + path);
        return path;
    }

    @Override
    protected String parseDate(String path) {
        System.out.println("parse data PDF file: " + path);
        return path;
    }
}
