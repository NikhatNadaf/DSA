
public class stockBuySell 
{
    public static int bestTime(int[] arr)
    {
        int n=arr.length;
        int min=arr[0]; //buying price--->selecting minimum price for buying
        int prof=0;
        for(int i=1;i<n;i++) //selling price
        {
            int cost=arr[i]-min; //findind profit for one term
            prof=Math.max(prof,cost); //maximum profit
            min=Math.min(min,arr[i]); //finding minimum value itterating over array 
        }
        return prof;
    }
    //TC:O(N)
    public static void main(String[] args) {
        int[] a={1,5,3,8,12};
        System.out.println(bestTime(a));//best time to buy and sell stock for profit
        /*
        if u buy 1 and sell it on 12 the profit is 11
        buy 1 sell 8 then prfit is 8-1--->7
        */
    }
    
}
