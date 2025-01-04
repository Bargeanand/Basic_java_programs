import java.util.Scanner;
class Findingmaxelementofarray
{
    public static void main(String []args){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a size");
    int size=sc.nextInt();
    int array[]=new int[size];
    int max=0;
    //int i=0;
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
    max=array[0];
    for(int i=0;i<=size-1;i++)
    {
         
        if(max<=array[i])
        max=array[i];
        
    }
    int min=array[0];
    for(int i=0;i<=size-1;i++)
    {
        if(min>array[i])
        min=array[i];

    }
    System.out.println("max is"+max);
    System.out.println("min is"+min);
}
}