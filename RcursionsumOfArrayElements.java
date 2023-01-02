
public class sumOfArrayElements 
{
    public static int sumOf(int[] arr,int i,int sum)
    {
        if(i==arr.length)
        {
            return sum;
        }
        sum += arr[i];
        return sumOf(arr, i+1, sum);
    }
    public static void main(String[] args) {
        int[] a={1,2,3,4,5};
        int s=sumOf(a, 0, 0);
        System.out.println(s);
    }
    
}
