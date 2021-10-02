public class Bar_chart_array {
    public static void main(String [] args)
    {
        int []arr = {3,1,0,7,5};
        Barchart(arr);
    }
    public static void Barchart(int[] arr)
    {
        int n=0;
        for(int i=0;i<arr.length;i++)
        {
            n=arr[i];
            while(n!=0)
            {
                System.out.println("*\t");
                n--;
            }
            System.out.println("\t");
        }
    }
}
