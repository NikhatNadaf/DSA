
public class insertElementArray 
{
    public static void insert(int[] arr,int val,int pos)
    {
        int n=arr.length;
        for(int i=n-1;i>=pos-1;i--)//shifting elements at right side 
        {
            arr[i]=arr[i-1];
            
        }
        arr[pos-1]=val;
    }
    public static void printArra(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
    }
    public static void main(String[] args) {
        int[] arr=new int[10];
        arr[0]=1;
        arr[1]=2;
        arr[2]=11;
        arr[3]=3;
        printArra(arr);
        //Insert Element at 2nd index
        insert(arr, 40,3);
        printArra(arr);
        
    }
    
}
