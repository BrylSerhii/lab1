public abstract class Appliance {
    private String name;
    private double power; // потужність у Ватах
    private boolean isPluggedIn;

    public Appliance(String name, double power) {
        this.name = name;
        this.power = power;
        this.isPluggedIn = false;
    }

    public String getName() {
        return name;
    }

    public double getPower() {
        return power;
    }

    public boolean isPluggedIn() {
        return isPluggedIn;
    }

    public void plugIn() {
        isPluggedIn = true;
    }

    public void unplug() {
        isPluggedIn = false;
    }

    public abstract String getType();
}
