import java.awt.*;
import java.util.Date;

public class Main {
    public static void main(String[] args){
    //        byte x = 1;
    //        byte y = x;
    //        x = 2;
    //        System.out.println(y); // = 1
        Point point1 = new Point(5, 5);
        Point point2 = point1;
        point1.x = 2;
        System.out.println(point2);  // = java.awt.Point[x=2,y=5]
    }
}