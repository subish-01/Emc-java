import java.io.*;
public class Bufferreader 
{
    public static void main(String[] args)
    {
        try
        {
            FileReader fr = new FileReader("Output.txt");
            BufferedReader br = new BufferedReader(fr);
            String data;
            while((data = br.readLine()) != null)
            {
                System.out.println(data);
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
