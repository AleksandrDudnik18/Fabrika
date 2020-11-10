package Singletone;

public class DB {

    private static DB instance;

    private DB() {
        System.out.println("constructor");
    }

    public static DB getInstance() {
        if (instance == null) {
            instance = new DB();
        }
        return instance;
    }
}
