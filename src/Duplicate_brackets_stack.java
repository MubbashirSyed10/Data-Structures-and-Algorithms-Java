import java.util.*;
public class Duplicate_brackets_stack {
    public static void main(String []args)
    {
        Scanner sn = new Scanner(System.in);
        String s;
        s=sn.nextLine();
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==')')
            {
                if(stack.peek()=='(')
                {
                    System.out.println("true");
                    return;
                }
                else{
                    while(stack.peek()!='(')
                    {
                        stack.pop();
                    }
                    stack.pop();
                }
            }
            else{
                stack.push(s.charAt(i));
            }
        }
        System.out.println("false");
        //System.out.println(stack);
    }
}
