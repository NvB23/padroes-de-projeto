package br.com.sovis.abstractFactory.dealership;

import br.com.sovis.abstractFactory.dealership.interfaces.Motorcycle;

public class ToyotaMotorcycle implements Motorcycle {
    @Override
    public String doTestDrive() {
        return "Na moto da Toyota foi feito um teste drive.";
    }

    @Override
    public String makeMaintenanceInEngineAndTwoWheels() {
        return "Manutenção realizada nos dois pneus e no motor à combustão.";
    }
}
