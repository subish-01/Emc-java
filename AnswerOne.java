import java.util.Scanner;
public class AnswerOne 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        String Name = scan.nextLine();
        int Age = scan.nextInt();
        System.out.println(Name);
        System.out.println(Age);
        scan.close();
    }
}
