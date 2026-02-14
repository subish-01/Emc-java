import java.util.Arrays;
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
        if(size%2 == 0)
        {
            int mid1 = (low+high)/2;     // Even sized array has two middle elements 
            int mid2 = mid1+1;
            int[] mid1_array = {array[mid1],array[mid2]};
            System.out.print("The middle elements are: ");
            System.out.print(Arrays.toString(mid1_array));
        }
        else
        {
            int mid = (low+high)/2;
            int[] mid_array = {array[mid]};
            System.out.print("The middle element is: ");
            System.out.print(Arrays.toString(mid_array));
        }
    }
}
