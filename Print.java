import java.io.PrintWriter;
public class Print{
    public static void main(String args[])
    {
        PrintWriter pw=new PrintWriter(System.out);
        pw.println("Hello world");
        pw.print("this is ");
        pw.print("Statement");
        pw.close();
    }
}