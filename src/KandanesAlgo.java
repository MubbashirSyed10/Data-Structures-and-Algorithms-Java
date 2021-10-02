import javax.crypto.Cipher;

// Kandanes algorithm is returning maximum sum of subarray
// [-5,4,6,-3,4,-1]


public class KandanesAlgo {
    public static void main(String [] args)
    {
        int [] arr= {-5,4,6,-3,4,-1};
        System.out.println(maxsubarray(arr));
        
    }
    public static int maxsubarray(int arr[])
    {
        int maxsum=0;
        int currsum=0;
        for(int i=0;i<arr.length;i++)
        {
            currsum=currsum+arr[i];
            if(currsum>maxsum)
            {
                maxsum=currsum;
            }
            if(currsum<0)
            {
                currsum=0;
            }
        }
        return maxsum;
    }
}
