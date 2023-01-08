/*
 searching in infinite array there is not limit as high
 */
public class BinarySEarchSreachinInfiniteArray 
{
    public static int search(int[] arr,int k)
    {
        int i=0;
        while(true)
        {
            if(arr[i]==k) return i;
            if(arr[i]>k)  return -1;
        }
        
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18};
        System.out.println(search(arr,2));
    }
    
}

//thise solution causes Time Limit Exceed.
