package Sesudah_Refactoring.ConditionalExpression;

public class Main {
    public static void main(String[] args) {
        int score = 650;
        int income = 40000;
        boolean authorized = true;

        if ((score <= 700) && (income < 40000) || (income > 100000) || !authorized || (income <= 500) && (income <= 100000)) {
            reject();
        } else {
            accept();
        }
    }

    public static void accept() {
        System.out.println("Accept");
    }

    public static void reject() {
        System.out.println("Reject");
    }
}