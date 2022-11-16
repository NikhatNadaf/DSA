
import java.util.Scanner;


public class countSetANDUnsetbits 
{
    public static int[] countBits(int n)
    {
        int set=0, unset=0;
        int[] arr=new int[2];
        while(n!=0)
        {
            if((n & 1)==0)
            {
                unset++;
            }
            else set++;
            n=n>>1;
        }
        arr[0]=set;
        arr[1]=unset;
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int[] ans=countBits(a);
        System.out.println("setbits "+ans[0]);
        System.out.println("unsetbits "+ans[1]);
    }
    
}
