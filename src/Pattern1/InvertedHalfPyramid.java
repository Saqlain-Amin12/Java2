package Pattern1;



public class InvertedHalfPyramid {
public static void main(String[] args) {
    // Scanner a = new Scanner(System.in);
    // int y = a.nextInt();
    for(int i = 0;i<5;i++)
    {
        for(int j=4;j>i;j--)
        {
            System.out.print("*");
        }
        System.out.println();
    }
}
}
