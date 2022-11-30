
public class updateiThEleArray 
{
     public static void printArra(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
    }
     public static void updatIth(int[] arr,int ith,int val)
     {
         arr[ith]=val;
     }//TC:O(1)
     public static void main(String[] args) {
        int[] a={0,1,2,3,4,5,6,7,8,9};
         printArra(a);
         updatIth(a,3,33);
         printArra(a);
    }
    
}
