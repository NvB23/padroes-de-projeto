package br.com.sovis.abstractFactory.dealership;

import br.com.sovis.abstractFactory.dealership.interfaces.Car;

public class FiatCar implements Car {
    @Override
    public String doTestDrive() {
        return "No carro da Fiat foi feito um teste drive.";
    }

    @Override
    public String makeMaintenanceInEngineAndFourWheels() {
        return "Manutenção realizada nos quatro pneus e no motor à combustão.";
    }
}
