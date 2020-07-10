package patterns.observer;

public class ObserverPatternMain {
  public static void main(String... args) {
    Observable<Integer> observable = new Score();
    Observer<Integer> scoreboard = new Scoreboard(observable);
    Observer<Integer> cricbuzz = new Cricbuzz(observable);

    observable.update(10);
    observable.update(100);

    observable.removeObserver(cricbuzz);

    observable.update(200);
  }
}
