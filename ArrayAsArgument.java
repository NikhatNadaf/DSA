
public class ArrayAsArgument 
{
    
    public static void printArr(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void modifyArray(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=0;
        }
        
    }
    public static void main(String[] args) 
    {
        int[] arr={11,22,33,44,55};
        System.out.println("Array elements...");
        printArr(arr);
        System.out.println("");
        
        //modify array elements
        modifyArray(arr); //passing array_name as argument means passin base address of array
        //shallow copy
        
        System.out.println("Array elemnts after modifying");
        printArr(arr);
        
        
    }
}
