import java.util.Random;

// Class to represent health data
class HealthData {
    private double heartRate;
    private double bodyTemperature;
    private double bloodPressure;

    public HealthData(double heartRate, double bodyTemperature, double bloodPressure) {
        this.heartRate = heartRate;
        this.bodyTemperature = bodyTemperature;
        this.bloodPressure = bloodPressure;
    }

    // Getters and setters
    public double getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(double heartRate) {
        this.heartRate = heartRate;
    }

    public double getBodyTemperature() {
        return bodyTemperature;
    }

    public void setBodyTemperature(double bodyTemperature) {
        this.bodyTemperature = bodyTemperature;
    }

    public double getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(double bloodPressure) {
        this.bloodPressure = bloodPressure;
    }
}

// Class to represent the health monitoring drone
class HealthMonitoringDrone {
    private HealthData latestHealthData;

    public HealthMonitoringDrone() {
        this.latestHealthData = new HealthData(0, 0, 0);
    }

    // Simulate collecting health data
    public void collectHealthData() {
        Random random = new Random();
        double heartRate = 60 + random.nextDouble() * 40; // Simulate heart rate between 60 and 100 BPM
        double bodyTemperature = 36.5 + random.nextDouble() * 2; // Simulate body temperature between 36.5 and 38.5 degrees Celsius
        double bloodPressure = 90 + random.nextDouble() * 50; // Simulate blood pressure between 90 and 140 mmHg
        latestHealthData = new HealthData(heartRate, bodyTemperature, bloodPressure);
    }

    // Get the latest health data
    public HealthData getLatestHealthData() {
        return latestHealthData;
    }
}

public class HealthMonitoringDroneSimulation {
    public static void main(String[] args) {
        // Create a health monitoring drone
        HealthMonitoringDrone drone = new HealthMonitoringDrone();

        // Simulate collecting health data
        drone.collectHealthData();

        // Get and display the latest health data
        HealthData latestHealthData = drone.getLatestHealthData();
        System.out.println("Latest Health Data:");
        System.out.println("Heart Rate: " + latestHealthData.getHeartRate() + " BPM");
        System.out.println("Body Temperature: " + latestHealthData.getBodyTemperature() + " °C");
        System.out.println("Blood Pressure: " + latestHealthData.getBloodPressure() + " mmHg");
    }
}
