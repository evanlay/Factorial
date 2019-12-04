package com.company;

public class Factorial {
    public static void main(String[] args) {
        main();
    }
    public static void main() {
        calcFactorial(10);
        calcFactorial(20);

    }
    public static void calcFactorial(int x) {
        int total = 1;
        for (x = x; x > 0; x--) {
            total *= x;
            System.out.println(total);
        }
    }
}
