/*
 N=5
output: 5 4 3 2 1
 */
public class NtoOne 
{
    public static void PrintN(int n)
    {
        if(n==0) return;
        System.out.println(n);
        PrintN(n-1);
    }
    
    public static void main(String[] args) {
        PrintN(5);
    }
    
}
