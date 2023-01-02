/*
 N = 5
output: Nik
        Nik
        Nik
        Nik
        Nik
 */
public class printNameNTImes 
{
    public static void printnName(int n)
    {
        if(n==0) return;
        System.out.println("Nik");
        printnName(n-1);
    }
    
    public static void main(String[] args) {
        printnName(6);
    }
    
}
