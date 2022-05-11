package Task2;

import java.util.stream.IntStream;

public class main {
    public static void main(String[] args) {
       var array = IntStream.rangeClosed(1,4)
                .limit(4)
                .toArray();

       int[] arrayCopy = new int[4];

        for (int i=0; i<array.length; i++) {
            arrayCopy[i] = array[i];
        }

        for(int i: arrayCopy){
            System.out.println(i);
        }
    }
}
