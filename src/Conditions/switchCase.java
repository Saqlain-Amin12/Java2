
package Conditions;

import java.util.Scanner;

public class switchCase {
public static void main(String args[]) {
        @SuppressWarnings("resource")
        Scanner ab =new Scanner(System.in);
        System.out.print("enter  a nnumber = ");

        int a = ab.nextInt();
        switch(a) {
            case 1:
                System.out.println("green");
                break;
            case 2:
                System.out.println("blue");   
                break;
            case 4:
                System.out.println("pink");
                break;     
        
            default:
                System.out.println("Red");
                break;
        }

}
}
// problem 3
//     Scanner ab =new Scanner(System.in);
//     int a = ab.nextInt();
//     int b = ab.nextInt();
//     if(a==b)
//     {
//     System.out.println("numbers are same");
//     }
//     else if(a>b)
//     {
// System.out.println("a is greater");
//     }
//     else
//     {
//         System.out.println("b is greater");
//     }

// }
// }
    //     int number = ab.nextInt();
    // problem 1
//     Scanner ab =new Scanner(System.in);
//     int number = ab.nextInt();
    
//     System.out.println("Number is = "+number);
// if(number%2==0)
// {
//     System.out.println("Even");
// }
// else{
//     System.out.println("Odd");
// }
// }
// }
