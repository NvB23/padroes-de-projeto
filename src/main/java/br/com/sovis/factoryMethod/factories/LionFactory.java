package br.com.sovis.factoryMethod.factories;

import br.com.sovis.factoryMethod.zoologic.Animal;
import br.com.sovis.factoryMethod.zoologic.Lion;

public class LionFactory extends AnimalFactory {

    @Override
    public Animal getAnimal() {
        return new Lion();
    }
}
