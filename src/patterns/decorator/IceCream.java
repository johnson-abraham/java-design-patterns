package patterns.decorator;

import patterns.builder.IceCreamBuilder;

public abstract class IceCream {
  private final String description;

  public IceCream(String description) {
    this.description = description;
  }

  public String getDescription() {
    return description;
  }

  public abstract double getPrice();

  public static IceCreamBuilder builder(IceCream iceCream) {
    return new IceCreamBuilder(iceCream);
  }
}
