package br.com.sovis.factoryMethod.factories;

import br.com.sovis.factoryMethod.zoologic.Animal;

public abstract class AnimalFactory {
    public void sendToEnclosure(String food) {
        Animal animal = this.getAnimal();
        animal.toFeed(food);
        System.out.println("O " + animal + " foi pro recinto alimentado.");
    }

    // Método de fábrica
    public abstract Animal getAnimal();
}
