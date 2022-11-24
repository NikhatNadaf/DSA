
public class swapNumbers 
{
    public static void main(String[] args) {
        int a=10;
        int b=5;
        System.out.println("Befor swap");
        System.out.print(a+" "+b+"\n");
        int temp=a;  //temp=10
        a=b;         //a=5
        b=temp;         //b=10
         System.out.println("After swap");
        System.out.print(a+" "+b+"\n");
    }
    /* if we do
     a=b
     b=a
    then we lost original value of a
    */
}
