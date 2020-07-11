package patterns.observer.example.score;

import patterns.observer.Observable;
import patterns.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class Score implements Observable<Integer> {
  private final List<Observer<Integer>> observers;
  private Integer score;

  public Score() {
    this.observers = new ArrayList<>();
  }

  @Override
  public boolean registerObserver(Observer<Integer> observer) {
    return observers.add(observer);
  }

  @Override
  public boolean removeObserver(Observer<Integer> observer) {
    return observers.remove(observer);
  }

  @Override
  public void notifyObservers() {
    observers.forEach(observer -> observer.getNotification(score));
  }

  @Override
  public void update(Integer newScore) {
    this.score = newScore;
    notifyObservers();
  }
}
