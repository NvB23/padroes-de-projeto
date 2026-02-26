package br.com.sovis.abstractFactory.dealership;

import br.com.sovis.abstractFactory.dealership.interfaces.Scooter;

public class FiatScooter implements Scooter {
    @Override
    public String doTestDrive() {
        return "Na scooter da Fiat foi feito um teste drive.";
    }

    @Override
    public String makeMaintenanceInElectricEngine() {
        return "Manutenção realizada no motor elétrico da scooter Fiat.";
    }
}
