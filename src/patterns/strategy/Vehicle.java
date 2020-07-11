package patterns.strategy;

public abstract class Vehicle implements Runnable, Flyable {
  private final Runnable runnable;
  private final Flyable flyable;

  public Vehicle(Runnable runnable) {
    this.runnable = runnable;
    this.flyable = new NoFlyBehavior();
  }

  public Vehicle(Runnable runnable, Flyable flyable) {
    this.runnable = runnable;
    this.flyable = flyable;
  }

  @Override
  public void run() {
    runnable.run();
  }

  @Override
  public void fly() {
    flyable.fly();
  }
}
