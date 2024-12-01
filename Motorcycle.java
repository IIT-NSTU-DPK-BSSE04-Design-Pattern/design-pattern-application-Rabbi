// Motorcycle class
public class Motorcycle extends Vehicle {
    public Motorcycle() {
        body = new Body("Motorcycle");
        wheels = new Wheels(2);
        engine = new Engine("Single-cylinder");
    }

    @Override
    public void assemble() {
        System.out.println("Assembling motorcycle...");
        createComponents();
    }
}