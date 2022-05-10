package Task5;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        boolean b1;
        var scanner = new Scanner(System.in);

        System.out.print("Enter b1:");
        b1 = scanner.nextBoolean();

        System.out.printf("Opposite of %b is", b1);
        if(b1){
            System.out.println(" -false");
        }
        else{
            System.out.println(" -true");
        }
    }
}
