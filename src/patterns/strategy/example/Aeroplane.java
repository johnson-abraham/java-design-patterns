package patterns.strategy.example;

import patterns.strategy.Flyable;
import patterns.strategy.Runnable;
import patterns.strategy.Vehicle;

public class Aeroplane extends Vehicle {
  public Aeroplane(Runnable runnable, Flyable flyable) {
    super(runnable, flyable);
  }
}
