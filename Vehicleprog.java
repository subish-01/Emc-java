class Vehicle
{
    String brand;
    int year;
    void StartEngine()
    {
        System.out.println("Engine of the Vehicle is started");
    }
}
class Car extends Vehicle
{
    String fueltype;
    @Override
    void StartEngine() 
    {
        System.out.println("Car Engine starts");
    }
    void drive()
    {
        System.out.println("Car is driving");
    }
}
class Truck extends Vehicle
{
    int loadcapacity;
    @Override
    void StartEngine() 
    {
       System.out.println("Truck Engine Starts");
    }
    void haul()
    {
        System.out.println("Truck is hauling");
    }
}

public class Vehicleprog 
{
    public static void main(String[] args)
    {
        Truck obj = new Truck();
        obj.brand = "Ashok Leyland";
        obj.year = 1975;
        obj.StartEngine();
        obj.loadcapacity = 10000;
        obj.haul();
        System.out.println(obj.brand);
        System.out.println(obj.year);
        System.out.println(obj.loadcapacity);
    }
}
