import java.util.Scanner;
public class AnswerNine 
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num1 = scan.nextInt();
        if(num1 % 3 == 0 && num1%5 ==0 )
        {
            System.out.println("The number "+num1+" is divisible by both 3 and 5");
        }
        else if(num1 %3 ==0)
        {
            System.out.println("The number "+num1+" is divisible by 3");
        }
        else if(num1 % 5 ==0)
        {
            System.out.println("The number "+num1+ " is divisible by 5");
        }
        else 
        {
            System.out.println("The number "+num1+" is not divisible by both 3 and 5");
        }
        scan.close();
    }
}
