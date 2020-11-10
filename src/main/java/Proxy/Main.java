package Proxy;

public class Main {

    public static void main(String[] args) {

        Db dataBase = new Db();
        DbProxy dataBaseProxy = new DbProxy(dataBase);

        Client client = new Client(dataBase);

        client.getFromDb("injection");

        client.getFromDb("test");

        client.putToDb("test");

        client.putToDb("injection");

        System.out.println();

        Client client1 = new Client(dataBaseProxy);

        client1.getFromDb("injection");

        client1.getFromDb("test");

        client1.putToDb("test");

        client1.putToDb("injection");


//        D
//
//        dataBaseProxy.getFromDb("injection");
//
//        dataBaseProxy.getFromDb("test");
//
//        dataBaseProxy.putToDb("test");
//
//        dataBaseProxy.putToDb("injection");

    }

}
