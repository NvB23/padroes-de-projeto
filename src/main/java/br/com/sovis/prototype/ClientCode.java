package br.com.sovis.prototype;

public class ClientCode {
    static void main(String[] args) {
        double moneyAvailable = 2000;

        Professor professor = new Professor();
        professor.wage = 500;
        moneyAvailable -= professor.wage;

        Professor professor1 = (Professor) professor.clone();
        moneyAvailable -= professor1.wage;
        System.out.println(moneyAvailable);

        if (professor.equals(professor1)) {
            System.out.println("Tem objetos iguais!!!");
        } else {
            System.out.println("Tem objetos diferentes!!!");
        }

        System.out.println(professor);
        System.out.println(professor1);

        if(professor == professor1) {
            System.out.println("Endereços de memória iguais.");
        } else {
            System.out.println("Endereços de memória diferentes.");
        }

        Student student = new Student();
        student.monthlyFee = 500;
        moneyAvailable += student.monthlyFee;

        Student student1 = (Student) student.clone();
        student1.monthlyFee = 500;
        moneyAvailable += student.monthlyFee;

        Student student2 = (Student) student1.clone();
        student1.monthlyFee = 500;
        moneyAvailable += student2.monthlyFee;
        System.out.println(moneyAvailable);

        if (student.equals(student1) && student1.equals(student2)) {
            System.out.println("Todos iguais.");
        }
    }
}
