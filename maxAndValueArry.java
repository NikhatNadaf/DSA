
public class maxAndValueArry
{
    public static int maxAnd(int arr[],int n)
    {
        int res=0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
               if((arr[i] & arr[j])>res)
               {
                   res=arr[i] & arr[j];
               }
            }
        }
        return res;
    }
    public static void main(String[] args) 
    {
        int arr[]={4, 8, 12, 16}; //Pair (8,12) has the Maximum AND Value 8.
        int n=arr.length;
        System.out.println(maxAnd(arr,n)); //TC:O(N*N)
    }
    
}
