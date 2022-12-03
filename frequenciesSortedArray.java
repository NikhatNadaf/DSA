
public class frequenciesSortedArray
{
    public static void main(String[] args) {
        int[] a={10,10,10,30,30,40,40,50,60};
        int n=a.length;
        int i=1,freq=1;
        while(i<n)
        {
            while(i<n && a[i]==a[i-1])
            {
                freq++;
                i++;
            }
            System.out.println(a[i-1]+" "+freq);
            i++;
            freq=1;
            
        }
        
        if(a[n-1]!=a[n-2])
            System.out.println(a[n-1]+" "+1);
    }
    //TC:O(N)
    
}
