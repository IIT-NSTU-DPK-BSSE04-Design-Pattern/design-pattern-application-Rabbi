// Car class
public class Car extends Vehicle {
    public Car() {
        body = new Body("Car");
        wheels = new Wheels(4);
        engine = new Engine("V6");
    }

    @Override
    public void assemble() {
        System.out.println("Assembling car...");
        createComponents();
    }
}

