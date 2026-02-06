import java.util.Scanner;

public class AnswerThirteen 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the colour of the traffic signal: ");
        String light = scan.nextLine();
        if(light.equals("red"))
        {
            System.out.println("Stop");
        }
        else if(light.equals("yellow"))
        {
            System.out.println("Get ready");
        }
        else
        {
            System.out.println("Go");
        }
        scan.close();
    }
}
