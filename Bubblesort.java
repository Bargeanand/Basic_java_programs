import java.util.Scanner;
class Bubblesort
{
    static Scanner sc=new Scanner(System.in);
    public static void main(String [] args)
    {
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
            {
                System.out.print(",");
            }
            
        }
        System.out.print("]");
        System.out.println();
        for(int i=0;i<size;i++)
        {
            
            for(int j=0;j<size;j++)
            {
                if(j<size-1){
                if(array[j]>array[j+1])
                {
                    
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }

            }
            
        }
        System.out.println("sorted array");
        System.out.print("[");
        for(int i=0;i<size;i++)
        {
            System.out.print(array[i]);
            if(i<size-1)
            {
                System.out.print(",");
            }
            
        }
        System.out.print("]");

    }
}