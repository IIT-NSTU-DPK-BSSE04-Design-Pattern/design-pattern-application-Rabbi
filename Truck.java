// Truck class
public class Truck extends Vehicle {
    public Truck() {
        body = new Body("Truck");
        wheels = new Wheels(6);
        engine = new Engine("V8");
    }

    @Override
    public void assemble() {
        System.out.println("Assembling truck...");
        createComponents();
    }
}