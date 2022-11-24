
public class swapWithTemp 
{
    public static void main(String[] args) {
        int a=10;
        int b=5;
        System.out.println("Befor swap");
        System.out.print(a+" "+b+"\n");
        
        a=a+b;  //a=10+5=15
        b=a-b;  //b=15-5=10
        a=a-b;  //a=15-10=5
         
        System.out.println("After swap");
        System.out.print(a+" "+b+"\n");
    }
    
}
