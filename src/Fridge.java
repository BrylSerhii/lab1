public class Fridge extends Appliance {
    public Fridge(String name, double power) {
        super(name, power);
    }

    @Override
    public String getType() {
        return "Fridge";
    }
}
