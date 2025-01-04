import java.util.Scanner;
class Displayingmatrixinzizagform
{
    static Scanner sc=new Scanner(System.in);
    public static void main(String [] args)
    {
        int array[][]=arrayinpiut();
        display(array);
        System.out.println();
        displayingmatrixinzizagform(array);
    }
    public static int[][] arrayinpiut()
    {
        System.out.println("enter a size of row");
        int row=sc.nextInt();
        System.out.println("enter a size of col");
        int col=sc.nextInt();
        int array[][]=new int[row][col];
        for(int i=0;i<row;i++)
        {
            System.out.println("enter a element of "+i+" row");
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
    public static void displayingmatrixinzizagform(int array[][])

    {
        for(int i=0;i<array.length;i++)
        {
            for(int j=0;j<array[0].length;j++)
            {
                if(i%2!=0)
                {
                    System.out.print(array[i][array.length-1-j]);
                    System.out.print(" ");
                }
                else{
                    System.out.print(array[i][j]);
                    System.out.print(" ");
                }
                
    }
    System.out.println();
        }
}
}
