import java.util.Scanner;

public class AnswerFifteen 
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number 1: ");
        int num1 = scan.nextInt();
        System.out.print("Enter the number 2: ");
        int num2 = scan.nextInt();
        String result = num1>num2? "Number "+num1+" is greater": "Number "+num2+" is greater";
        System.out.println(result);
    }
}
