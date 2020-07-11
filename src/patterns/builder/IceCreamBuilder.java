package patterns.builder;

import patterns.decorator.IceCream;
import patterns.decorator.Topping;

public class IceCreamBuilder {
  private IceCream iceCream;

  public IceCreamBuilder(IceCream iceCream) {
    this.iceCream = iceCream;
  }

  public IceCreamBuilder addTopping(Topping topping) {
    topping.setIceCream(iceCream);
    iceCream = topping;

    return this;
  }

  public IceCream build() {
    return iceCream;
  }
}
