package com.kodilla.basic_assertion;

public class Application {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a = 15;
        int b = 5;
        int sumResult = calculator.sum(a, b);
        boolean correct = ResultChecker.assertEquals(20, sumResult);
        if (correct) {
            System.out.println("Metoda sum dziala poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda sum nie dziala poprawnie dla liczb " + a + " i " + b);
        }
        Calculator calculator2 = new Calculator();
        int c = 10;
        int d = 4;
        int subtractResult = calculator2.subtract(c, d);
        boolean correct2 = ResultChecker.assertEquals(6, subtractResult);
        if (correct2) {
            System.out.println("Metoda subtract dziala poprawine dla liczb " + c + " i " + d);
        } else {
            System.out.println("Metoda subtract nie dziala poprawine dla liczb " + c + " i " + d);
        }
        Calculator calculator3 = new Calculator();
        int f = -4;
        double powResult = calculator3.pow(f, 2);
        boolean correct3 = ResultChecker.assertEquals2(16, powResult);
        if (correct3) {
            System.out.println("Metoda pow dziala poprawine dla liczby " + f);
        } else {
            System.out.println("Metoda pow nie dziala poprawine dla liczby " + f);
        }
    }
}
