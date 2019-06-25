public class Solution3
{
    public static void main(String[] args)
    {
        String text = args[0];
        int n = Integer.parseInt(text);
        long[] dyn = new long[n+1];
        dyn[0]=1;
        dyn[1]=1;
        for(int i=2; i<=n; i++)
            dyn[i] = dyn[i-1] + dyn[i-2];
        System.out.println(dyn[n]);
    }
}
