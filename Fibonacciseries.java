class Fibonacciseries
{
    public static void main(String args[])
    {
        int f0=0,f1=1;

        for(int i=3;i<=10;i++)
        {
            int f2=f0+f1;
            System.out.println(f2);
            f0=f1;
            f1=f2;
        }
    }
}