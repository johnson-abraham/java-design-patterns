package patterns.observer.example.magazine;

import patterns.observer.Observable;
import patterns.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class Magazine implements Observable<String> {
  private final List<Observer<String>> subscribers;
  private String article;

  public Magazine() {
    subscribers = new ArrayList<>();
  }

  @Override
  public boolean registerObserver(Observer<String> observer) {
    return subscribers.add(observer);
  }

  @Override
  public boolean removeObserver(Observer<String> observer) {
    return subscribers.remove(observer);
  }

  @Override
  public void notifyObservers() {
    subscribers.forEach(subscriber -> subscriber.getNotification(article));
  }

  @Override
  public void update(String newValue) {
    this.article = newValue;
    notifyObservers();
  }
}
