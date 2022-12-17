
public class RearrangeArrayAlternately 
{
     public static void print(int[] arr)
    {
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        
        }
        System.out.println("");
        
    }
   
     public static int[] rearrange(int arr[], int n)
    {
        int r=n-1;
        int l=0;
        int[] a=new int[n];
        int j=0;
        while(l<r)
        {
            a[j++]=arr[r];
            r--;
            a[j++]=arr[l];
            l++;
            
        }
        if(n%2==1)
        {
            a[j]=arr[r];
        }
       
        for(int i=0;i<n;i++)
        {
            arr[i]=a[i];
        }
        
        return arr;//if you have to return orrignal array
        
    }
     //TC:O(N)
     //SP:O(N)
     public static void main(String[] args) 
     {
         int[] arr = {1,2,3,4,5,6};
         print(arr);
         int[] ans=rearrange(arr,arr.length);
         print(ans);
        
    }
     
    
}
