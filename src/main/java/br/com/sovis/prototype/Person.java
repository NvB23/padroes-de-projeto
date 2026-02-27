package br.com.sovis.prototype;

import java.util.Objects;

public abstract class Person {
    private String name;
    private int age;
    private double height;
    private String cpf;

    public Person() {
    }

    public Person(Person person) {
        this.name = person.name;
        this.age = person.age;
        this.height = person.height;
        this.cpf = person.cpf;
    }

    public abstract Person clone();

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Double.compare(height, person.height) == 0 && Objects.equals(name, person.name) && Objects.equals(cpf, person.cpf);
    }
}
