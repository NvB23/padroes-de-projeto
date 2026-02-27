package br.com.sovis.prototype;

public class Professor extends Person {
    public double wage;

    public Professor() {}

    public Professor(Professor professor) {
        super(professor);
        this.wage = professor.wage;
    }

    @Override
    public Person clone() {
        return new Professor(this);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Professor professor = (Professor) o;
        return Double.compare(wage, professor.wage) == 0;
    }
}
