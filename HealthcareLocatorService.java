import java.util.ArrayList;
import java.util.List;

class HealthcareLocatorService {
    private List<HealthcareProvider> healthcareProviders;

    public HealthcareLocatorService() {
        healthcareProviders = new ArrayList<>();
        healthcareProviders.add(new HealthcareProvider("Hospital A", "123 Main St, City A", "123-456-7890", 40.123, -74.456, true));
        healthcareProviders.add(new HealthcareProvider("Hospital B", "456 Elm St, City B", "987-654-3210", 41.789, -72.345, false));
        // Add more healthcare providers...
    }

    public List<HealthcareProvider> findNearbyHealthcareProviders(double userLatitude, double userLongitude, double radius) {
        List<HealthcareProvider> nearbyProviders = new ArrayList<>();

        for (HealthcareProvider provider : healthcareProviders) {
            double distance = calculateDistance(userLatitude, userLongitude, provider.getLatitude(), provider.getLongitude());

            if (distance <= radius) {
                nearbyProviders.add(provider);
            }
        }

        return nearbyProviders;
    }

    private double calculateDistance(double lat1, double lon1, double lat2, double lon2) {
        double earthRadius = 6371; // in kilometers

        double dLat = Math.toRadians(lat2 - lat1);
        double dLon = Math.toRadians(lon2 - lon1);

        double a = Math.sin(dLat / 2) * Math.sin(dLat / 2)
                + Math.cos(Math.toRadians(lat1)) * Math.cos(Math.toRadians(lat2))
                * Math.sin(dLon / 2) * Math.sin(dLon / 2);

        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));

        return earthRadius * c;
    }
}
