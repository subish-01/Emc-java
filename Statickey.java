class Counter
{
    static int count = 0 ;
    int instancenumber = 0;
    Counter()
    {
        count++;
        instancenumber++;
    }
    void disp()
    {
        System.out.println("Instance variable count "+instancenumber);
        System.out.println("Static variable count "+count);
    }
}
public class Statickey 
{
    public static void main(String[] args)
    {
        Counter obj1 = new Counter();
        obj1.disp();
        Counter obj2 = new Counter();
        obj2.disp();
        Counter obj3 = new Counter();
        obj3.disp();
    }
    
}
