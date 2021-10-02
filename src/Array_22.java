public class Array_22 {
    
    public static int maxProfit(int[] prices) {
        int max=0;
        int temp;
        for(int i=0;i<prices.length;i++)
        {
            for(int j=i+1;j<prices.length;j++)
            {
                if(prices[i]<prices[j])
                {
                    temp=prices[j]-prices[i];
                    if(temp>max)
                    {
                        max=temp;
                    }
                }
            }
        }
        return max;
    }
    public static void main(String []args)
    {
        //Array_22 a=new Array_22();
        int [] prices={7,1,5,3,6,4};
        //System.out.println(a.maxProfit(prices));
        System.out.println(maxProfit(prices));
    }

   
}
