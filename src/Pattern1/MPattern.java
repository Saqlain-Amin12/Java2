package Pattern1;

public class MPattern {
public static void main(String[] args) {
    int n =6;
    for(int i = 1;i<n;i++)
    {
        for(int j=1;j<=i;j++)
         {
        System.out.print(   "*"  );
         }
        // @SuppressWarnings("unused")
        int spaces =2*(n-i);
        for ( int j=1;j<=spaces;j++)
         {
            System.out.print(" ");
         }

         for(int j=1;j<=i;j++)
         {
        System.out.print(   "*"  );
         }
         System.out.println();
    }
}
}
