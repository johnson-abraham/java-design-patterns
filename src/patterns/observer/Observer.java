package patterns.observer;

public interface Observer<T> {
  void getNotification(T updatedValue);
}
