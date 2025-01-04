import java.util.Scanner;
class Array
{
    public static void main(String [] args)
    {
        int [] Marks=new int[3];
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int [] number=new int [size];
        Marks[0]=97;
        Marks[1]=34;
        Marks[2]=12;
        int [] marks={20,34,56};
        //int size;
        for(int i=0;i<size;i++)
        {
            number[i]=sc.nextInt();
        }
        
        for(int i=0;i<size;i++)
        {
            System.out.println(number[i]);
        }

    }
}