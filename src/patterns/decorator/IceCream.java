package patterns.decorator;

public abstract class IceCream {
  private final String description;

  public IceCream(String description) {
    this.description = description;
  }

  public String getDescription() {
    return description;
  }

  public abstract double getPrice();
}
