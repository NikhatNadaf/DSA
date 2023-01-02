/*
 "abbcbcs"
  'b'
  fisrt occurance of b=1;
return 1;
 */
public class fisrtOccrncInString 
{
    public static int Occ(String str,int i,char ch)
    {
        if(i==str.length()) return -1;
        if(str.charAt(i)==ch)
            return i;
        return Occ(str,i+1,ch);
    }
    
    public static void main(String[] args) {
        String str="aaacbbcbd";
        System.out.println(Occ(str, 0,'b'));
    }
    
}
