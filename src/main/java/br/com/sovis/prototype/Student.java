package br.com.sovis.prototype;

public class Student extends Person {
    public double monthlyFee;

    public Student() {}

    public Student(Student student) {
        super(student);
        this.monthlyFee = student.monthlyFee;
    }

    @Override
    public Person clone() {
        return new Student(this);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Student student = (Student) o;
        return Double.compare(monthlyFee, student.monthlyFee) == 0;
    }
}
