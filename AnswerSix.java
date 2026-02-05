import java.util.Scanner;
public class AnswerSix 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the current state of meghana");
        String meghana = scan.nextLine();
        if(meghana.equals("dead"))
        {
            System.out.println("Surya meets Ramya");
        }
        else
        {
            System.out.println("Surya weds meghana");
        }
        scan.close();
    }
}
