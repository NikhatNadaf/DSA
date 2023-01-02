/*
 [1,2,44,3,6,5,33,7,8]
 n=6
 true
 */
public class findElementInArray 
{
    public static boolean isContain(int[] arr,int i,int key)
    {
        if(i==arr.length) return false;
        if(arr[i]==key)
            return true;
        return isContain(arr, i+1, key);
    }
    
    public static void main(String[] args) {
        int[] arr={1,2,44,3,6,5,33,7,8};
        System.out.println(isContain(arr, 0,999));
    }
    
}
