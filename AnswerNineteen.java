public class AnswerNineteen 
{
    public static void main(String[] args) 
    {
        int odd = 0;
        for(int i = 1; i<=10; i++)
        {
            if(i%2!=0)
            {
                odd++;
            }
        }
        System.out.println("Number of odd numbers from 1 to 10 is "+odd);
    }
}
