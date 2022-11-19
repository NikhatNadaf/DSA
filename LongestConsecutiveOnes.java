 
public class LongestConsecutiveOnes
{
     public static int maxConsecutiveOnes(int N) 
    {
        int count=0;
        while(N>0)
        {
            N=N & (N>>1);
           // N=N & (N-1);....by thise statement we get total no of 1's
            count++;
        }
        return count;
        
        // Your code here
    }
     public static void main(String[] args) {
         System.out.println(maxConsecutiveOnes(10));
    }
    
}
