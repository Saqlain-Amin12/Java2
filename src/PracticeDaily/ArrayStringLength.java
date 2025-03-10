package PracticeDaily;
import java.util.*;
public class ArrayStringLength {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the size of Array :");
    int size = sc.nextInt();

    // String Array

    String name[] = new String[size];
    // Length of all Strings 
    int length = 0;
    // Loop
    for(int i = 0;i<size;i++)
    {
        System.out.print("Enter the String : ");
        name[i]=sc.next();
        length = length+name[i].length();

    }
    System.out.println("The length of all String enterd by the user is :"+length);


}
}
