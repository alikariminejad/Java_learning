import java.awt.*;
import java.util.Arrays;
import java.util.Date;

public class Main {
    public static void main(String[] args){
        // + - * / %
        float result = (float) 35 / (float) 8;
        System.out.println(result);
        int x = 1;
        int w = 1;
        int y = ++x;
        int z = w++;
        System.out.println(y); // y = 2, x = 2
        System.out.println(z); // z = 1 , w = 2
        // x = x + 1  == x += 1
        // x = x - 1  == x -= 1
    }
}