//using array
public class Queue 
{
    static class Queue1
    {
        static int a[];
        static int rear;
        static int size;

        public Queue1(int size) 
        {
            this.size=size;
            rear=-1;
            a=new int[size];
            
        }
        public static boolean isEmpty()
        {
            return rear==-1;
        }
         public static boolean isFull()
        {
            return rear==size-1;
        }
         public static void add(int data)
         {
             if(isFull())
             {
                 System.out.println("Queue is full");
                 return;
             }
             rear++;
             a[rear]=data;
         }
         public static int remove()
         {
             if(isEmpty())
             {
                 System.out.println("Queue is empty");
                 return -1;
             }
             int front=a[0];
             for(int i=0;i<rear;i++)
             {
                 a[i]=a[i+1];
             }
             rear--;
             return front;
         }
         public static int peek()
         {
             if(isEmpty())
             {
                 System.out.println("Queue is empty");
                 return -1;
             }
            return a[0];
             
         }
        
        
    }
    public static void main(String[] args) {
        Queue1 queue=new Queue1(5);
        queue.add(1);
        queue.add(2);
        queue.add(3);
        System.out.println(queue.remove());
        System.out.println(queue.peek());
    }
    
}
