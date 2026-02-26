package br.com.sovis.abstractFactory.factory;

import br.com.sovis.abstractFactory.dealership.ToyotaCar;
import br.com.sovis.abstractFactory.dealership.ToyotaMotorcycle;
import br.com.sovis.abstractFactory.dealership.ToyotaScooter;
import br.com.sovis.abstractFactory.dealership.interfaces.Car;
import br.com.sovis.abstractFactory.dealership.interfaces.Motorcycle;
import br.com.sovis.abstractFactory.dealership.interfaces.Scooter;

public class ToyotaFactory implements DealerShipFactory {
    @Override
    public Car createCar() {
        return new ToyotaCar();
    }

    @Override
    public Motorcycle createMotorcycle() {
        return new ToyotaMotorcycle();
    }

    @Override
    public Scooter createScooter() {
        return new ToyotaScooter();
    }
}
