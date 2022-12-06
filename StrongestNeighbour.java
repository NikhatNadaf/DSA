
public class StrongestNeighbour 
{
    static void maximumAdjacent(int sizeOfArray, int arr[])
    {
        
        for(int i=1;i<sizeOfArray;i++)
        {
            if(arr[i]>=arr[i-1])
            {
                System.out.print(arr[i]+" ");
            }
            else if(arr[i]<=arr[i-1])
            {
                System.out.print(arr[i-1]+" ");
                /*
                78,78,46,30
                output:78,78,46
                */
            }
        }
    }
    //TC:O(N)
    public static void main(String[] args) 
    {
        int[] a={1,2,2,3,4,5};
        int n=a.length;
        maximumAdjacent(n, a);  
        /*
        Maximum of arr[0] and arr[1]
        is 2, that of arr[1] and arr[2] is 2, ...
        and so on. For last two elements, maximum 
        is 5.
        */
        
    }
        
    
}
