class Exception_Handling_throw_keyword_cases extends RuntimeException
{
    //case 1
    // static ArithmeticException e=new ArithmeticException();
    // public static void main(String args[])
    // {
    //     throw e;
    // }
    //case2
    // static ArithmeticException e;
    
    //     public static void main(String args[])
    //     {
    //         throw e;
    //  
    // public static void main(String args[])
    // {
    //     throw new ArithmeticException("/by zero");
    //     System.out.println("hello");
    // }
    //case 4:
    // public static void main(String args[])
    // {
    //     throw new Exception_Handling_throw_keyword_cases();//name of class cannot be used for exception cause it is not thowable type

    // }
    //case 5:
    public static void main(String args[])
    {
     
          throw new Exception_Handling_throw_keyword_cases();
    }
}