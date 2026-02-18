public class AnswerThirtyFive 
{
    void sum(int num1, int num2)
    {
        System.out.println("The addition of two numbers is "+(num1+num2));
    }
    void sum(int a,int b, int c)
    {
        System.out.println("The addition of three numbers are "+(a+b+c));
    }
    public static void main(String[] args)
    {
        AnswerThirtyFive obj = new AnswerThirtyFive();
        obj.sum(10,20);
        obj.sum(10,20,30);
    }
}
