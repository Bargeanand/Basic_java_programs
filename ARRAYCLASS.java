import java.util.Scanner;

public class ARRAYCLASS{

    int[] array ;
    int SIZE;
    Scanner sc = new Scanner(System.in);
    ARRAYCLASS(){

        System.out.println("Enter the array Size");
        SIZE = sc.nextInt();
        array = new int[SIZE];
        
        
    }
    int[] initializedArray(){

        for(int i=0 ;i<SIZE;i++){
            System.out.println("enter array element");
            array[i]=sc.nextInt();
        }
        return array;
    }
    void displayarray(int[] array)
    {
        System.out.print("[");
        for(int i=0;i<SIZE;i++)
        {
            System.out.print(array[i]);
            if(i<SIZE)
            System.out.print(",");
        }
        System.out.print("]");
    }

    void evenNumber(int[] array){

        for(int i=0 ;i<array.length;i++){
            if(array[i]%2==0){
                System.out.println(array[i]);
            }
        }

    }



}