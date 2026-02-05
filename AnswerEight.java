import java.util.Scanner;

public class AnswerEight 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your income: ");
        int income = scan.nextInt();
        if(income>7000)
        {
            System.out.println("You are eligible for the scholarship");
        }
        else
        {
            System.out.println("You are not eligible for the scholarship");
        }
        scan.close();
    }
}
