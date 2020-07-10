package patterns.observer;

public interface Observer<T> {
  void getNotified(T updatedValue);
}
