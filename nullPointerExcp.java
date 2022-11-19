
public class nullPointerExcp
{
    public static void main(String[] args) {
        try{
        String str=null;
        System.out.println(str.length());
        }
        catch(NullPointerException np)
        {
            System.out.println(np);
        }
        
    }
    
}
