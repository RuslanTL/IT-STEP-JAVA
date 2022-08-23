package creational.FactoryMethod;

public class Main {
    public static void main(String[] args){
        IVehicleFactory vehicleFactory = createVehicleByName("bmw");
        IVehicle vehicle = vehicleFactory.createVehicle();
        vehicle.drive();
    }
    static IVehicleFactory createVehicleByName(String name){
        if(name.equalsIgnoreCase("TOYOTA")){
            return new ToyotaFactory();
        } else if (name.equalsIgnoreCase("HONDA")){
            return new HondaFactory();
        } else if (name.equalsIgnoreCase("BMW")){
            return new BmwFactory();
        }
        throw new RuntimeException(name + " is not a valid type!");
    }
}
