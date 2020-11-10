package Bridge;

public class Linux implements OperationSystem{
    @Override
    public void openWindow() {
        System.out.println("window opened in linux");
    }

    @Override
    public void pushButton() {
        System.out.println("button pushed in linux");
    }

    @Override
    public void createTable() {
        System.out.println("table created in linux");
    }
}
