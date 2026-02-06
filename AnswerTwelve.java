import java.util.Scanner;

public class AnswerTwelve 
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the mark of subject 1: ");
        int mark1 = scan.nextInt();
        System.out.print("Enter the mark of subject 2: ");
        int mark2 = scan.nextInt();
        System.out.print("Enter the mark of subject 3: ");
        int mark3 = scan.nextInt();
        System.out.print("Enter the mark of subject 4: ");
        int mark4 = scan.nextInt();
        System.out.print("Enter the mark of subject 5: ");
        int mark5 = scan.nextInt();
        int sum = mark1+mark2+mark3+mark4+mark5;
        System.out.println("Your total mark is :"+sum);
        float Average = sum / 5;
        if(Average < 35)
        {
            System.out.println("Additional class is required");
        }
        else
        {
            System.out.println("You are good to go");
        }
        scan.close();
    }
}
