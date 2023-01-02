/*
 
 */
public class towerOfHanoi 
{
    public static void toh(int n,String s,String h,String d)
    {
        if(n==1)
        {
            System.out.println("transfer "+n+" from "+s+" to "+d);
            return;
        }
        toh(n-1, s, d, h);
         System.out.println("transfer "+n+" from "+s+" to "+d);
         toh(n-1,h,s,d);
        
    }
    public static void main(String[] args) 
    {
        String s="Source";
        String h="Helper";
        String d="Destination";
        toh(2,s,h,d);
    }
    
            
    
    
}
