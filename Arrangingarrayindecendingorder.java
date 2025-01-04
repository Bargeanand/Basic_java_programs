import java.util.Scanner;
class Arrangingarrayindecendingorder
{
    public static void main(String [] args)
    {
                Scanner sc=new Scanner(System.in);
        System.out.println("enter a size");
        int size=sc.nextInt();
        int array[]=new int[size];
        for(int i=0;i<size;i++)
        {
            System.out.println("enter a array element");
            array[i]=sc.nextInt();
        }
        System.out.print("[");
        for(int i=0;i<size;i++)
        {
            System.out.print(array[i]);
            if(i<size-1)
            System.out.print(",");
        }
        System.out.print("]");
        System.out.println();
        System.out.println("decending ordered array");
        System.out.print("[ ");
 
        for(int i=0;i<size;i++)
        {
            for(int j=i;j<size;j++)
            {
                if(array[i]<=array[j])
                {
                    int k=array[i];
                    array[i]=array[j];
                    array[j]=k;
                }    
            }
            System.out.print(array[i]);
            if(i<size-1)
            System.out.print(","); 
        }
        System.out.print("]");
    }
}