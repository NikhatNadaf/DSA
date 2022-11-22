
public class lastOccranEleArray 
{
    public static int lastOcc(int[] arr,int x)
    {
        int lastIndex=-1;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==x)
                lastIndex=i;
        }
        return lastIndex;
        
    }
    public static void main(String[] args) 
    {
        int[] arr={5,6,5,1,5,3};
        System.out.println(lastOcc(arr,5)); //TC:O(N)
        
    }
    
}
