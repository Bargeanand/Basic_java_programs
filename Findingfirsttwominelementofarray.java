import java.util.Scanner;
class Findingfirsttwominelementofarray
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
        int min1=Integer.MAX_VALUE;
        int min2=Integer.MAX_VALUE;
        for(int i=0;i<size;i++)
        {
            if(min1>=array[i])
            min1=array[i];
        }
        for(int i=0;i<size;i++)
        {
            if(min2>=array[i] &&array[i]!=min1)
            {
                min2=array[i];
            }
        }
        System.out.println("min1 is"+min1);
        System.out.println("min2 is"+min2);

    }
}    