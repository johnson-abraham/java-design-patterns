package patterns.observer;

public class Scoreboard implements Observer<Integer> {
    public Scoreboard(Observable<Integer> observable) {
        observable.registerObserver(this);
    }

    @Override
    public void getNotified(Integer updatedValue) {
        System.out.println("Changed score in scoreboard: " + updatedValue);
    }
}
