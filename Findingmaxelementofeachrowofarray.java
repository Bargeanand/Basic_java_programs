import java.util.Scanner;
class Findingmaxelementofeachrowofarray
{
    static Scanner sc=new Scanner(System.in);
    public static void main(String [] args)
    {
        int array1[][]=arrayinput();
        display(array1);
        maxelementofeachrow(array1);
    
    }
    public static int[][] arrayinput()
    {
        System.out.println("enter a row");
        int row=sc.nextInt();
        System.out.println("enter a col");
        int col=sc.nextInt();
        int array[][]=new int[row][col];
        for(int i=0;i<row;i++)
        {
            System.out.println("enter a "+i+" row element");
            for(int j=0;j<col;j++)
            {
                array[i][j]=sc.nextInt();
            }
            System.out.println();
        }
        return array;
    }
    public static void display(int array[][])
    {
        for(int i=0;i<array.length;i++)
        {
            for(int j=0;j<array[0].length;j++)
            {
                System.out.print(array[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void maxelementofeachrow(int array[][])
    {
        for(int i=0;i<array.length;i++)
        {
            int max1=Integer.MIN_VALUE;
            int max2=Integer.MIN_VALUE;
            for(int j=0;j<array[0].length;j++)
            {
                if(max1<array[i][j])
                {
                    max1=array[i][j];
                }
            }
            for(int j=0;j<array[0].length;j++)
            {
                if(max2<array[i][j]&&array[i][j]!=max1)
                {
                    max2=array[i][j];
                }
            }
            System.out.println(" first max element of "+i+" row is "+max1);
            System.out.println(" second max element of "+i+" row is "+max2);
        }
    }

}