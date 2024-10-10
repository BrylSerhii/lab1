import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Apartment {
    private List<Appliance> appliances;

    public Apartment() {
        this.appliances = new ArrayList<>();
    }

    public void addAppliance(Appliance appliance) {
        appliances.add(appliance);
    }

    public double calculateTotalPower() {
        return appliances.stream()
                .filter(Appliance::isPluggedIn)
                .mapToDouble(Appliance::getPower)
                .sum();
    }

    public List<Appliance> sortByPower() {
        return appliances.stream()
                .sorted(Comparator.comparingDouble(Appliance::getPower))
                .collect(Collectors.toList());
    }

    public List<Appliance> findApplianceByPowerRange(double minPower, double maxPower) {
        return appliances.stream()
                .filter(a -> a.getPower() >= minPower && a.getPower() <= maxPower)
                .collect(Collectors.toList());
    }
}
