package PracticeDaily;
import java.util.*;
public class SumofArray {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the size of number = ");
    int size =sc.nextInt();
    int ele[] = new int[size];

    // Loop
    int sum = 0;
    int mul = 1;
    for(int i = 0; i<size ;i++)
    {
       System.out.print("Enter the number : ");
        ele[i]=sc.nextInt();
       
        sum+=ele[i];
        mul*=ele[i];
        
       
    }
    System.out.println();
    System.out.println("sum : "+sum);
    System.out.println("Multiplication : "+mul);

}
}
