package question1;

public class Cook {
    private Strategy strategy;

    public RiceCookingWays cookRice(){
        return strategy.cookRice();
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
}
