interface Playable
{
    void play();
}
class Guitar implements Playable
{
    @Override
    public void play() 
    {
        System.out.println("Guitar sounds like vibration");
    }
}
class Piano implements Playable
{
    @Override
    public void play() 
    {
        System.out.println("Piano sounds good");
    }
}
public class Music 
{
    public static void main(String[] args)
    {
        Guitar obj1 = new Guitar();
        Piano obj2 = new Piano();
        obj1.play();
        obj2.play();
    }
}
