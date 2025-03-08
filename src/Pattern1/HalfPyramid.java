package Pattern1;
import java.util.*;


public class HalfPyramid {
public static void main(String[] args) {
    Scanner a = new Scanner(System.in);
    int y = a.nextInt();
    for(int i = 0;i<y;i++)
    {
        for(int j=0;j<i;j++)
        {
    System.out.print("*");
        }
        System.out.println();
    }
}
}
