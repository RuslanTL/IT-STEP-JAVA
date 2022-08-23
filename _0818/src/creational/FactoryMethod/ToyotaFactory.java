package creational.FactoryMethod;

public class ToyotaFactory implements IVehicleFactory{
    @Override
    public IVehicle createVehicle() {
        return new Toyota();
    }
}
