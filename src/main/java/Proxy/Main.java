package Proxy;

public class Main {

    public static void main(String[] args) {

        Db dataBase = new Db();
        DbProxy dataBaseProxy = new DbProxy(dataBase);

        dataBaseProxy.getFromDb("injection");

        dataBaseProxy.getFromDb("test");

        dataBaseProxy.putToDb("test");

        dataBaseProxy.putToDb("injection");

    }

}
