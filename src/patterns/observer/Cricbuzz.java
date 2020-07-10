package patterns.observer;

public class Cricbuzz implements Observer<Integer> {
  public Cricbuzz(Observable<Integer> observable) {
    observable.registerObserver(this);
  }

  @Override
  public void getNotified(Integer updatedValue) {
    System.out.println("Changed score in cricbuzz: " + updatedValue);
  }
}
