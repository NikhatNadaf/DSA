
public class leadersinArrayEff 
{
    public static void leaders(int[] arr)
    {
        int n=arr.length;
        int curr_lead=arr[n-1];
        System.out.print(curr_lead);
        for(int i=n-2;i>=0;i--)
        {
            if(arr[i]>curr_lead)
            {
                curr_lead=arr[i];
                System.out.print(" "+curr_lead);
            }
        }
    }
    public static void main(String[] args) {
        int[] a={16,17,4,3,5,2};
        leaders(a);
    }
}
