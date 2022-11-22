
public class NoOOccrncesElementArry
{
    public static int NoOccrnce(int[] arr,int x)
    {
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==x)
                count++;
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr={5,6,5,1,5,3};
        System.out.println(NoOccrnce(arr,7)); //TC:O(N)
    }
    
    
}
