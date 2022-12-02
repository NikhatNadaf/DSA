
public class moveZerosToendExtraSpace 
{
     public static void printArr(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
    }
   public static int[] moveZeros(int[] arr)
   {
       int n=arr.length;
       int[] temp=new int[n];
       int count=0;
       int j=0;
       for(int i=0;i<n;i++)
       {
           if(arr[i]!=0)
               temp[j++]=arr[i];
           else
               count++;
       }
       while(count!=0)
       {
           temp[j++]=0;
           count--;
       }
       return temp;
   }
   //  TC:O(N)
   //  SP:O(N)
    public static void main(String[] args) 
    {
        int[] a={0,1,0,3,12,0,5,6};
        printArr(a);
        int[] ans=moveZeros(a);
        printArr(ans);
        
    }
    
}
