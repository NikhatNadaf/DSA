
public class arrayIndexOutOffBoundsExcp 
{
    public static void main(String[] args) {
        int[] arr=new int[4];
        try{
        int i=arr[4];
        }
        catch(ArrayIndexOutOfBoundsException ae)
        {
            System.out.println("can't reach at 4th index of array");
            
        }
    }
    
}
