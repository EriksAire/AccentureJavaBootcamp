package Task1;

import java.util.ArrayList;
import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        String[] colors = {"black", "white", "gray", "silver", "maroon", "red", "purple"};

        var colorsList = new ArrayList<String>(Arrays.asList(colors));

        System.out.println(colorsList.get(2));

        colorsList.remove(2);

        colorsList.add("blue");

        System.out.println("Colors list:");
        for (String color : colorsList) {
            System.out.print(color + " ");
        }

        System.out.println("\n");

        var colorsSublist = colorsList.subList(2, 5);

        System.out.println("Colors sublist:");
        for (String color : colorsSublist) {
            System.out.print(color + " ");
        }
    }
}
