import java.util.Scanner;

public class AnswerTwentyTwo 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        int[] array = new int[5];
        for(int i = 0; i<5; i++)
        {
            System.out.print("Enter the Element "+(i+1)+" :");
            array[i] = scan.nextInt();
        }
        for(int j = 0; j<5; j++)
        {
            System.out.print("The Element "+(j+1)+" is :");
            System.out.println(array[j]);
        }
    }
}
