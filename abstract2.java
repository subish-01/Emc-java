abstract class Vehicle
{
    final void StartEngine()
    {
        System.out.println("Engine started");
    }
    static String getVehicleType(String type)
    {
        return type;
    }
    abstract void drive();
}
class Car extends Vehicle
{
    @Override
    void drive() 
    {
        System.out.println("Engage the first gear and press accelerator");
    }
}
class motorcycle extends Vehicle
{
    void drive()
    {
        System.out.println("Rise the accelerator");
    }
}
public class abstract2 
{
    public static void main(String[] args)
    {
        System.out.println(Vehicle.getVehicleType("BS6"));
        motorcycle obj = new motorcycle();
        obj.drive();
    }
}
