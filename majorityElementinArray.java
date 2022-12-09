
public class majorityElementinArray 
{
    //element should appearmore than n/2 times
    public static int majorTime(int[] arr)
    {
        int n=arr.length;
        
        int element=0;
        for(int i=0;i<n;i++)
        {
            int count=1;
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]==arr[j])
                    count++;
            }
            if(count>n/2)
                element=arr[i];
            //if u returning index write i
        }
        return element;
    }
    //TC:O(N*N)
    public static void main(String[] args) {
        int[] a={8,7,6,8,6,6,6,6};
        System.out.println(majorTime(a));
    }
    
}
