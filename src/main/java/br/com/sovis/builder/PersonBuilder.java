package br.com.sovis.builder;

public class PersonBuilder {
    private Person person = new Person();

    public void reset() {
        this.person = new Person();
    }

    public PersonBuilder setName(String name) {
        this.person.name = name;
        return this;
    }

    public PersonBuilder setAge(int age) {
        this.person.age = age;
        return this;
    }

    public PersonBuilder setHeight(double height) {
        this.person.height = height;
        return this;
    }

    public Person getPerson() {
        return this.person;
    }
}
