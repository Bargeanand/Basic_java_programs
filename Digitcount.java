import java.util.Scanner;

class Digitcount
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a digit");
        int n=sc.nextInt();
        int count=0;
        //int rem;
        while(n!=0)
        {
           
                count++;
            
            n=n/10;
        }
        System.out.println("count is"+count);
    }
}