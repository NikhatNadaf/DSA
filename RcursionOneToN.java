/*
 N-5
output: 1 2 3 4 5
 */
public class OneToN 
{
    public static void printN(int n)
    {
        if(n==0) return;
        printN(n-1);
        System.out.print(n+" ");
    }
    public static void main(String[] args) {
        printN(5);
    }
    
}
