import java.util.Scanner;
class Findingfactorofnumber
{
    public static void main(String [] args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        int i=1;
        while(n>=i)
        {
            if(n%i==0)
            System.out.println(i);
            i++;
        }

    }
}