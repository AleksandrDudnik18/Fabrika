package template;

public class CsvDataMiner extends DataMiner{



    @Override
    protected String extractData(String path) {
        System.out.println("extract data CSV file: " + path);
        return path;
    }

    @Override
    protected String parseDate(String path) {
        System.out.println("parse data CSV file: " + path);
        return path;
    }

    @Override
    protected String openFile(String path) {
        System.out.println("file CSV open " + path);
        return path;
    }

}
