
public class ArrayInsertAtIndex 
{
    public static  void insertAtIndex(int arr[],int sizeOfArray,int index,int element)
    {
        //Your code here, Geeks
        for(int i=arr.length-1;i>index;i--)
        {
            arr[i]=arr[i-1];
        }
        arr[index]=element;
    }
    public static void main(String[] args) {
        int[] arr={7,7,1,1};
        int n=arr.length;
        insertAtIndex(arr,n,0,3);
        //TC:O(N)
    }
    
}
