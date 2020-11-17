package template;

abstract public class DataMiner {


    public void mine(String path) {

        String file = openFile(path);
        String rawData = extractData(file);
        String data = parseDate(rawData);
        String analysis = analyzeDate(data);
        sendReport(analysis);
        closeFile(file);

    }

    protected String openFile(String path) {
        System.out.println("file open: " + path);
        return path;
    }

    abstract protected String extractData(String path);

    abstract protected String parseDate(String path);

    private String analyzeDate(String path) {
        System.out.println("analyze file: " + path);
        return path;
    }

    private void sendReport(String path) {
        System.out.println("send file: " + path);
    }

    private void closeFile(String path) {
        System.out.println("file close: " + path);

    }

}
