import java.util.Scanner;

public class AnswerTen 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int number = scan.nextInt();
        if((number & 1) == 1)
        {
            System.out.println("The given number is odd");
        }
        else
        {
            System.out.println("The given number is even");
        }
        scan.close();
    }
}
