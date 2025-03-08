package Function;

import java.util.Scanner;

public class SumOfOddNumbers {
    public static void  OddSum(int a)
    {
      int sum =0;
      int count=0;
      for(int i = 0; i<=a;i++)
      {
       
        if(i%2!=0)
        {
            sum=sum+i;
            // count=count+1;
            count++;
        }
      }
      System.out.println("SUm of OddNUmber is = "+sum);
      System.out.println("Total Odd NUmbers = "+count);
    }
public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("enter a number = ");
    int a = s.nextInt();
    OddSum(a);
}
}
