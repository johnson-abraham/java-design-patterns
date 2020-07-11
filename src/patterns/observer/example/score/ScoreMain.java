package patterns.observer.example.score;

import patterns.observer.Observable;
import patterns.observer.Observer;

public class ScoreMain {
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
