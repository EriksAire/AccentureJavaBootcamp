package Task2;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        boolean b1, b2;
        var scanner = new Scanner(System.in);

        System.out.print("Enter b1:");
        b1 = scanner.nextBoolean();

        System.out.print("Enter b2:");
        b2 = scanner.nextBoolean();

        System.out.printf("Is b1 and b2 equal?");
        if(b1 == b2){
            System.out.println(" -true");
        }
        else{
            System.out.println(" -false");
        }
    }
}
