package template;

public class Main {
    public static void main(String[] args) {

        CsvDataMiner csvDataMiner = new CsvDataMiner();
        csvDataMiner.main("my file csv");

        System.out.println();

        PdfDataMiner pdfDataMiner = new PdfDataMiner();
        pdfDataMiner.main("my file pdf");

    }
}
