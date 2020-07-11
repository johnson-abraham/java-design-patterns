package patterns.decorator;

public class WaffleCone extends Topping {
  private final IceCream iceCream;

  public WaffleCone(IceCream iceCream) {
    super("Waffle Cone");
    this.iceCream = iceCream;
  }

  @Override
  public double getPrice() {
    return 12.5 + iceCream.getPrice();
  }
}
