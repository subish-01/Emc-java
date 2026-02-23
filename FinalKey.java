final class ConstantValues
{
    final double pi = 3.14;
}
class child extends ConstantValues
{
    double pi = 3.15;
}
public class FinalKey
{
    public static void main(String[] args)
    {
        child obj = new child();
        System.out.println(obj.pi);
    }
}
