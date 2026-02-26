package br.com.sovis.abstractFactory.factory;

import br.com.sovis.abstractFactory.dealership.interfaces.Car;
import br.com.sovis.abstractFactory.dealership.interfaces.Motorcycle;
import br.com.sovis.abstractFactory.dealership.interfaces.Scooter;

public interface DealerShipFactory {
    Car createCar();
    Motorcycle createMotorcycle();
    Scooter createScooter();
}
