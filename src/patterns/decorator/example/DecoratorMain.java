package patterns.decorator.example;

import patterns.decorator.Chocobar;
import patterns.decorator.IceCream;
import patterns.decorator.ToastedMarshmellows;
import patterns.decorator.WaffleCone;

public class DecoratorMain {
  public static void main(String[] args) {
    IceCream chocobar = new Chocobar();
    System.out.println("Price of Chocobar without toppings: " + chocobar.getPrice());

    IceCream toppedChocobar = new ToastedMarshmellows(new WaffleCone(chocobar));
    System.out.println("Price of Chocobar with toppings: " + toppedChocobar.getPrice());
  }
}
