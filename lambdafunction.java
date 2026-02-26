interface A
{
    void disp();
}
public class lambdafunction 
{
    public static void main(String[] args)
    {
        A obj = ()->
        {
            System.out.println("Hello ");
        };
        obj.disp();
    }
}
