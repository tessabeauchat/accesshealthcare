class HealthcareProvider {
    private String name;
    private String address;
    private String phoneNumber;
    private double latitude;
    private double longitude;
    private boolean isFreeOrLowCost;

    public HealthcareProvider(String name, String address, String phoneNumber, double latitude, double longitude, boolean isFreeOrLowCost) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.latitude = latitude;
        this.longitude = longitude;
        this.isFreeOrLowCost = isFreeOrLowCost;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public boolean isFreeOrLowCost() {
        return isFreeOrLowCost;
    }
}
