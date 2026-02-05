import java.util.Scanner;

public class AnswerSeven 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your mark in examination: ");
        int mark = scan.nextInt();
        if(mark>35)
        {
            System.out.println("You are pass ");
        }
        else
        {
            System.out.println("You failed in the examination");
        }
    }
}
