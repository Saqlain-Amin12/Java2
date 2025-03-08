package InheritanceProblems;

class Student
{
private String name;
Student(String name)
{
this.name=name;
// System.out.printf("Name = ",name);
}
public String getName()
{
    return name;
}
public void setName(String name)
{
    this.name=name;
}

public void display()
{
System.out.println("Name = "+name);
}

   

}
public class Animal {
public static void main(String[] args) {
    Student a = new Student("saqlain");
    a.display();
}
}
