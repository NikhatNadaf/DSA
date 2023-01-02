
public class isStringcontainEle 
{
    public static boolean isContain(String str,int i,char ch)
    {
        if(i==str.length()) return false;
        if(str.charAt(i)==ch)
            return true;
        return isContain(str, i+1, ch);
        
            
        
    }
    public static void main(String[] args) {
        String n="Nikhat";
        System.out.println(isContain(n, 0,'N'));
    }
    
}
