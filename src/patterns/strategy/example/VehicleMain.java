package patterns.strategy.example;

import patterns.strategy.Runnable;
import patterns.strategy.*;

public class VehicleMain {
  public static void main(String[] args) {
    Runnable normalRunnable = new NormalRunBehavior();
    Flyable normalFlyable = new NormalFlyBehavior();

    Vehicle car = new Car(normalRunnable);
    Vehicle aeroplane = new Aeroplane(normalRunnable, normalFlyable);

    car.run();
    aeroplane.run();
    aeroplane.fly();

    try {
      car.fly();
    } catch (UnsupportedOperationException e) {
      e.printStackTrace();
    }
  }
}
