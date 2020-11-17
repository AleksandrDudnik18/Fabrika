package Strategy;

public class Navigator {

    private Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    protected void buildRoute(int a, int b) {
        strategy.execute(a, b);
    }

}
