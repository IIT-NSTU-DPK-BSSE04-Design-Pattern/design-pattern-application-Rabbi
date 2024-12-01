// Engine component
public class Engine implements VehicleComponent {
    private String engineType;

    public Engine(String engineType) {
        this.engineType = engineType;
    }

    @Override
    public void create() {
        System.out.println("Creating " + engineType + " engine.");
    }
}
