import java.util.Scanner;
class Conversion_of_string_from_uppercase_to_lowercase_and_lowercase_to_upercase
{
    static int i=0;
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a string");
    String str=sc.nextLine();
    int j=0;
    String str1="";
    
    uppercase(str,str1);
    lowercase(str,str1);
  
 }
 public static void uppercase(String str,String str1)
 {
    for(int i=0;i<str.length();i++)
    {
        if(str.charAt(i)>=65 && str.charAt(i)<=90)
        {
            for(int j=i;j<str.length();j++){
            int k=str.charAt(j)+32;
            str1=str1+(char)k;
            break;
        }
    }
    }
    System.out.print(str1);
 }
 public static void lowercase(String str,String str1)
 {
    for(int i=0;i<str.length();i++)
    {
        if(str.charAt(i)>=97 && str.charAt(i)<=122)
        {
            for(int j=i;j<str.length();j++){
            int k=str.charAt(j)-32;
            str1=str1+(char)k;
            break; 
        }
    }
    }
    System.out.print(str1);
 }
 



}