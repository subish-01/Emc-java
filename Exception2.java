import java.util.Scanner;
class DivisionExample
{
    void DivideNumbers(int numerator, int denominator)
    {
        try
        {
            int result = numerator/denominator;
            System.out.println("The division of two numbers is "+result);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Cannot divide by zero "+e);
        }
    }
}
public class Exception2
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Numerator : ");
        int numerator = scan.nextInt();
        System.out.print("Enter the Denominator : ");
        int Denominator = scan.nextInt();
        DivisionExample obj = new DivisionExample();
        obj.DivideNumbers(numerator, Denominator);
    }
}