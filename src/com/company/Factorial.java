package com.company;

public class Factorial {
    public static void main(String[] args) {
        main();
    }
    public static void main() {
        for(int x = 1; x<=20; x++) {
            System.out.println(calcFactorial(x));
        }

    }
    public static long calcFactorial(int x) {
        long total = 1;
        for (x = x; x > 0; x--) {
            total *= x;
        }
        return total;
    }
    public static void calcE(){
        while(e-olde > .001) {
            olde = e;
    
        }
    }
}
