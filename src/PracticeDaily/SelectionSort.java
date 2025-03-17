package PracticeDaily;
import java.util.*;
public class SelectionSort {
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
   
    

    for(int i=0; i<arr.length-1; i++) {
        int smallest = i;
        for(int j=i+1; j<arr.length; j++) {
            if(arr[j] < arr[smallest]) {
                smallest = j;
            }
        }
        //swap
        int temp = arr[smallest];
        arr[smallest] = arr[i];
        arr[i] = temp;
    }


    for(int i=0; i<arr.length; i++) {
        System.out.print(arr[i]+" ");
    }
    System.out.println();


}
}
