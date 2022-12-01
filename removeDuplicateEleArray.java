
public class removeDuplicateEleArray 
{
    public static void printArray(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
    }
    public static int[] remove(int[] arr)
    {
        int n=arr.length;
        int[] temp=new int[n];
        int i=0,j=0;
        while(i<n-1)
        {
            if(arr[i]==arr[i+1])
                i++;
            else
            {
                temp[j]=arr[i];
                i++;
                j++;
            }
        }
        temp[j]=arr[i];
        return temp;
    }
    public static void main(String[] args) {
        int[] a={1,2,2,3,4,4,4,5};
        printArray(a);
        int[] ans=remove(a);//TC:O(N)
                            //SP:O(N)
        printArray(ans);
    }
    
}
