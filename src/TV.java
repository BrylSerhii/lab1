public class TV extends Appliance {
    public TV(String name, double power) {
        super(name, power);
    }

    @Override
    public String getType() {
        return "TV";
    }
}
