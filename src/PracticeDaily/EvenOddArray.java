package PracticeDaily;

import java.util.Scanner;

public class EvenOddArray {
public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
    System.out.print("Enter the size of Array = ");
    int size =sc.nextInt();
    int num[] = new int[size];
    int Even = 0;
    int Odd = 0;

    // Loop
  
    for(int i = 0; i<size ;i++)
    {
       System.out.print("Enter the number : ");
       num[i]=sc.nextInt();

    //    condition
    {
    if(num[i]%2==0)
    {
      Even++;
    }
    }
    if(num[i]%2!=0)
    {
        Odd++;
    }

}
    System.out.println("Even Numbers in Array : "+Even);
    System.out.println("Odd numbers in Arraay :"+Odd);
    
}
}
