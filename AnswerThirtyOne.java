public class AnswerThirtyOne
{
    void sum(int num1,int num2)
    {
        int sum = num1+num2;
        System.out.println("The addition of two numbers is "+sum);
    }
    void subtract(int num1,int num2)
    {
        int subtract = num1 - num2;
        System.out.println("The subtraction of two numbers is "+subtract);
    }
    void multiplication(double num1,double num2)
    {
        double multiply = num1*num2;
        System.out.println("The multiplication of two numbers is "+multiply);
    }
    void divide(int num1, int num2)
    {
        double divide = num1/num2;
        System.out.println("The division of two numbers is "+divide);
    }
    public static void main(String[] args)
    {
        AnswerThirtyOne object = new AnswerThirtyOne();
        object.sum(10,20);
        object.subtract(20,30);
        object.multiplication(10.5,4.2);
        object.divide(10,20);
    }
}
