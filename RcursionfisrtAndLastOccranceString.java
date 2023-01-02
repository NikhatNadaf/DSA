
import java.util.ArrayList;


public class fisrtAndLastOccranceString 
{
    static int fist=-1;
    static int last=-1;
    static ArrayList<Integer> list=new ArrayList<>();
    public static ArrayList<Integer> fisrtLast(String str,int i,char ch)
    {
        if(i==str.length())
        {
            list.add(fist);
            list.add(last);
            //System.out.println("First "+fist+"\n Last "+last); 
            return list;
        }
            
           
        if(str.charAt(i)==ch)
        {
            if(fist==-1)
                fist=i;
            else
                last=i;
        }
        return fisrtLast(str, i+1, ch);
        
        
    }
    public static void main(String[] args) {
        String str="abbbbc";
        ArrayList<Integer> l=new ArrayList<>();
        l=fisrtLast(str,0,'b');
        System.out.println(l);
        
        
    }
    
}
