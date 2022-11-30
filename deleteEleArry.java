
public class deleteEleArry 
{
     public static void printArra(int[] arr,int n)
    {
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
    }
     public static void delete(int[] arr,int val)
     {
         for(int i=0;i<arr.length;i++)//0 to val
         {
             if(arr[i]==val)
             {
                 for(int j=i;j<arr.length-1;j++)//val to n
                 {
                     arr[j]=arr[j+1];
                 }
                 
             }
         }
     }
     // TC:O(N)
     public static void main(String[] args) {
        int[] a={7,9,4,3,5,66,22,11,44};
         printArra(a,a.length);
         delete(a,4);
         printArra(a,a.length-1);
    }
    
}
