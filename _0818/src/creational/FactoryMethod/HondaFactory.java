package creational.FactoryMethod;

public class HondaFactory implements IVehicleFactory{
    @Override
    public IVehicle createVehicle() {
        return new Honda();
    }
}
