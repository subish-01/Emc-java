import java.util.Scanner;
public class AnswerFour 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        String Name = scan.nextLine();
        int score = scan.nextInt();
        scan.nextLine();
        String department = scan.nextLine();
        int scoreOG = score/10;
        System.out.println(Name);
        System.out.println(department);
        System.out.println(scoreOG);
        scan.close();
    }
}
