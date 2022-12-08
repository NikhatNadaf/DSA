
public class maximumConsecutiveOnes 
{
    public static int maxOnes(int[] arr)
    {
        int n=arr.length;
        int count=0;
        int max=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==1)
                count++;
            else
                count=0;
            max=Math.max(count,max);
        }
        return max;
    }
    //TC:O(N)
    public static void main(String[] args) {
        int[] a={1,1,0,0,0,1,1,1,1,1,0,1,0,1,0};
        System.out.println(maxOnes(a));
    }
    
}
