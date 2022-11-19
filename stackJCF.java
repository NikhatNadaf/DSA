
import java.util.Stack;


public class stackJCF 
{
     public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
         System.out.println(stack.isEmpty());
         stack.push(10);
         System.out.println(stack.isEmpty());
         stack.push(12);
         System.out.println(stack.peek());
         stack.push(13);
         stack.push(14);
         stack.push(15);
         while(!stack.isEmpty())
         {
             System.out.print(stack.peek()+" ");
             stack.pop();
         }
             
         
    }
   
    
}
