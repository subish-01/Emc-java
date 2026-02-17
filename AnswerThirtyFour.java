import java.util.Scanner;

public class AnswerThirtyFour 
{
    static String passorfail(int total_mark)
    {
        if(total_mark >= 35)
        {
            return "You are pass";
        }
        else
        {
            return "you are fail";
        }
    }

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the total marks in Maths: ");
        int total_marks = scan.nextInt();

        String result = passorfail(total_marks);
        System.out.println(result);
        scan.close();
    }
}
