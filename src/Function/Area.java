package Function;
import java.util.*;
public class Area {
    public static  void calculateArea(int l,int w)
    {
        int area=l*w;
        int sum=l+w;
        System.out.println("AREA = "+area);
        System.out.println("Sum = "+sum);

    }
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner a = new Scanner(System.in);
        System.out.print("enter the length = ");
        int length= a.nextInt();
        System.out.print("enter the width = ");
        
        int width = a.nextInt();

        calculateArea(length,width);

        // pass by value
        System.out.println();
        System.out.println("PASS BY THE VALUE :");
        calculateArea(6, 6);
    }
}
