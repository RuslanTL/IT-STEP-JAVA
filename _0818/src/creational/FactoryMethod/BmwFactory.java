package creational.FactoryMethod;

public class BmwFactory implements IVehicleFactory{
    @Override
    public IVehicle createVehicle() {
        return new Bmw();
    }
}
