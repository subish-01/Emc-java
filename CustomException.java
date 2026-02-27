import java.util.*;

class InvalidAgeException extends Exception
{
    public InvalidAgeException(String s)
    {
        super(s);
    }
}
class AgeValidator
{
    void checkAge(int age) throws InvalidAgeException
    {
            if(age < 0 || age > 150)
            {
                throw new InvalidAgeException("Age cannot be less than zero Or greater than 150");
            }
            else
            {
                System.out.println("Valid age");
            }
        }
    }
public class CustomException 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scan.nextInt();
        AgeValidator obj = new AgeValidator();
        try
        {
        obj.checkAge(age);
        }
        catch(InvalidAgeException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
