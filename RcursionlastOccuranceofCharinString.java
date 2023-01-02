/*
 string = "abbcbcdb"
 char = 'b'
 last occurance =7;
 */
public class lastOccuranceofCharinString 
{
    static int last=-1;
    public static int lastOcc(String str,int i,char ch)
    {
        
        if(i==str.length()) return last;
        if(str.charAt(i)==ch)
            last=i;
        return lastOcc(str, i+1, ch);
    }
    public static void main(String[] args) {
        String str="aaacbbcbd";
        System.out.println(lastOcc(str, 0,'b'));
    }
    
}
