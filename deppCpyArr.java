
public class deppCpyArr 
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
        int[] arr_2=arr.clone(); //seprate memory is created for arr_2 in heap
        //Deep copy of Array
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
        printArr(arr);
        
        //Now both having their own memory in heap that's why any changes in perticular array can't affect 
        //on each other
    }
    
}
