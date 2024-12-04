public class nestedif
{
    public static void main(String[] args)
    {
        int a=16;
        int b=23;
        int c=12;
        if(a<b){
            if(a<c){
                System.out.println("a is smaller");
            }else{
                System.out.println("c is smaller");
            }
        }
        else{
            System.out.println("b is smaller");
        }
    }
}
