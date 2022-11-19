
public class RightmostDiffrntBitUSingXOR 
{
    public static void main(String[] args) {
         int n=11; //1011
        int m=9;  //1001
        //rightmost different bit between 2 numbers 
        //without XOR
        int xor=n^m; //0010
        int count=1;
        while((xor&1)==0)
        {
            count++;
            xor=xor>>1;
        }
        System.out.println(count);
    }
    
}
