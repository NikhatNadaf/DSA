/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class stack 
{
   static int a[];
    static int size;
    static int top;
    stack(int size)
    {
        this.size=size;
        top=-1;
        a=new int[size];
    }
    public static void push(int data)
    {
        if(top==size-1)
        {
            System.out.println("stack is full");
        }
        else
        {
            top++;
            a[top]=data;
        }
    }
    public static int pop()
    {
        int res = 0;
        if(top==-1)
        {
            System.out.println("stack is empty");
        }
        else
        {
             res=a[top];
            top--;
        }
        return res;
    }
    public static int peek()
    {
        if(top==-1)
        {
            System.out.println("stack is empty");
        }
        
            return a[top];
    }
    public static boolean isEmpty()
    {
        return size==0;
    }
    public static void main(String[] args) 
    {
        stack s=new stack(6);
        s.push(5);
        s.push(4);
        s.push(3);
        s.push(2);
        s.push(1);
        s.push(0);
        while(!s.isEmpty())
        {
            System.out.println(s.peek());
            s.pop();
        }
    }
    
}
