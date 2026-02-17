import java.util.Scanner;
public class AnswerThirtyThree 
{
    void evenorodd(int num)
    {
        if(num%2 == 0)
        {
            System.out.println("The given number is even");
        }
        else
        {
            System.out.println("The given number is odd");
        }
    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = scan.nextInt();
        AnswerThirtyThree obj = new AnswerThirtyThree();
        obj.evenorodd(num);
        scan.close();
    }
}
