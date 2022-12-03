
public class frequenciesSortedArrayNaive 
{
    public static void freqSorted(int[] arr)
    {
        int n=arr.length;
        int freq;
        for(int i=0;i<n;i=i+freq)
        {
             freq=1;
            for(int j=i+1;j<n;j++)
            {
               if(arr[i]==arr[j])
                   freq++;
            }
            System.out.println(arr[i]+" "+freq);
        }
    }
    public static void main(String[] args) {
        int[] a={10,10,10,20,20,30,30,40,50};
        freqSorted(a);//TC:O(N)
    }
    
}
