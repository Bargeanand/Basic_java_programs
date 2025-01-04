import java.io.File;
import java.io.*;
class Excepton_Handling_throws_keyword//throw keyword are not recomanded to use casue Abonormal termination and it is used for checked exception
{
    public static void main(String args[])throws Exception
    {
        PrintWriter pw=new PrintWriter("abc.txt");
        pw.println("hello");
        System.out.println("file not found");
    }
}