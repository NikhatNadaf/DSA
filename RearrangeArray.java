/*
Given an array arr[] of size N where every element is in the range from 0 to n-1. 
Rearrange the given array so that arr[i] becomes arr[arr[i]].
arr[i]=arr[arr[i]]

arr[] = {4,0,2,1,3}
Output: 3 4 2 0 1
Explanation: 
arr[arr[0]] = arr[4] = 3.
arr[arr[1]] = arr[0] = 4.
and so on.
 
 */
public class RearrangeArray 
{
      public static void print(long[] arr)
    {
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        
        }
        System.out.println("");
        
    }
    static void arrange(long arr[], int n)
    {
        long[] temp=new long[n];
        int j=0;
        for(int i=0;i<n;i++)
        {
            temp[j++]=arr[(int)arr[i]];
            
        }
        for(int i=0;i<n;i++)
        {
            arr[i]=temp[i];
        }
        // your code here
    }
    //TC:O(N)
    //SP:O(N)
    public static void main(String[] args) {
        long[] arr={4,0,2,1,3};
        print(arr);
        arrange(arr,arr.length);
        print(arr);
    }
    
    
}
