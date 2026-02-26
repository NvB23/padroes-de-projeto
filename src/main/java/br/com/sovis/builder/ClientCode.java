package br.com.sovis.builder;

public class ClientCode {
    static void main(String[] args) {
       PersonBuilder personBuilder = new PersonBuilder();

       Person personNaum = personBuilder.setName("Naum").setAge(19).getPerson();
       personBuilder.reset();
       Person personAna = personBuilder.setName("Ana").setHeight(1.65).getPerson();
       System.out.println(personNaum);
        System.out.println(personAna);
    }
}
