
import java.util.Scanner;

class Solution
{
    
    public int exactly3Divisors(int N)
    {
        int count=0;
        int val=0;
        for(int i=4;i<=N;i++)
        {
            for(int j=1;j<=i;j++)
            {
                if(i%j==0)
                {
                    count++;
                }
            }
            if(count==3)
            {
                 val++;
            }
               
        }
        return val;
        //Your code here
    }
}

public class Only3divisors 
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        Solution s=new Solution();
        System.out.println(s.exactly3Divisors(a));
    }
    
}
