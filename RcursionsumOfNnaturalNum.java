/*
N = 5
output: 15...1+2+3+4+5
 */
public class sumOfNnaturalNum 
{
    public static int printSum(int n)
    {
        if(n==0) return 0;
        return n+printSum(n-1);
        
    }
    public static void main(String[] args) {
        System.out.println(printSum(5));
    }
    
}
