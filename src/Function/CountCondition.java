package Function;

import java.util.Scanner;

public class CountCondition {
    public static void returnCount(int b)
    {
     int count=0; 
     int count1=0;
     int count2=0;  
     for(int i =1;i<=b;i++)
        {
         @SuppressWarnings("resource")
         Scanner sc = new Scanner(System.in);   
         System.out.print("enter a nnumber = ");
         int a= sc.nextInt();
         if(a>0)
         {
            count++;
         }
         else if(a==0)
         {
            count1++;
         }
         else
         {
            count2++;
         }

        }
        System.out.println("Total Positive Numbers = "+count);
        System.out.println("Total zero = "+count1);
        System.out.println("Total Negative Numbers= "+count2);
        
        
    }
public static void main(String[] args) {
   
    Scanner sc = new Scanner(System.in);
    
    System.out.print("enter a nnumber = ");
    int b= sc.nextInt();
    System.out.println("User start to input numbers :");
    returnCount(b);
    }
   
}

