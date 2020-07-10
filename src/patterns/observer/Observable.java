package patterns.observer;

public interface Observable<T> {
  boolean registerObserver(Observer<T> observer);

  boolean removeObserver(Observer<T> observer);

  void notifyObservers();

  void update(T newValue);
}
