

import java.util.Scanner;

class Summator {
    public static void summ(int a, int b) {
        System.out.println(a + b);
    }
    public static void summ(double a, double b) {
        System.out.println(a + b);
    }

    public static void main(String[] args) {
        Scanner inpObj = new Scanner(System.in);

        System.out.println("Input a first number: ");
        int data1 = inpObj.nextInt();
        System.out.println("input a second number: ");
        int data2 = inpObj.nextInt();

        summ(data1, data2);

    }
}