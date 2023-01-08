/*
 [2,5,8,12,30]
 x = 17
 o/p: true (12,5)

find if tehre is pair with sum x ina sorted array
with TC:O(N)
 */
public class twoPointerApprach 
{
    public static boolean isPair(int[] arr,int n,int x)
    {
     int l=0,h=n-1;
     while(l<=h)
     {
         int sum=arr[l]+arr[h];
         if(sum==x)
             return true;
         else if(sum>x)
             h--;
         else
             l++;
     }
     return false;
    }
    
    public static void main(String[] args) {
        int[] a={ 2,5,8,12,30};
        int n=a.length;
        int x=77;
        System.out.println(isPair(a, n, x));
    }
    
}
