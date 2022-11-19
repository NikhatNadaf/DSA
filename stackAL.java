
import java.util.ArrayList;


public class stackAL 
{
    static public class Stack
    {
        ArrayList<Integer> list=new ArrayList<>();
        public void push(int data)
        {
            list.add(data);
        }
        public boolean isEmpty()
        {
            return list.size()==0;
        }
        public int pop()
        {
            if(isEmpty())
            {
                System.out.println("stack is empty");
                return -1;
            }
            int top=list.remove(list.size()-1);
            return top;
        }
        public int peek()
        {
            if(isEmpty())
            {
                System.out.println("stack is empty");
                return -1;
            }
            return list.get(list.size()-1);
        }
                
    }
    public static void main(String[] args) {
        Stack stack=new Stack();
        stack.push(11);
        stack.push(12);
        stack.push(13);
        stack.push(14);
        while(!stack.isEmpty())
        {
            System.out.print(stack.peek()+" ");
            stack.pop();
        }
    }
    
}
