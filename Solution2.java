public class Solution2
{
    public static void main(String[] args)
    {
        String text = args[0];
        long sum = 0;
        for(char c : text.toCharArray())
            sum += (int)c;
        System.out.println(sum);
    }
}
