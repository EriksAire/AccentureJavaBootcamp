package Task3;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int num1;
        var scanner = new Scanner(System.in);

        System.out.print("Enter whole number:");
        num1 = scanner.nextInt();

        System.out.printf("Is number even?");
        if(num1 % 2 == 0){
            System.out.println(" -true");
        }
        else{
            System.out.println(" -false");
        }
    }
}
