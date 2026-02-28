
import java.io.*;
public class filewriter 
{
    public static void main(String[] args)
    {
        try
        {
        FileWriter fw = new FileWriter("Output.txt");
        fw.write("Hello world");
        fw.close();
        System.out.println("Message written succesfully");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
