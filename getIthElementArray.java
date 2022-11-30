
public class getIthElementArray 
{
    public static int getiThEle(int[] arr,int ith)
    {
        return arr[ith];
    }
    public static void main(String[] args) {
        int[] a={0,1,2,3,4,5,6,7,8,9};
        System.out.println(getiThEle(a,0));//TC:O(1)
    }
    
}
