public class Main {
    public static void main(String[] args) {
        Vehicle car = Vehiclefactory.createVehicle("car");
        car.assemble();

        Vehicle truck = Vehiclefactory.createVehicle("truck");
        truck.assemble();

        Vehicle motorcycle = Vehiclefactory.createVehicle("motorcycle");
        motorcycle.assemble();
    }
}