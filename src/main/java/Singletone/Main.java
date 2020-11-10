package Singletone;

public class Main {
    public static void main(String[] args) {

        DB.getInstance();
        DB.getInstance();
        DB.getInstance();


    }

}
