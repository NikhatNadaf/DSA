
package dsa;

public class equalSumPartitionArray 
{
    public static int ArraySum(int[] arr)
    {
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum += arr[i];
        }
        return sum;
    }
    public static boolean equalSum(int[] arr)
    {
        int totalSum=ArraySum(arr);
        int prefSum=0;
        for(int i=0;i<arr.length;i++)
        {
            prefSum += arr[i];
            int sufSum=totalSum-prefSum;
            if(prefSum==sufSum)
            {
                return true;
            }
        }
        return false;
        
    }
    public static void main(String[] args) {
        int[] a={15,5,6,4,8,2};// 15+5=20   and  6+4+8+2=20 both are equals
        System.out.println(equalSum(a));
        //TC:O(2N)
    }
    
}
