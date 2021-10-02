import java.util.*;
public class Stack_intro
{
    public static void main(String []args)
    {
        Stack<Integer> st = new Stack<Integer>();
        st.push(10);
        st.push(20);
        System.out.println(st);
        
        System.out.println(st.peek());
        st.pop();
        System.out.println(st);
    }
}