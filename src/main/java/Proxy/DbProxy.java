package Proxy;

public class DbProxy implements DbInterface {

    private Db dataBase;

    public DbProxy(Db dataBase) {
        this.dataBase = dataBase;
    }

    protected boolean checkAccess(String check) {

        return !check.contains("injection");

    }

    @Override
    public void getFromDb(String inputString) {

        if (!checkAccess(inputString)) {
            System.out.println("you don't have access!");
            return;
        }
        dataBase.getFromDb(inputString);
    }

    @Override
    public void putToDb(String inputString) {

        if (!checkAccess(inputString)) {
            System.out.println("you don't have access!");
            return;
        }
        dataBase.putToDb(inputString);

    }
}
