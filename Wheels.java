// Wheels component
public class Wheels implements VehicleComponent {
    private int numberOfWheels;

    public Wheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    @Override
    public void create() {
        System.out.println("Creating " + numberOfWheels + " wheels.");
    }
}
