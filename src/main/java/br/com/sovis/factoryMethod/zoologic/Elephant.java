package br.com.sovis.factoryMethod.zoologic;

public class Elephant implements Animal {
    @Override
    public void doSong() {
        System.out.println("Fuuuu!");
    }

    @Override
    public void toFeed(String food) {
        System.out.printf("O elefante comeu %s%n", food);
    }

    @Override
    public String toString() {
        return "Elefante";
    }
}
