import java.util.Scanner;

class Findingcountofeachelementinarray {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("enter the size");
        int size = sc.nextInt();
        int array[] = new int[size];
        int array1[] = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("enter a element");
            array[i] = sc.nextInt();
        }
        int k = 0;

        //array1[0]=array[0];
        for (int i = 0; i < size; i++) {
            boolean found = isKeyFound(array1, array[i]);
            System.out.print(found);
            if (!found) {
                int count = 0;
                for (int j = 0; j < size; j++) {
                    if (array[i] == array[j]) {
                        count++;
                    }
                }
                array1[k] = array[i];
                k++;
                System.out.println(array[i] + "found at" + count + "times");
            } 
        }
    }
    public static boolean isKeyFound(int array1[], int key) {

        boolean keyFound = false;
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] == key) {
                keyFound = true;
                break;
            }
        }
        // System.out.print(key+"  "+keyFound);
        return keyFound;

    }
}
