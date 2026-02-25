package br.com.sovis.factoryMethod.zoologic;

public class Lion implements Animal {
    @Override
    public void doSong() {
        System.out.println("Raaaaa!");
    }

    @Override
    public void toFeed(String food) {
        System.out.printf("O leão comeu %s%n", food);
    }

    @Override
    public String toString() {
        return "Leão";
    }
}
