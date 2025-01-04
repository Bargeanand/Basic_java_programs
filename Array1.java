import java.util.Scanner;
class Array1
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enetr a size");
        int size=sc.nextInt();
        int evennumbersum=0;
        int oddnumbersum=0;
        int [] Numberarray=new int[size];
        for(int i=0;i<size-1;i++)
        {
            System.out.println("enter a number");
            Numberarray[i]=sc.nextInt();
            
        }
        for(int i=0;i<size-1;i++)
        {
            System.out.println("enter a number"+ Numberarray[i]);
           
            
        }
        for(int i=0;i<size-1;i++)
        {
            if(Numberarray[i]%2==0)
            {
                System.out.println(Numberarray[i]+"no is even");
                evennumbersum=evennumbersum+Numberarray[i];
               // System.out.println("sum of evennumber is"+evennumbersum);
            }
            else{
                System.out.println(Numberarray[i]+"no is odd");
                oddnumbersum=oddnumbersum+Numberarray[i];
                //System.out.println("sum of odd is"+oddnumbersum);
            }
            System.out.println("sum of evennumber is"+evennumbersum);
            System.out.println("sum of odd is"+oddnumbersum);
 
        }
        for(int i=0;i<size-1;i++)
        {
            if(Numberarray[i]%5==0)
            {
                System.out.println(Numberarray[i]+"is divisible by 5");
            }
        }

    }
}