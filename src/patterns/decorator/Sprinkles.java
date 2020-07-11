package patterns.decorator;

public class Sprinkles extends Topping {
  private final IceCream iceCream;

  public Sprinkles(IceCream iceCream) {
    super("Sprinkles");
    this.iceCream = iceCream;
  }

  @Override
  public double getPrice() {
    return 4.5 + iceCream.getPrice();
  }
}
