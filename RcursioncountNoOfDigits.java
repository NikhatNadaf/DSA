/*
 N = 12345
output: 5
 */
public class countNoOfDigits 
{
    public static int count(int n)
    {
        if(n/10==0) return 1;
        return count(n/10) + 1;
    }
    
    public static void main(String[] args) {
        System.out.println(count(0));
    }
    
}
