import java.util.Scanner;
class Addingpreviousarrayelementintcurrentelement
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a size");
        int size=sc.nextInt();
        int array[]=new int[size];
       int ans=0;
        for(int i=0;i<size;i++)
        {
            System.out.println("enter a array element");
            array[i]=sc.nextInt();
        }
         System.out.print("[");
        for(int i=0;i<1;i++)
        {
            array[i]=array[i]+array[i+1];
             for(int j=0;j<size;j++)
             {
                System.out.print(array[i]);
                if(j+1<size){
                array[i]=array[i]+array[j+1];}
                if(j<size-1)
                System.out.print(",");
             }
             System.out.print("]");
        }
    }
}