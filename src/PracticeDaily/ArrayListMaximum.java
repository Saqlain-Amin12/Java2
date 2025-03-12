package PracticeDaily;
import java.util.ArrayList;
import java.util.Collections;
public class ArrayListMaximum {
public static void main(String[] args) {
    
    ArrayList<String>Student = new ArrayList<String>();

    // add element in array list
        Student.add("Saqlain");
        Student.add("Saqib");
        Student.add("Husnain");
        System.out.println("List :"+Student);

    //replace value with the existing value
        Student.set(2,"Aqib");
        Student.set(1,"Ahmad");

        System.out.println("List :"+Student);

    //  the size of the list 
        int s=Student.size();
        System.out.println("Length of ArrayList is : "+s);

    //  to remove an element from a list
        Student.remove(1);
        System.out.println("New List :"+Student);
    //  To check an element in the list it is exist
        if(Student.contains("Aqib")) 
        {
        System.out.println("Name is Exist :");
        }
        else
        {
            System.out.println("does not exist :");
        }
    //  to reverse an list
        Collections.reverse(Student);
        System.out.println("Reverse List :"+Student);



               
    


}
}
