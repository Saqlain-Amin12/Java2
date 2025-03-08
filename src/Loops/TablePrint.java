package Loops;
import java.util.*;
public class TablePrint {
public static void main(String[] args) {
    @SuppressWarnings("resource")
    Scanner  ali = new Scanner(System.in);
    System.out.print("Enter a number =");
    int a = ali.nextInt();
    for(int i = 1;i<11;i++)
    {
      System.out.println(a+" * "+i+" = "+i*a);
    }
 }
}

