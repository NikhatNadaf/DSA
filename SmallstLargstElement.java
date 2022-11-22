
import java.lang.reflect.Array;
import java.util.Arrays;


public class SmallstLargstElement 
{
    public static int[] smallLrg(int[] arr)
    {
        int[] ans=new int[2];
        Arrays.sort(arr);
        ans[0]=arr[0];
        ans[1]=arr[arr.length-1];
        return ans;
    }
    public static void main(String[] args) {
         int[] arr={5,8,1,3,6,2};
        int[] ans=smallLrg(arr);
        System.out.print(ans[0]+" "+ans[1]); //TC:O(1)
    }
    
}
