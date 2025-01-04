import java.util.Scanner;
class AnagramString
{
    static Scanner sc=new Scanner(System.in);
    public static void main(String args[])
    {
        System.out.println("enter a stringq1");
        String str1=sc.nextLine();
        System.out.println("enter asgtring2");
        String str2=sc.nextLine();
        int charcount1[]=new int[65536];
       
        boolean isAnagram=true;
        if(str1.length()!=str2.length())
            {
                isAnagram = false;
                System.out.println("string not anagram string");
            }
        else
        {
            for(int i=0;i<str1.length();i++)
            {
                charcount1[str1.charAt(i)]++;
            }

            for(int i=0;i<str2.length();i++)
            {
                charcount1[str2.charAt(i)]--;
            }
            for(int i=0;i<charcount1.length;i++)
            {
             if(charcount1[i] !=0){
                isAnagram = false;
                break;
                
             }   
            }
    }
    if(isAnagram==true)
    {
        System.out.println("string are anagram");
    }
    else{
        System.out.println("not anagram");
    }
}
}

