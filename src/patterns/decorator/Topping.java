package patterns.decorator;

public abstract class Topping extends IceCream {
    private IceCream iceCream;

    public Topping(String description) {
        super(description);
    }

    public Topping(IceCream iceCream, String description) {
        super(description);
        this.iceCream = iceCream;
    }

    public IceCream getIceCream() {
        return iceCream;
    }

    public void setIceCream(IceCream iceCream) {
        this.iceCream = iceCream;
    }
}
