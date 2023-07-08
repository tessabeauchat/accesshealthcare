import java.util.List;

public class Main {
    public static void main(String[] args) {
        HealthcareLocatorService locatorService = new HealthcareLocatorService();

        double userLatitude = 40.456;
        double userLongitude = -73.123;
        double radius = 10;

        List<HealthcareProvider> nearbyProviders = locatorService.findNearbyHealthcareProviders(userLatitude, userLongitude, radius);

        for (HealthcareProvider provider : nearbyProviders) {
            System.out.println("Name: " + provider.getName());
            System.out.println("Address: " + provider.getAddress());
            System.out.println("Phone: " + provider.getPhoneNumber());
            System.out.println("Is Free or Low Cost: " + (provider.isFreeOrLowCost() ? "Yes" : "No"));
            System.out.println("--------------------------------------");
        }
    }
}
