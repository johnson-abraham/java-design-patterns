package patterns.observer.example.magazine;

import patterns.observer.Observable;
import patterns.observer.Observer;

public class MagazineMain {
  public static void main(String[] args) {
    Observable<String> observable = new Magazine();
    Observer<String> subscriber1 = new MagazineSubscriber(observable);
    Observer<String> subscriber2 = new MagazineSubscriber(observable);

    observable.update("Article #1");
    observable.update("Article #2");
  }
}
