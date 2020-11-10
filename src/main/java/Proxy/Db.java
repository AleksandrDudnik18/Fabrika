package Proxy;

public class Db implements DbInterface{
    @Override
    public void getFromDb(String inputString) {
        System.out.println(inputString);
    }

    @Override
    public void putToDb(String inputString) {
        System.out.println(inputString);
    }
}
