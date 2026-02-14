import java.util.Scanner;

public class AnswerTwentySix 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size of an array: ");
        int size = scan.nextInt();
        int[] array = new int[size];     // creating an empty array
        int low = 0;                        //initialized pointers
        int high = size-1;
        for(int i = 0; i<size; i++)
        {
            System.out.print("Enter the Element "+(i+1)+" : ");        
            array[i] = scan.nextInt();                  //getting elements for array
        }
    }
}
