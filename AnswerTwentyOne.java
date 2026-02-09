public class AnswerTwentyOne 
{
    public static void main(String[] args) 
    {
        for(int i = 1; i<=100; i++)
        {
            if(i%3 == 0 && i%5 ==0)
            {
                System.out.println("The numbers which are divisible by both 3 and 5 from 1 to 100 are: "+i);
            }
        }
    }
}
