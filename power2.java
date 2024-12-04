public class power2
{
    public static void main(String[] args)
    {
        int a=24;
        if((a&(a-1))==0)
        {
            System.out.println("power of 2");
        }
        else
        {
            System.out.println("not a power of 2");
        }
    
    }
}