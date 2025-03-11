package PracticeDaily;
class Engine
  {
    private int model;
    Engine(int model)
      {
       this.model=model;
      }
// Getter Setter of attributes
    public int getModel()
      {
       return model;
      }
    public void setModel(int model)
      {
       this.model=model;
      }
// Method
    public void display()
      {
       System.out.println("The model of Engine is :"+model);
      }
}

class Car
{
    private String name;
    final Engine engine;
    
    Car(String name)
     {
      this.name=name;
      engine = new Engine(12);
     }
      public String getName()
     {
      return name;
     }
    // Constructor
public void setModel(String name)
     {
      this.name=name;
     }
    // Methhod
public void displayinfo()

     {
      engine.display();
      System.out.println("The name of the car is "+name);
      System.out.println("This is my favourite Car:");
     }
    
}
public class CompositionInOOP {
public static void main(String[] args) {

    Car a = new Car("Civic");
    a.displayinfo();
}
}
