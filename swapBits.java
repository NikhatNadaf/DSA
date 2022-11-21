
public class swapBits 
{
    public static int swapOddEvenBits(int x) 
    {
	    // Your code
	    int even_bits = x & 0xAAAAAAAA;
     
        // Get all odd bits of x
        int odd_bits = x & 0x55555555;
     
        // Right shift even bits
        even_bits >>= 1;
         
        // Left shift even bits
        odd_bits <<= 1;
         
        // Combine even and odd bits
        return (even_bits | odd_bits);
	}
    public static void main(String[] args) {
        System.out.println(swapOddEvenBits(23));  //TC:O(1)
    }
    
    
}
