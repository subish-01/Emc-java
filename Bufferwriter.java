import java.io.*;
public class Bufferwriter
{
    public static void main(String[] args) 
    {
        try
        {
            FileWriter fw  = new FileWriter("Output.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("Hello guys");
            bw.newLine();
            bw.write("Hi");
            bw.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        
    }
}
