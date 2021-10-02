/*
For a given integer n, find the last non-zero digit in the factorial of n.

n! = n * (n-1) * (n-2) * .... * 3 * 2 * 1


Sample Input:
5
Sample Output:
2

Sample Input:
10
Sample Output:
8






*/

import java.util.*;
public class Lastnonzerodigitinfactofn {
   public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       int n = s.nextInt();
       int i;
       int l;
       int rem=0;
       l=lastNonZeroDigit(n);
       while(l!=0)
       {
           rem=l%10;
           l=l/10;
           if(rem!=0)
           {
               break;
           }
       }
       System.out.print(rem);
   }

   // Method to find the last digit of n!
   static int lastNonZeroDigit(int n) {
       // Write your code here
       if(n==0)
        return 1;
        else
            return (n*lastNonZeroDigit(n-1));
        
   }
}

