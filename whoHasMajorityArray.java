/*
Given an array arr[] of size N and two elements x and y, use counter variables to find which element appears most in the array, x or y. If both elements have the same frequency, then return the smaller element.
Note:  We need to return the element, not its count
*/
public class whoHasMajorityArray 
{
    
    public static int majorityWins(int arr[], int n, int x, int y) 
    {
        int xcount=0;
        int ycount=0;
        
        for(int i=0;i<n;i++)
        {
            if(arr[i]==x)
            {
                xcount++;
            }
            else if(arr[i]==y)
            {
                ycount++;
            }
        }
        if(xcount==ycount)
        {
            return Math.min(x, y);
            
        }
        if(xcount>ycount)
        {
            return x;
        }
        else
        {
            return y;
        }
        
    }
    public static void main(String[] args)
    {
        int[] a={1,1,2,2,3,3,4,4,4,4,5};
        int n=a.length;
        int x=4,y=5;
        System.out.println(majorityWins(a, n, x, y));
        //TC:O(N)
        
    }
    
}
