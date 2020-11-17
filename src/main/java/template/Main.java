package template;

public class Main {
    public static void main(String[] args) {

        CsvDataMiner csvDataMiner = new CsvDataMiner();
        csvDataMiner.mine("my file csv");

        System.out.println();

        PdfDataMiner pdfDataMiner = new PdfDataMiner();
        pdfDataMiner.mine("my file pdf");

    }
}
