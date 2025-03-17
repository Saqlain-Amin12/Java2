package PracticeDaily;
import java.util.*;
public class InsertionSorting {
public static void main(String[] args) {
    Scanner sc =  new Scanner(System.in);
    System.out.print("Enter the size of array :");
    int size = sc.nextInt();
    int arr[] = new int[size];
    for(int i = 0; i<size;i++)
    {
        System.out.print("Enter a number :");
        arr[i]=sc.nextInt();
    }

    for(int i=1; i<arr.length; i++) {
        int current = arr[i];
        int j = i - 1;
            while(j >= 0 && arr[j] > current) {
                arr[j+1] = arr[j];
                j--;
            }
        arr[j+1] = current;
    }

    for(int i=0; i<arr.length; i++) {
        System.out.print(arr[i]+" ");
    }
    System.out.println();

   }
}
