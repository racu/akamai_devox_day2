import java.math.BigInteger;

public class Solution3
{
    public static void main(String[] args)
    {
        String text = args[0];
        long n = Long.parseLong(text);
        BigInteger v1 = BigInteger.valueOf(1);
        BigInteger v2 = BigInteger.valueOf(1);
        for(long i=3; i<=n; i++) {
            BigInteger temp = v2;
            v2 = v1.add(v2);
            v1 = temp;
        }
        System.out.print(v2);
    }
}
