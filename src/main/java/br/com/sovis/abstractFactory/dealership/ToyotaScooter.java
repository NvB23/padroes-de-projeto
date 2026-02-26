package br.com.sovis.abstractFactory.dealership;

import br.com.sovis.abstractFactory.dealership.interfaces.Scooter;

public class ToyotaScooter implements Scooter {
    @Override
    public String doTestDrive() {
        return "Na scooter da Toyota foi feito um teste drive.";
    }

    @Override
    public String makeMaintenanceInElectricEngine() {
        return "Manutenção realizada no motor elétrico da scooter Toyota.";
    }
}
