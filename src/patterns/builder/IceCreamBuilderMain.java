package patterns.builder;

import patterns.decorator.Cone;
import patterns.decorator.IceCream;
import patterns.decorator.Sprinkles;
import patterns.decorator.WaffleCone;

public class IceCreamBuilderMain {
  public static void main(String[] args) {
    IceCreamBuilder iceCreamBuilder = IceCream.builder(new Cone());
    IceCream iceCream =
            iceCreamBuilder.addTopping(new WaffleCone()).addTopping(new Sprinkles()).build();

    System.out.println("Ice Cream Price: " + iceCream.getPrice());
  }
}
