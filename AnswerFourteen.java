import java.util.Scanner;

public class AnswerFourteen 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your salary: ");
        int salary = scan.nextInt();
        System.out.print("Enter your age: ");
        int age = scan.nextInt();
        if(salary>=20000 || age<= 25)
        {
            System.out.print("Enter the loan amount required: ");
            int loan = scan.nextInt();
            if(loan <= 50000)
            {
                System.out.print("You are eligible for the loan");
            }
            else
            {
                System.out.println("The maximum loan amount is 50000");
            }
        }
        else
        {
            System.out.println("You are not eligible for the loan");
        }
        scan.close();
    }
}
