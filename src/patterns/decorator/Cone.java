package patterns.decorator;

public class Cone extends IceCream {
  public Cone() {
    super("Cone");
  }

  @Override
  public double getPrice() {
    return 35;
  }
}
