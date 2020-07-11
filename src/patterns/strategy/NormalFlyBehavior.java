package patterns.strategy;

public class NormalFlyBehavior implements Flyable {
  @Override
  public void fly() {
    System.out.println("Flying normally...");
  }
}
