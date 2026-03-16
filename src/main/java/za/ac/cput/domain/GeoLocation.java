package za.ac.cput.domain;

public class GeoLocation {

    private double latitude;
    private double longitude;

    public GeoLocation (double latitude, double longitude){
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }
    public String getLocation(){
        return "Latitude: " + latitude + ", Longitude: " + longitude;
    }
}
