import java.util.Scanner;
class Displayingmatfixinlform
{
    static Scanner sc=new Scanner(System.in);
    public static void main(String [] args)
    {
        int array1[][]=arrayinput();
        display(array1);
        System.out.println();
        displayingmatfixinlform(array1);
    }
    public static int [][]arrayinput()
    {
        System.out.println("enter a size ofrow");
        int row=sc.nextInt();
        System.out.println("enter a size of col");
        int col=sc.nextInt();
        
        

        int array[][]=new int[row][col];
        for(int i=0;i<row;i++)
        {System.out.println("enter a array element of "+i+" row");
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
public static void displayingmatfixinlform(int array[][])
{
    for(int i=0;i<array.length;i++)
    {
        for(int j=0;j<array[0].length;j++)
        {
            if(i!=0 && i!=array.length-1)
            {
                
                System.out.print(array[i][j]);
                System.out.print("    ");
                
                
                //System.out.print(array[i][array.length-1-j]);
                break;
                
            }
            else if(i==0){
                System.out.print(array[i][j]);
                System.out.print(" ");
            }
            else
            {
                System.out.print(array[i][array.length-1-j]);
                    System.out.print(" ");
            }
        }
        System.out.println();
    }
}
}
