
public class RightMostbit 
{
    public static void main(String[] args) {
        int n=11; //1011
        int m=9;  //1001
        //rightmost different bit between 2 numbers 
        //without XOR
        int count=1;
        int mask=1;
        while((mask&n)==(mask&m))
        {
            n=n>>1;
            m=m>>1;
            count++;
            
        }
        System.out.println(count);
    }
    
}
