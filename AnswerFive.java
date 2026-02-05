import java.util.Scanner;
public class AnswerFive 
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter whether RCB win or lose:");
        String RCB = scan.nextLine();
        if(RCB.equals("win"))
        {
            System.out.println("Ee saala cup namde");
        }
        else
        {
            System.out.println("Cup illa");
        }
        scan.close();
    }
}
