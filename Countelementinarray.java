import java.util.Scanner;

class Countelementinarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a size");
        int size = sc.nextInt();
        int array[] = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("enter a array element");
            array[i] = sc.nextInt();
        }
    
        System.out.println("enter a element you want to search");
        int key = sc.nextInt();
        int count = 0;
        
        for (int i = 0; i < size; i++) {
            if (key == array[i]) {
                count++;
                System.out.println("Found At index " + i);
            }
        }
            if(count==0)
        {
            System.out.println(key +" not Found ");
        }else
        System.out.println(key +"Found "+ count + " times");
}
                 
}


 

