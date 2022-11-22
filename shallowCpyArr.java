
public class shallowCpyArr 
{
    public static void printArr(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5}; //create memory in heap and stack
        int[] arr_2=arr; //memory is created only for refrence varuable arr_2
        //shallow copy of array
        System.out.println("Original Array");
        printArr(arr);
        System.out.println("\ncopied Array");
        printArr(arr_2);
        
        //changes in arr_2
        arr_2[0]=0;
        arr_2[1]=0;
        
        System.out.println("\narr_2 after changes");
        printArr(arr_2);
        
        System.out.println("\narr after changes in arr_2");
        printArr(arr);//because both arr and arr_2 arrays points to one array in heap
    }
    
}
