/*
 p ^ q
p=2
q=3
2 ^ 3 = 8
 */
public class powerOfPtillQ 
{
    public static int powOf(int p,int q)
    {
        if(q==0) return 1;
         return powOf(p, q-1) * p;
    }
    public static void main(String[] args) {
        System.out.println(powOf(3,3));
    }
    
}
