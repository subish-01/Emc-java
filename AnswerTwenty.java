public class AnswerTwenty 
{
    public static void main(String[] args) 
    {
        int evencount = 0;
        for(int i= 1 ; i<=10; i++)
        {
            if(i%2==0)
            {
                evencount++;
            }
        }
        System.out.println("The number of even numbers from 1 to 10 is "+evencount);
    }
}
