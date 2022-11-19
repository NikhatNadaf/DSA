
public class rightMostDiffBitOone 
{
    public static void main(String[] args) {
        int n=11; //1011
        int m=9;  //1001
        //rightmost different bit between 2 numbers 
        //without XOR
        int x=n^m; //0010
         System.out.println((int)((Math.log10(x & -x)) / Math.log10(2)) + 1);  //TC: O(1)
            
    }
    
}
