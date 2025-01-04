class Exception_Handling_throws_keyword_multiple_method//for class we cannot used throws keyword
//we can use throws keyword for mathods and constructor
{
    public static void main(String args[])throws InterruptedException
    {
        dostuff();
    }
    public static void dostuff()throws InterruptedException
    {
        domorestuff();
    }
    public static void domorestuff()throws InterruptedException
    {
        Thread.sleep(1000);
    }

    
}