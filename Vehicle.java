public abstract class Vehicle {
    protected VehicleComponent body;
    protected VehicleComponent wheels;
    protected VehicleComponent engine;

    public abstract void assemble();

    public void createComponents() {
        body.create();
        wheels.create();
        engine.create();
    }
}