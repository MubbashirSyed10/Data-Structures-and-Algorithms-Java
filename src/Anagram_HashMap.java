/*
Anagram of key value pairs of a HashMap
Description
You are given a HashMap with n number of keys and values. You need to print key-value pairs that are an anagrams of each other in the dictionary order of keys (alphabetical order based on the first letter of the word). An anagram is a word, phrase or name that is formed by rearranging the letters of another.

Example:
Map = {rasp spar, dog cat}
Output:
rasp : spar

Input:

3
BAT TAB
CAT DOG
EAT TEA
Output:

BAT:TAB
EAT:TEA

Input:

2
A B
C D
Output:

false
*/
import java.util.*;
public class Anagram_HashMap {
    //Method to check if two strings are anagram of each other or not
    public static boolean check(String str1, String str2){
        char[] ch1 = str1.toLowerCase().toCharArray();
        char[] ch2 = str2.toLowerCase().toCharArray();
        //Write your code here
        char temp1[] = arrange(ch1);
        char temp2[] = arrange(ch2);
        for(int i =0;i<temp1.length;i++)
        {
            if(temp1[i]!=temp2[i])
            {
                return false;
            }
        }
        return true;
    }
    //Method to sort the character array
    public static char[] arrange(char[] ch){
        //Write your code here
        char temp;
        for(int i=0;i<ch.length;i++)
        {
            for(int j=i+1;j<ch.length;j++)
            {
                if(ch[i]>ch[j])
                {
                    temp = ch[i];
                    ch[i]=ch[j];
                    ch[j]=temp;
                }
            }
        }
        return ch;
    }

    public static void main(String[] x){
        Map<String,String> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String key;
        String value;
        for(int i = 1; i <= num; i++){
            key = sc.next();
            value = sc.next();
            map.put(key,value);
        }
        //Write your code here
        int count =0;
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String k = entry.getKey();
            String v = entry.getValue();
            if(check(k,v)==true)
            {
                System.out.println(k+" : "+v);
                count++;
            }
        }
        if(count ==0)
        {
            System.out.println("false");
        }

    }
}
