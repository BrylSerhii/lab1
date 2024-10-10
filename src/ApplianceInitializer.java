import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ApplianceInitializer {
    public static void initializeAppliancesFromFile(Apartment apartment, String filePath) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String line;

        while ((line = reader.readLine()) != null) {
            String[] data = line.split(",");
            String type = data[0];
            String name = data[1];
            double power = Double.parseDouble(data[2]);

            Appliance appliance = null;
            switch (type) {
                case "Fridge":
                    appliance = new Fridge(name, power);
                    break;
                case "TV":
                    appliance = new TV(name, power);
                    break;
            }

            if (appliance != null) {
                apartment.addAppliance(appliance);
            }
        }
        reader.close();
    }
}
