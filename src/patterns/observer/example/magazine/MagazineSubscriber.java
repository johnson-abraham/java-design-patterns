package patterns.observer.example.magazine;

import patterns.observer.Observable;
import patterns.observer.Observer;

public class MagazineSubscriber implements Observer<String> {
  public MagazineSubscriber(Observable<String> observable) {
    observable.registerObserver(this);
  }

  @Override
  public void getNotification(String updatedValue) {
    System.out.println("New article: " + updatedValue);
  }
}
