package br.com.sovis.factoryMethod;

import br.com.sovis.factoryMethod.factories.AnimalFactory;
import br.com.sovis.factoryMethod.factories.ElephantFactory;
import br.com.sovis.factoryMethod.factories.LionFactory;
import br.com.sovis.factoryMethod.zoologic.Animal;
import br.com.sovis.factoryMethod.zoologic.Lion;

import java.util.Scanner;

public class ClientCode {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AnimalFactory animalFactory;

        System.out.println(""" 
                Escolha o animal:
                1. Leão;
                2. Elefante;
        """);
        System.out.print(">>> ");
        String option = scanner.nextLine();

        switch (option) {
            case("1") -> animalFactory = new LionFactory();
            case("2") -> animalFactory = new ElephantFactory();
            default -> animalFactory = null;
        }

        if (animalFactory != null) {
            System.out.print("Escolha a comida: ");
            String food = scanner.nextLine();

            Animal animal = animalFactory.getAnimal();

            animal.doSong();
            animalFactory.sendToEnclosure(food);
        }
    }
}
