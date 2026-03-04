class A implements Runnable
{
    public void run()
    {
        System.out.println("HEllo guys");
    }
}
public class Runinterface 
{
    public static void main(String[] args)
    {
        A obj = new A();
        Thread t1 = new Thread(obj);
        t1.start();
    }
}
