import java.util.Scanner;
class Findingfirsttwolargestelementofarray
{
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a size");
    int size=sc.nextint();
    int array[]=new int[size];
    int max1=array[0];
    int max2=aray[0];
    for(int i=0;i<=size-1;i++)
    {
        System.out.println("enter a number");
         array[i]=sc.nextInt();
    }
    System.out.print("[");
    for(int i=0;i<=size-1;i++)
    {
        System.out.print(array[i]);
        if(i<size-1)
        System.out.print(",");
    }
    System.out.println("]");
    for(int i=0;i<size;i++)
    {
        if(max1<=array[i])
        max1=array[i];
    }
    for(int i=0;i<size;i++)
    {
        if(max2<array[i] && max2<max1)
        max2=array[i];
    }
    System.out.println("max1 is"+max);
    System.out.println("max2 is"+max2);
    }
}