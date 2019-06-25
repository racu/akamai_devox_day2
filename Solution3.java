import java.math.BigInteger;

public class Solution3
{
    public static void main(String[] args)
    {
        String text = args[0];
        int n = Integer.parseInt(text);
        BigInteger[] dyn = new BigInteger[n+1];
        dyn[1] = BigInteger.valueOf(1);
        dyn[2] = BigInteger.valueOf(1);
        for(int i=3; i<=n; i++)
            dyn[i] = dyn[i-1].add(dyn[i-2]);
        System.out.print(dyn[n]);
    }
}
