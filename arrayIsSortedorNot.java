
public class arrayIsSortedorNot 
{
    public static boolean isSort(int[] arr)
    {
        boolean is=true;
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]<arr[i-1])
            {
                 is=false;
                 break;
            }
                
               
            
        }
        return is;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,3,4,4,5};
        System.out.println(isSort(arr)); //TC:O(N)
    }
    
}
