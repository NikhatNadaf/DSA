
public class kthBitsetornot 
{
    static boolean checkKthBit(int n, int k)
    {
        int bitmask=1<<k;
        if((n & bitmask)==0)
        {
            return false;
        }
        return true;
        // Your code here
    }
    public static void main(String[] args) 
    {
        System.out.println(checkKthBit(4,2));
        
    }
    
}
