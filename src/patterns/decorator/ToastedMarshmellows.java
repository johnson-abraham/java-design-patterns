package patterns.decorator;

public class ToastedMarshmellows extends Topping {
  private final IceCream iceCream;

  public ToastedMarshmellows(IceCream iceCream) {
    super("Toasted Marshmellows");
    this.iceCream = iceCream;
  }

  @Override
  public double getPrice() {
    return 10 + iceCream.getPrice();
  }
}
