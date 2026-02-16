public class AnswerThirty 
{
    int apple_price = 20;
    int apple_count = 5;

    void totalmoney()
    {
        int total = apple_count*apple_price;
        System.out.println(total);
    }
    public static void main(String[] args)
    {
        AnswerThirty object = new AnswerThirty();
        object.totalmoney();
    }
}
