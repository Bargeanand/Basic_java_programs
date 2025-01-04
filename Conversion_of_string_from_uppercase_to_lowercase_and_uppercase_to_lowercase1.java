import java.util.Scanner;
class Conversion_of_string_from_uppercase_to_lowercase_and_uppercase_to_lowercase
{
    static int i=0;
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a string");
    String str=sc.nextLine();
    String str1="";
    Uppercase_to_lowecase_ans_lowercase_to_uppercase(str,str1);
    
    
    
}public static void Uppercase_to_lowecase_ans_lowercase_to_uppercase(String str,String str1)
{
    while(i<str.length())
    {
        if(str.charAt(i)>=65 ||str.charAt(i)<90)
        {
             int j=str.charAt(i)+32;
            str1=str1+(char)j;
            i++;
        }
        if(str.charAt(i)>=97 ||str.charAt(i)<122)
        {
             int j=str.charAt(i)-32;
            str1=str1+(char)j;
            i++;
        }
        System.out.print(str1);
    } 
}
}