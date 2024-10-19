import java.awt.*;
import java.util.Arrays;
import java.util.Date;

public class Main {
    public static void main(String[] args){
//        int[] numbers = new int[5]; // this array has 5 elements
        int[] numbers = {1, 6, 3, 40, 5};
        Arrays.sort(numbers);
        System.out.println(numbers.length);
        System.out.println(Arrays.toString(numbers));
    }
}