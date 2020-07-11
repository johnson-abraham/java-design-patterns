package patterns.strategy;

public class NormalRunBehavior implements Runnable {
  @Override
  public void run() {
    System.out.println("Running normally...");
  }
}
