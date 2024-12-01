public class Vehiclefactory {

    public static Vehicle createVehicle(String vehicleType) {-------
        switch (vehicleType.toLowerCase()) {
            case "car":
                return new Car();
            case "truck":
                return new Truck();
            case "motorcycle":
                return new Motorcycle();
            default:
                throw new IllegalArgumentException("Invalid vehicle type: " + vehicleType);
        }
    }
}