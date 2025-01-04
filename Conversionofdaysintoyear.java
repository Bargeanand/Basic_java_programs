import java.util.Scanner;
class Conversionofdaysintoyear
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a days");
        int days=sc.nextInt();
        int year;
        int rem;
        year=(days/365);
        rem=days%365;
        System.out.println(year +"year" + rem+ "days");    
        System.out.println("enter a weak");
        int weak=sc.nextInt();
        days=weak*7;
        System.out.println("conversion of"+ weak +"weak to days is"+days);

    }
}