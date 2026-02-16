public class AnswerThirtyTwo
{
    String getname(String name)
    {
        return name;
    }
    int getphone(int phone)
    {
        return phone;
    }
    public static void main(String[] args)
    {
        AnswerThirtyTwo object = new AnswerThirtyTwo();
        String myname = object.getname("Subish");
        System.out.println(myname);
        long phone_number = object.getphone(850826454);
        System.out.println(phone_number);
    }
}
