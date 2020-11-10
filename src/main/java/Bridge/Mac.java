package Bridge;

public class Mac implements OperationSystem{
    @Override
    public void openWindow() {
        System.out.println("window opened in mac");
    }

    @Override
    public void pushButton() {
        System.out.println("button pushed in mac");
    }

    @Override
    public void createTable() {
        System.out.println("table created in mac");
    }
}
