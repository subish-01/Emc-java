import java.util.InputMismatchException;
import java.util.Scanner;
public class Exception 
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        try
        {
            System.out.print("Enter the number 1: ");
            int num1 = scan.nextInt();
            System.out.print("Enter the number 2: ");
            int num2 = scan.nextInt();
            int result = num1/num2;
        }
        catch(ArithmeticException e)
        {
            System.out.println("Arithmetic exception handled "+e);
        }
        catch(InputMismatchException e)
        {
            System.out.println("Input mismatch handled "+e);
        }
    }
}
