
public class longestEvenOddSubArrEff 
{
    public static int subMAx(int[] arr)
    {
        int n=arr.length;
        int sts=1;
        int lng=1;
        for(int i=1;i<n;i++)
        {
            if(((arr[i]%2==0) && (arr[i-1]%2==1) || (arr[i]%2==1) && arr[i-1]%2==0))
            {
                sts++;
                lng=Math.max(sts,lng);
            }
            else
                sts=1;
        }
        return lng;
    }
    //TC:O(N)
    public static void main(String[] args) {
        int[] a={5,10,20,6,3,8};
        System.out.println(subMAx(a));
    }
    
}
