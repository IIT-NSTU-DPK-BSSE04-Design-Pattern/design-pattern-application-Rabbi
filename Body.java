// Body component
public class Body implements VehicleComponent {
    private String type;

    public Body(String type) {
        this.type = type;
    }

    @Override
    public void create() {
        System.out.println("Creating " + type + " body.");
    }
}