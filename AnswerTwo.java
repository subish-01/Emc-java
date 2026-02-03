import java.util.Scanner;
public class AnswerTwo 
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String Name = scan.nextLine();
        int Age = scan.nextInt();
        scan.nextLine();
        String Address = scan.nextLine();
        System.out.println(Name);
        System.out.println(Age);
        System.out.println(Address);
    }
}
