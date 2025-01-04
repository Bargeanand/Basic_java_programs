import java.util.Scanner;
class Countingwordinstring
{
    static Scanner sc=new Scanner(System.in);
    public static void main(String args[])
    {
        System.out.println("enter a string");
        String str=sc.nextLine();
        String str1=str.trim();
        int count=0;
        for(int i=0;i<str1.length()-1;i++)
        {
            if(str1.charAt(i)!=' '&& str1.charAt(i+1)==' ')
            {
                count++;
            }
        }
        if(!str.isEmpty())
        {
            count++;
        }
        System.out.print(count);


    }
}