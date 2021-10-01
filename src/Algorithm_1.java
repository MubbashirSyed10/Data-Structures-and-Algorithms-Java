//Find duplicates in an array


import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
public class Algorithm_1 {
    public static void main(String [] args)
    {
        Scanner sn = new Scanner(System.in);
        int n = sn.nextInt();
        System.out.println("Enter the value of n");
        int id [] = getInput(n);
        System.out.println("Student id is : ");
        for(int i=0;i<id.length;i++)
        {
            System.out.print(id[i]+" ");
        }
        findDuplicates(id);
    }


    private static int[] getInput(int n) {

        int[] arr= new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=randomNumber(1,2*n);
        }
        return arr;
    }

    private static int randomNumber(int min, int max) {
        int randomNumber = ThreadLocalRandom.current().nextInt(min,max+1);
        return randomNumber;
    }

    public static void findDuplicates(int []id)
    {
        System.out.println("Duplicate ids are :");
        int [] count = new int[1000];
        for(int i=0;i<id.length;i++)
        {
            count[id[i]]++;
            if(count[id[i]]==2)
            {
                System.out.println(id[i]+" ");
            }
        }
        /*for (int i=0;i< id.length;i++)
        {
            System.out.print(count[i]+" ");
        }*/
    }
}
