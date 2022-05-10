package Task1;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int num1, num2;
        var scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        num2 = scanner.nextInt();

        System.out.printf("Is %d equal to %d", num1, num2);
        if(num1 == num2){
            System.out.println(" -true");
        }
        else {
            System.out.println(" -false");
        }

        System.out.printf("Is %d less than %d", num1, num2);
        if(num1 < num2){
            System.out.println(" -true");
        }
        else {
            System.out.println(" -false");
        }

        System.out.printf("Is %d less or equal to %d", num1, num2);
        if(num1 <= num2){
            System.out.println(" -true");
        }
        else {
            System.out.println(" -false");
        }

        System.out.printf("Is %d greater than %d", num1, num2);
        if(num1 > num2){
            System.out.println(" -true");
        }
        else {
            System.out.println(" -false");
        }

        System.out.printf("Is %d greater or equal to %d", num1, num2);
        if(num1 >= num2){
            System.out.println(" -true");
        }
        else {
            System.out.println(" -false");
        }
    }
}
