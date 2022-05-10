package Task6;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int a, b;
        var scanner = new Scanner(System.in);

        System.out.print("Enter whole number:");
        a = scanner.nextInt();

        System.out.print("Enter whole number:");
        b = scanner.nextInt();

        System.out.printf("a is %d and b is %d ->", a ,b);
        if(a == b || (a<0 && b>0) || (a>100 && b>100)){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
}
