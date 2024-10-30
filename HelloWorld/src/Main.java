import java.awt.*;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;

public class Main {
    public static void main(String[] args){
//        NumberFormat currency = NumberFormat.getCurrencyInstance();
//        String result = currency.format(12242342342.234234);
//        System.out.println(result);  // $12,242,342,342.23


//        NumberFormat percent = NumberFormat.getPercentInstance();
//        String result = percent.format(0.35);
//        System.out.println(result); // 35%
        // or you can write this
        String result = NumberFormat.getPercentInstance().format(0.35);
        System.out.println(result); // 35%
    }
}