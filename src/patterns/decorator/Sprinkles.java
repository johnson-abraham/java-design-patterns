package patterns.decorator;

public class Sprinkles extends Topping {
  public Sprinkles() {
    super("Sprinkles");
  }

  public Sprinkles(IceCream iceCream) {
    super(iceCream, "Sprinkles");
  }

  @Override
  public double getPrice() {
    return 4.5 + getIceCream().getPrice();
  }
}
