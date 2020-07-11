package patterns.strategy.example;

import patterns.strategy.Runnable;
import patterns.strategy.Vehicle;

public class Car extends Vehicle {
  public Car(Runnable runnable) {
    super(runnable);
  }
}
