class Exception_Handling_User_defined_or_Custmized_Exception
{
    public static void main(String args[])throws Exception
    {
        int amount,balance;
        if(amount>balance)
        {
            throw new InsufficentBalanceException();
        }
    }
}