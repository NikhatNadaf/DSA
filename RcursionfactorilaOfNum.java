/*
 N = 5
output: 120    1*2*3*4*5
 */
public class factorilaOfNum 
{
    public static int printFact(int n)
    {
        if(n==0) return 1;
        return n * printFact(n-1);
    }
    public static void main(String[] args) {
        System.out.println(printFact(5));
    }
    
}
