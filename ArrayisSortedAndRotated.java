/*
 Input:
N = 4
arr[] = {3,4,1,2}
Output: Yes
Explanation: The array is sorted 
(1, 2, 3, 4) and rotated twice 
(3, 4, 1, 2)
 */
public class ArrayisSortedAndRotated 
{
    public static boolean checkRotatedAndSorted(int arr[], int num)
    {
        //minimum element and its index
        int mE=Integer.MAX_VALUE,mI=0;
        for(int i=0;i<num;i++)
        {
            if(arr[i]<mE)
            {
                mE=arr[i];
                mI=i;
            }
        }
       // System.out.println("min "+mE);
        
        
        boolean flag1=false;
        for(int i=1;i<mI;i++)
        {
            if(arr[i]>arr[i-1])
            {
                flag1=true;
            }
        }
        
        boolean flag2=false;
        for(int i=mI+1;i<num;i++)
        {
            if(arr[i]>arr[i-1])
            {
                flag2=true;
            }
        }
        
        if(flag1==true && flag2==true  && (arr[num - 1] < arr[0]))
        {
            return true;
        }
        return false;
        
         
    }
    public static void main(String[] args) {
    int arr[] = {10,20,30,40,3,50};
    int n=arr.length;
        System.out.println(checkRotatedAndSorted(arr, n));
    }

    
}
