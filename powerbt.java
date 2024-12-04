public class powerbt
{
    public static void main(String[] args)
    {
    int a=10;
    int pos=1;
    if((a&(1<<pos))!=0)
    {
        System.out.println("Set bit");
    }
    else
    {
        System.out.println("Not a set bit");
    }
    }
}