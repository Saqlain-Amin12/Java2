package Pattern1;

public class HollowRectangle {
public static void main(String[] args) {
    for(int i = 1;i<5;i++)
    {
        for(int j=1;j<6;j++)
        {
            if(i==1 ||j==1||i==4||j==5)
            {
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
           
        }
        System.out.println();
    }
}
}
