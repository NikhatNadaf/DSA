/*
 "axbxcxdx"
  abcdxxxx
 */
public class moveAllXendOFString 
{
    static int count=0;
    public static String moveAll(String str ,int i,String newStr,char ch)
    {
        if(i==str.length())
        {
            for(int j=1;j<=count;j++)
            {
                newStr += ch;
                
            }
            return newStr;
        }
            
        if(str.charAt(i)==ch)
        {
            count++;
            return moveAll(str, i+1, newStr, ch);
        }
        newStr += str.charAt(i);
        return moveAll(str, i+1, newStr, ch);
            
            
    }
    
    public static void main(String[] args) {
        String str="axbbxcx";
        System.out.println(moveAll(str,0,"",'x'));
    }
    
}
