
public class leadersInArrayNaive 
{
    public static void leaders(int[] arr)
    {
        int n=arr.length;
        
        for(int i=0;i<n;i++)
        {
            boolean flage=true;
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]<arr[j])
                {
                     flage=false;
                     break;
                }
                   
                
            }
            if(flage==true)
                System.out.print(arr[i]+" ");
        }
        
    }
    //TC:O(N*N)
    public static void main(String[] args) {
        int[] a={16,17,4,3,5,2}; //17,5,2
        leaders(a);
    }
    
}
