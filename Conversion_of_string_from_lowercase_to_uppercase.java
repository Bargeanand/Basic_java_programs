import java.util.Scanner;
class Conversion_of_string_from_lowercase_to_uppercase
{
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a string");
    String str=sc.nextLine();
    String str1="";
    for(int i=0;i<str.length();i++)
    {
        if(str.charAt(i)>=97 && str.charAt(i)<122)
        {
             int j=str.charAt(i)-32;
            str1=str1+(char)j;
            
        }
    }
    System.out.print(str1);
}
}