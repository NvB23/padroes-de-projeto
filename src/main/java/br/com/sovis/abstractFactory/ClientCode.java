package br.com.sovis.abstractFactory;

import br.com.sovis.abstractFactory.dealership.interfaces.Car;
import br.com.sovis.abstractFactory.dealership.interfaces.Motorcycle;
import br.com.sovis.abstractFactory.dealership.interfaces.Scooter;
import br.com.sovis.abstractFactory.factory.DealerShipFactory;
import br.com.sovis.abstractFactory.factory.FiatFactory;
import br.com.sovis.abstractFactory.factory.ToyotaFactory;

import java.util.Objects;
import java.util.Scanner;

public class ClientCode {
    static void main(String[] args) {
        DealerShipFactory dealerShipFactory = null;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual a marca do carro?");
        System.out.println("    1. Fiat");
        System.out.println("    2. Toyota");
        System.out.print(">>> ");
        String option = scanner.nextLine();

        if (Objects.equals(option, "1")) {
            dealerShipFactory = new FiatFactory();
        } else if (Objects.equals(option, "2")) {
            dealerShipFactory = new ToyotaFactory();
        }

        if (dealerShipFactory != null) {
            System.out.print("Qual o veículo: \n");
            System.out.println("""
                        1. Carro
                        2. Moto
                        3. Scooter
                    """);
            System.out.print(">>> ");
            String vehicleOption = scanner.nextLine();

            switch (vehicleOption) {
                case "1" -> {
                    Car car = dealerShipFactory.createCar();
                    System.out.println(car.doTestDrive());
                    System.out.println(car.makeMaintenanceInEngineAndFourWheels());
                }
                case "2" -> {
                    Motorcycle motorcycle = dealerShipFactory.createMotorcycle();
                    System.out.println(motorcycle.doTestDrive());
                    System.out.println(motorcycle.makeMaintenanceInEngineAndTwoWheels());
                }
                case "3" -> {
                    Scooter scooter = dealerShipFactory.createScooter();
                    System.out.println(scooter.doTestDrive());
                    System.out.println(scooter.makeMaintenanceInElectricEngine());
                }
            }
        }
    }
}
