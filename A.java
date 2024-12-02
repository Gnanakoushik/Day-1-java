import java.util.*;
public class A{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        int b=sc.nextInt();
        String c=String.format("My name is %s and my name is %d",a,b);
        System.out.println(c);
    }
}