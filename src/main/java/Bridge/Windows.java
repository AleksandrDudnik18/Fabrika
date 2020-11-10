package Bridge;

public class Windows implements OperationSystem {
    @Override
    public void openWindow() {
        System.out.println("window opened in windows");
    }

    @Override
    public void pushButton() {
        System.out.println("button pushed in windows");
    }

    @Override
    public void createTable() {
        System.out.println("table created in windows");
    }
}
