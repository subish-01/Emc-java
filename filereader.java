import java.io.*;
public class filereader 
{
    public static void main(String[] args)
    {
        try
        {
            FileReader fr = new FileReader("Output.txt");
            int data;
            while((data = fr.read()) != -1)
            {
                System.out.print((char)data);
            }
            fr.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }

    }
}
