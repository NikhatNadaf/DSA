/*
 * Given an array A[] of N positive integers which can contain integers from 1 to P where elements can be repeated or can be absent from the array. Your task is to count the frequency of all elements from 1 to N.
Note: The elements greater than N in the array can be ignored for counting.
 */
public class FrequenciesofLimitedRangeArrayElements 
{
    public static void printArray(int[] arr ,int n)
    {
        for(int j=0;j<n;j++)
            {
                System.out.print(arr[j]+" ");
            }
        System.out.println("");
        
    }
     public static int[] frequencyCount(int arr[], int N, int P)
    {
        int k=0;
        int[] temp=new int[N];
        for(int i=1;i<=P;i++)
        {
            int count=0;
            
            for(int j=0;j<N;j++)
            {
                if(arr[j]==i)
                {
                    count++;
                }
            }
            temp[k++]=count;
        }
        return temp;
        // code here
    }
     public static void main(String[] args)
     {
         int[] a={2, 3, 2, 3, 5};
         int n=a.length;
         printArray(a,n);
         int[] ans=frequencyCount(a,n,5);
         printArray(ans,ans.length);
         
        
    }
     //TC:O(N*N)
     //SP:O(N)
     
     
     /*
     Input:
N = 5
arr[] = {2, 3, 2, 3, 5}
P = 5
Output:
0 2 2 0 1
Explanation: 
Counting frequencies of each array element
We have:
1 occurring 0 times.
2 occurring 2 times.
3 occurring 2 times.
4 occurring 0 times.
5 occurring 1 time.
     */
    
    
}
