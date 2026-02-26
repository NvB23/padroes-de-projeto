package br.com.sovis.abstractFactory.factory;

import br.com.sovis.abstractFactory.dealership.FiatCar;
import br.com.sovis.abstractFactory.dealership.FiatMotorcycle;
import br.com.sovis.abstractFactory.dealership.FiatScooter;
import br.com.sovis.abstractFactory.dealership.interfaces.Car;
import br.com.sovis.abstractFactory.dealership.interfaces.Motorcycle;
import br.com.sovis.abstractFactory.dealership.interfaces.Scooter;

public class FiatFactory implements DealerShipFactory {
    @Override
    public Car createCar() {
        return new FiatCar();
    }

    @Override
    public Motorcycle createMotorcycle() {
        return new FiatMotorcycle();
    }

    @Override
    public Scooter createScooter() {
        return new FiatScooter();
    }
}
