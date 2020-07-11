package patterns.decorator;

public class WaffleCone extends Topping {
    public WaffleCone() {
        super("Waffle Cone");
    }

    public WaffleCone(IceCream iceCream) {
        super(iceCream, "Waffle Cone");
    }

    @Override
    public double getPrice() {
        return 12.5 + getIceCream().getPrice();
    }
}
