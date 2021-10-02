
/*
intput 
aabbbccdeeef
output
abcdef


input 
aaabbcdddeeff
output
a3b2cd3e2f2

*/
public class String_Compression
{
    public static void main(String [] args)
    {
        String s = "aabbbccdeeef";
        //char[] o = new char[s.length()];
       System.out.println(compression_one(s));
    }
    public static String compression_one(String s)
    {
        String o = s.charAt(0)+""; 
        for(int i=1;i<s.length();i++)
        {
            char curr=s.charAt(i);
            char prev=s.charAt(i-1);
            if(curr!=prev)
            {
                o+=curr;
            }
        }
        return o;
   }
   public static String compression_two(String s)
    {
        String o=s.charAt(0)+"";
        int count=1;
        for(int i=1;i<s.length();i++)
        {
            
            char curr=s.charAt(i);
            char prev=s.charAt(i-1);
            if(curr==prev)
            {
                count++;
            }
            else
            {
                if(count>1)
                {
                    o+=count;
                    count =1;
                }
            o+=curr;
            }
        }
        if(count>1)
                {
                    o+=count;
                    count =1;
                }
    return o;    
    }
}