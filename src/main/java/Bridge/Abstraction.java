package Bridge;

public class Abstraction {

    private OperationSystem operationSystem;

    public Abstraction(OperationSystem operationSystem) {
        this.operationSystem = operationSystem;
    }

    void featureOne() {

        operationSystem.createTable();
        operationSystem.openWindow();
        operationSystem.pushButton();

    }

    void featureTwo() {

        operationSystem.createTable();


    }

    void featureThird() {

        operationSystem.createTable();
        operationSystem.openWindow();

    }

}
