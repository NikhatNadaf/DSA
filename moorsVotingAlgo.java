
public class moorsVotingAlgo 
{
    //find candidate i.e Majority Element
    public static int findcandi(int[] arr)
    {
        int n=arr.length;
        int me_ind=0;
        int count=1;
        for(int i=1;i<n;i++)
        {
            if(arr[me_ind]==arr[i])
                count++;
            else
                count--;
            if(count==0)
            {
                me_ind=i;
                count=1;
            }
        }
        return arr[me_ind];
    }
    //check majority of candidate
    public static int majorityOfCand(int[] arr,int candi)
    {
        int n=arr.length;
        candi=findcandi(arr);
        int count=0;
        for(int i=0;i<n;i++)
        {
            if(candi==arr[i])
                count++;
            
        }
        if(count>n/2)
                return count;
        return count;
    }
    
    public static void main(String[] args) {
        int[] a={2,3,4,3,3,3};//if there is no majority lement then it consider last element as ME
        int cand=findcandi(a);
       // System.out.println(cand);
        System.out.println(majorityOfCand(a,cand));
        //TC:O(N)
    }
    
}
