import java.util.Scanner;
class Additionoftwoarray
{
    static Scanner sc=new Scanner(System.in);
    public static void main(String [] args){
    int array1[]= arrayinput();
    int array2[]=arrayinput();
    int array3[]=new int[array1.length >= array2.length ? array1.length : array2.length];
    
    System.out.println("orignalArray");
    arraydisplay(array1);
    arraydisplay(array2);
    arrayaddition(array3,array1,array2);
    arraydisplay(array3);
}
public static int[] arrayinput()
{
    System.out.println("enter a size");
    int size=sc.nextInt();
    int array[] =new int[size];
    for(int i=0;i<array.length;i++)
    {
        System.out.println("enter a array element");
        array[i]=sc.nextInt();
    }
    return array;
}
public static void arraydisplay(int array[])
{
    System.out.print("[");
    for(int i=0;i<array.length;i++)
    {
        System.out.print(array[i]);
        if(i<array.length-1)
        {
            System.out.print(",");
        }
    }
    System.out.print("]");
}
public static void arraycopy(int orignalArray[],int copyArray[])
{
    for(int i=0;i<orignalArray.length;i++)
    {
        copyArray[i]=orignalArray[i];
    }
}
public static void arrayaddition(int reasult[],int FirstArray[],int SecondArray[])
{
    if(FirstArray.length<=SecondArray.length){
        int i=0;
        for( i=0;i<FirstArray.length;i++){
            reasult[i]=FirstArray[i]+SecondArray[i];
        }
        for(int j=i;j<SecondArray.length;j++){
            reasult[j]= SecondArray[j];
        }
    }else
    {
        int i=0;
        for(i=0;i<SecondArray.length;i++){
            reasult[i]=FirstArray[i]+SecondArray[i];
        }
        for(int j=i;j<FirstArray.length;j++){
            reasult[j]= FirstArray[j];
        }
    }
}
}