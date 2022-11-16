

import java.util.Scanner;


public class CountTotalSetbits 
{
    public static int largestPow(int n)
    {
        int x=0;
        while((1<<x)<=n)
        {
            x++;
        }
        return x-1;
    }
     public static int countSetBits(int n)
    {
        if(n==0)
        {
            return 0;
        }
        int x=largestPow(n);
        int b=x*(1<<(x-1));
        int m=n-(1<<x)+1;
        int res=n-(1<<x);
        int ans=b+m+countSetBits(res);
        return ans;
        // Your code here
        
    }
    
        // Your code here
        
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
         System.out.println(countSetBits(a));
    }
    
}
