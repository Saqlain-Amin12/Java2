package minorProjects;

class  Electronics
{
	private String brand;
	private  double price;
	private  String model;
	private int warrantyYears;
	
	Electronics(String brand,double price,String model,int warrantyYears)
	{
		this.brand = brand;
		this.price=price;
		this.model=model;
		this.warrantyYears=warrantyYears;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getWarrantyYears() {
		return warrantyYears;
	}

	public void setWarrantyYears(int warrantyYears) {
		this.warrantyYears = warrantyYears;
	}
	
// Merhods 
	public void powerOn()
	{
		System.out.println("Power ....");
	}
	public void   displayInfoo() 
	{
		System.out.println("Brand : "+brand);
		System.out.println("Price  : "+price);
		System.out.println("Model : "+model);
		System.out.println("WarrantyYears : "+warrantyYears);
	}
	
	public void applyDiscount(double discountPercentage) 
	{
		price =price -( price * discountPercentage/100);
		System.out.println("Price  after discount  : "+price);
	}
	
}

class Laptop extends Electronics
{
	private int ramSize;
	private String processor;
	private boolean hasDedicatedGPU;
	
	Laptop(String brand,double price,String model,int warrantyYears, int ramSize,String processor,boolean hasDedicatedGPU)
	{
		super(brand ,price,model,warrantyYears);
		this.ramSize=ramSize;
		this.processor=processor;
		this.hasDedicatedGPU=hasDedicatedGPU;
	}

	public int getRamSize() {
		return ramSize;
	}

	public void setRamSize(int ramSize) {
		this.ramSize = ramSize;
	}

	public String getProcessor() {
		return processor;
	}

	public void setProcessor(String processor) {
		this.processor = processor;
	}

	public boolean isHasDedicatedGPU() {
		return hasDedicatedGPU;
	}

	public void setHasDedicatedGPU(boolean hasDedicatedGPU) {
		this.hasDedicatedGPU = hasDedicatedGPU;
	}
	
        @Override
	public void  powerOn() 
	{
	System.out.println("Lenovo ThinkPad - Initializing System... ");
	}
	 public  void batteryBackup(double batteryPercentage, double powerConsumption, double batteryCapacity) {
	        double remainingBattery = (batteryPercentage / 100) * batteryCapacity; 
	        System.out.println("Total remainingBattery : "+remainingBattery);
	        if (powerConsumption == 0) 
	        	{
	        	System.out.println("Batter is Enough");
	        	}
	        else
	        {
	        	remainingBattery=remainingBattery / powerConsumption; 
	        	System.out.println("remainingBattery :"+remainingBattery+"%");
	        }
	       
	         }
	 public void upgradeRAM(int additionalRAM) 
	 {
		 ramSize =ramSize+additionalRAM;
		 System.out.println("ramSize : "+ramSize);
	 }
	 public void enablePerformanceMode()
	 {
		 if(hasDedicatedGPU==true)
		 {
			 System.out.println("GPU is available and optimizes performance");
		 }
		 else
		 {
			 System.out.println("GPU is  not available and optimizes performance ");
		 }
	 }

	 
}
class Smartphone extends  Electronics
{
	private static final boolean True = false;
	private int cameraMP;
	private  boolean is5GEnabled;
	private int batteryCapacity;
	Smartphone(String brand,double price,String model,int warrantyYears, int cameraMP,boolean is5GEnabled,int batteryCapacity)
	{
		super(brand ,price,model,warrantyYears);
		this.cameraMP=cameraMP;
		this.is5GEnabled=is5GEnabled;
		this.batteryCapacity=batteryCapacity;
		
	}
	public int getCameraMP() {
		return cameraMP;
	}
	public void setCameraMP(int cameraMP) {
		this.cameraMP = cameraMP;
	}
	public boolean isIs5GEnabled() {
		return is5GEnabled;
	}
	public void setIs5GEnabled(boolean is5gEnabled) {
		is5GEnabled = is5gEnabled;
	}
	public int getBatteryCapacity() {
		return batteryCapacity;
	}
	public void setBatteryCapacity(int batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}
	
        @Override
	public void  powerOn() 
	{
		System.out.println("Booting up... Please wait");
	}
	 
	public void check5GSupport() 
	{
		if(is5GEnabled==True)
		{
			System.out.println("5G  is Enabled  ");
		}
		else
		{
			System.out.println("5G  is  not Enabled ");
		}
	
	}
	public void batteryLife(int batteryUsage,int  batteryPercentage )
	{
		if(batteryUsage<0)
		{
			System.out.println();
		}
		else
		{
			@SuppressWarnings("unused")
			int remainingbatteryLife= (batteryPercentage/100)*batteryCapacity;
			batteryCapacity=remainingbatteryLife/batteryUsage;
			System.out.println("Battery Capacity  of Smart Phone :"+batteryCapacity);
		}
	}
	public void takePicture() 
	{
		System.out.println("I am taking picture by using smartphone");
	}

}
// class 4
class Television extends  Electronics
{
	private int screenSize;
	 private String resolution;
	 private boolean isSmartTV;
	 
	 Television(String brand,double price,String model,int warrantyYears, int screenSize,String resolution, boolean isSmartTV)
		{
			super(brand ,price,model,warrantyYears);
			this.screenSize=screenSize;
			this.resolution=resolution;
			this.isSmartTV=isSmartTV;
			
		}

	public int getScreenSize() {
		return screenSize;
	}

	public void setScreenSize(int screenSize) {
		this.screenSize = screenSize;
	}

	public String getResolution() {
		return resolution;
	}

	public void setResolution(String resolution) {
		this.resolution = resolution;
	}

	public boolean isSmartTV() {
		return isSmartTV;
	}

	public void setSmartTV(boolean isSmartTV) {
		this.isSmartTV = isSmartTV;
	}
	 
	 
        @Override
	public void powerOn() {
        System.out.println("Turning on the TV... Welcome to " + resolution + " resolution!");
    }

    public void changeChannel(int channelNumber) {
        System.out.println("Changing to channel " + channelNumber + "...");
    }

    public void enableStreamingMode() {
        if (isSmartTV) {
            System.out.println(" Smart TV detected! You can now stream online content.");
        } else {
            System.out.println("This is not a Smart TV. Streaming is not supported.");
        }
    }

    public void adjustBrightness(int level) {
        if (level < 0 || level > 100) {
            System.out.println("Brightness level must be between 0 and 100.");
        } else {
            System.out.println("Adjusting brightness to " + level + "%.");
        }
    }

}

		

public class OOPconcept {
public static void main(String[] args) {

    Laptop a = new Laptop("Hp ",75000.0,"2017",2,28,"intel",true);
		a.displayInfoo();
		a.powerOn();
		a.applyDiscount(10);
		a.batteryBackup(80.0,45.0,5000.0);
		a.     upgradeRAM(4);
		a.enablePerformanceMode() ;
		System.out.println();
	
		Smartphone b = new Smartphone("Techno",30000.0,"2019",1,265,true,5000);
		b.displayInfoo();
		b.powerOn();
		b.applyDiscount(20);
		b.check5GSupport();
		b. batteryLife(5,95);
		b.takePicture();
		System.out.println();
	
		Television c = new Television("LG",16000.0,"2010",5,50,"1024",false);
		c.displayInfoo();
		c.powerOn();
		c.applyDiscount(20);
		c.changeChannel(22) ;
		c.adjustBrightness(109);
		c.enableStreamingMode() ;
		System.out.println();
		
	}

}



