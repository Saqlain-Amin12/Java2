package Function;
import java.util.*;

public class function1 {
    public static void PrintName(String name,int age,int marks)
{
    System.out.println("NAME = "+name);
    System.out.println("AGE = "+age);
    System.out.println("MARKS = "+marks);
    
    // return;
}
public static void main(String[] args) {
   
    @SuppressWarnings("resource")
    Scanner a = new Scanner(System.in);
    System.out.print("Enter  your name = ");
    String name = a.next();
    System.out.print("Enter your age = ");
    int age = a.nextInt();
    System.out.print("Enter your grades = ");
    int marks = a.nextInt();
    System.out.println();

    PrintName(name,age,marks);
  

}
}
