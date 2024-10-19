import java.awt.*;
import java.util.Date;

public class Main {
    public static void main(String[] args){
        String message = "Hello World from java" + "!!!";
        System.out.println(message.length());  // message.indexOf("H") = 0
        System.out.println(message.replace("!", "$"));
        String message2 = "   new string   ";
        System.out.println(message2.trim());
        String message3 = "Hello double \"quotation\"";
        System.out.println(message3);
        String message4 = "c:\\windows\\drivers\\new...";
        System.out.println(message4);
        String message5 = "when i use backslash and \"n\" \n it goes to the next line!!!";
        System.out.println(message5);
    }
}