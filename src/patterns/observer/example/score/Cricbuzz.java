package patterns.observer.example.score;

import patterns.observer.Observable;
import patterns.observer.Observer;

public class Cricbuzz implements Observer<Integer> {
  public Cricbuzz(Observable<Integer> observable) {
    observable.registerObserver(this);
  }

  @Override
  public void getNotification(Integer updatedValue) {
    System.out.println("Changed score in cricbuzz: " + updatedValue);
  }
}
