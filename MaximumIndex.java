/*
 Given an array A[] of N positive integers.
The task is to find the maximum of j - i subjected to the constraint of A[i] < A[j] and i < j.
 
 */
public class MaximumIndex 
{
    static int maxIndexDiff(int A[], int N) 
    {
        int ci=0;
        int maxind=0;
        for(int i=0;i<N;i++){
            for(int j=i+1;j<N;j++)
            {
                if((A[i]<=A[j]) && (i<=j))
                {
                    ci=j-i;
                    maxind=Math.max(ci,maxind);
                }
            }
        }
        return maxind;
    }
    //TC:O(N)
    //SP:O(N)
    public static void main(String[] args) {
        int[] A={34, 8, 10, 3, 2, 80, 30, 33, 1};
        int N=A.length;
        System.out.println(maxIndexDiff(A, N));
    }
    
}
