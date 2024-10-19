import java.awt.*;
import java.util.Date;

public class Main {
    public static void main(String[] args){
        String message = "Hello World from java" + "!!!";
        System.out.println(message.length());  // message.indexOf("H") = 0
        System.out.println(message.replace("!", "$"));
        String message2 = "   new string   ";
        System.out.println(message2.trim());

    }
}