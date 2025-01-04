import java.util.Scanner;
class Conversion_of_string_from_uppercase_to_lowercase_and_uppercase_to_lowercase
{
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a string");
    String str=sc.nextLine();
    String str1="";
    Uppercase(str,str1);
    Lowercase(str,str1);
    
}public static void Uppercase(String str,String str1)
{
    for(int i=0;i<str.length();i++)
    {
        if(str.charAt(i)>=65 ||str.charAt(i)<90)
        {
             int j=str.charAt(i)+32;
            str1=str1+(char)j;
            
        }
    }
    System.out.print(str1);
}
public static void Lowercase(String str,String str1)
{
   for(int i=0;i<str.length();i++)
    {
        if(str.charAt(i)>=97 ||str.charAt(i)<122)
        {
             int j=str.charAt(i)-32;
            str1=str1+(char)j;
            
        }
    }
    System.out.print(str1);
}

}