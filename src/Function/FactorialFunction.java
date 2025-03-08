package Function;
import java.util.*;
public class FactorialFunction {
    public static void displayFactorial(int n)
    {
        if(n<0)
        {
            System.out.println("invalid number");
        }
        else{
             int factorial=1;
             for(int i =1;i<=n;i++)
             {
              factorial=factorial*i;
             }
            System.out.println("factoria is = "+factorial);
        }

    }
public static void main(String[] args) {
    Scanner a = new Scanner(System.in);
    try{
    System.out.print("enter a number = ");
    int f = a.nextInt();
    displayFactorial(f);
    }
    finally
    {
    a.close();
    }
}
}
