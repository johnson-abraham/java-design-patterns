package patterns.strategy;

public class NoFlyBehavior implements Flyable {
    @Override
    public void fly() {
        throw new UnsupportedOperationException("This thing cannot fly");
    }
}
