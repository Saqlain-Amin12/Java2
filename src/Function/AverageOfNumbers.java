package Function;
import java.util.*;
public class AverageOfNumbers {
    public static void displayAverage(int a,int b,int c)
    {
        int avg;
        avg=(a+b+c)/3;
        System.out.println("Average = "+avg);
    }
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("enter a number = ");
    int a= sc.nextInt();
    System.out.print("enter a number = ");
    int b= sc.nextInt();
    System.out.print("enter a number = ");
    int c= sc.nextInt();
    displayAverage(a,b,c);

}
}
