package patterns.observer.example.score;

import patterns.observer.Observable;
import patterns.observer.Observer;

public class Scoreboard implements Observer<Integer> {
    public Scoreboard(Observable<Integer> observable) {
        observable.registerObserver(this);
    }

    @Override
    public void getNotification(Integer updatedValue) {
        System.out.println("Changed score in scoreboard: " + updatedValue);
    }
}
