package br.com.sovis.factoryMethod.factories;

import br.com.sovis.factoryMethod.zoologic.Animal;
import br.com.sovis.factoryMethod.zoologic.Elephant;

public class ElephantFactory extends AnimalFactory {
    @Override
    public Animal getAnimal() {
        return new Elephant();
    }
}
