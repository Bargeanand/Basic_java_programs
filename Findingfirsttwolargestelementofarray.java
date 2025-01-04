import java.util.Scanner;
class Findingfirsttwolargestelementofarray
{
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a size");
    int size=sc.nextInt();
    int array[]=new int[size];
    
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
    int max1=Integer.MIN_VALUE;//used for taking minimum value
    int max2=Integer.MIN_VALUE;
   
    for(int i=0;i<size;i++)
    {
        if(max1<=array[i])
        max1=array[i];
    }
    
    for(int i=0;i<size;i++)
    {
        if(max2<=array[i] && array[i]!=max1)
        
        {max2=array[i];}
    }
    System.out.println("max1 is"+max1);
    System.out.println("max2 is"+max2);
    }
}