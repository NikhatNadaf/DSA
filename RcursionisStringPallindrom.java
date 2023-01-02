
public class isStringPallindrom 
{
    public static boolean isPallindrome(String str,int l,int r)
    {
        if(l>r) return true;
        return (str.charAt(l)==str.charAt(r)) && isPallindrome(str, l+1, r-1);
             
        
    }
    public static void main(String[] args) {
        String str="madams";
        int l=0;
        
        int r=str.length()-1;
        System.out.println(isPallindrome(str, l, r));
    }
    
}
