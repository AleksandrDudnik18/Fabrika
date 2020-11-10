package Proxy;

public class Client {

    private DbInterface dbInterface;

    public Client(DbInterface dbInterface) {
        this.dbInterface = dbInterface;
    }

    protected void getFromDb(String inputString) {
        dbInterface.getFromDb(inputString);
    }


    protected void putToDb(String inputString) {

        dbInterface.putToDb(inputString);

    }
}
