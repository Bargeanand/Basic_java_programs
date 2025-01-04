import java.util.Scanner;
class Bubblesort1
{
    static Scanner sc=new Scanner(System.in);

    static  int size=sc.nextInt();
    public static void main(String [] args)
    {
        int array1[]=arrayinput();
        arraydisplay(array1);
        arraysort(array1);
         arraydisplay(array1);

    }public static int [] arrayinput()
    {
        int array[]=new int[size];
        for(int i=0;i<size;i++)
        {
            System.out.println("enter a array element");
            array[i]=sc.nextInt();
        }
        return array;
    }
    public static void arraydisplay(int array[])
    {
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
    public static void arraysort(int array[])
    {
        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size;j++)
            {
                if(j<size-1)
                {
                    if(array[j]>array[j+1])
                    {
                        int temp=array[j];
                        array[j]=array[j+1];
                        array[j+1]=temp;
                    }
                }
            }
        }
    }

}