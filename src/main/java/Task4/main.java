package Task4;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int num1;
        var scanner = new Scanner(System.in);

        System.out.print("Enter whole number:");
        num1 = scanner.nextInt();

        System.out.printf("Is number odd?");
        if(num1 % 2 == 0){
            System.out.println(" -false");
        }
        else{
            System.out.println(" -true");
        }
    }
}
