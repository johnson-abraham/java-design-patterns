package patterns.decorator;

public class ToastedMarshmellows extends Topping {
  public ToastedMarshmellows() {
    super("Toasted Marshmellows");
  }

  public ToastedMarshmellows(IceCream iceCream) {
    super(iceCream, "Toasted Marshmellows");
  }

  @Override
  public double getPrice() {
    return 10 + getIceCream().getPrice();
  }
}
