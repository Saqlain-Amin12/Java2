package InheritanceProblems;
class  Vehicle
{
    private String brand;
    private int  model;
    private String  fuelType;
    Vehicle(String brand,int  model,String  fuelType)
    {
this.brand=brand;
this.model=model;
this.fuelType=fuelType;
    }
    public String getBrand()
    {
        return brand;
    }
    public void setBrand(String brand)
    {
    this.brand=brand;
    }
    public String getFuelType()
    {
        return fuelType;
    }
    public void setFuelType(String fuelType)
    {
    this.fuelType=fuelType;
    }
    public int getModel()
    {
        return model;
    }
    public void setModel(int model)
    {
    this.model=model;
    }

public void displayDetails()
{
    System.out.println("BRAND = "+brand);
    System.out.println("MODEL = "+model);
    System.out.println("fuelType = "+fuelType);
}
}
class  Car extends Vehicle
{
    private  int numberOfSeats;
    static int totalCars;
    Car(String brand,int  model,String  fuelType,int numberOfSeats)
    {
        super(brand,model,fuelType);
        this.numberOfSeats=numberOfSeats;
        
        // this.totalCars=totalCars;

    }
    public int getnumberOfSeats()
    {
        return numberOfSeats;
    }
    @Override
    public void setModel(int numberOfSeats)
    {
    this.numberOfSeats=numberOfSeats;
    }
    public void  honk()
    {
        System.out.println("this is the sound of the care : honking sound");
    }
    public void  showTotalCars()
    {
        totalCars++;
        System.out.println("TOTAL SEATS = "+numberOfSeats);
        System.out.println("TOTAL CARS = "+totalCars);

    }
}


class  ElectricCar extends  Car
{
private int batteryLife;

// @SuppressWarnings("unused")
ElectricCar(String brand,int  model,String  fuelType,int numberOfSeats,int batteryLife)
{
 super( brand,model,fuelType,numberOfSeats);
 this.batteryLife=batteryLife;
}

public int getbatteryLife()
    {
        return batteryLife;
    }
    public void setbatteryLife(int batteryLife)
    {
    this.batteryLife=batteryLife;
    }
    public void   chargeBattery()
    {
        System.out.println("battery battery battery battery battery:");
    }
// @Override
    public void  displayDetail() 
    {
        if(batteryLife>23)
        {
            System.out.println("no need of charging the battery");
        }
        else{
            System.out.println("you need to charge the battery");
        }
    }
}

public class inheritance1 {

    public static void main(String[] args) {
        
        Car a = new Car("Elentra", 2023, "petrol", 6);
        a.displayDetails();
        a.showTotalCars();
        a.honk();
        System.out.println("");
        ElectricCar b = new ElectricCar("Toyata", 2020, "DIESEL", 12,33);
        b.displayDetails();
        b.showTotalCars();
        b.honk();
        b.chargeBattery();
        b.displayDetail();
    }
}
