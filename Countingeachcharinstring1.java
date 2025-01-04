import java.util.Scanner;
class Countingeachcharinstring1
{
    static Scanner sc=new Scanner(System.in);
    public static void main(String args[])
    {
        System.out.println("enter a string");
        String str=sc.nextLine();
        int charcount[]=new int[65536];
        for(int i=0;i<str.length();i++)
        {
            charcount[str.charAt(i)]++;
        }
        for(int i=0;i<65536;i++)
        {
            if(charcount[i]>0)
            System.out.println((char)i+"="+charcount[i]);
            //(char)i=typecast integer value in character
            //ex if i=65 the it can typecast in char a
        }

    }
}   