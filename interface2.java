interface Readable
{
    void read();
}
interface Writable
{
    void write();
}
interface Storable
{
    void store();
}
class database implements Readable , Writable , Storable
{
    @Override
    public void read() 
    {
        System.out.println("Database is readable");
    }
    @Override
    public void write() 
    {
        System.out.println("Database is writable");
    }
    @Override
    public void store() 
    {
        System.out.println("Data can be stored in the database");
    }
}
public class interface2 
{
    public static void main(String[] args)
    {
        database obj = new database();
        obj.read();
        obj.write();
        obj.store();
    }
}
