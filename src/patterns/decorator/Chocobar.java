package patterns.decorator;

public class Chocobar extends IceCream {
  public Chocobar() {
    super("Chocobar");
  }

  @Override
  public double getPrice() {
    return 20;
  }
}
