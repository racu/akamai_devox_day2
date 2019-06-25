public class Solution7
{
    public static void main(String[] args)
    {
        String text = args[0];
        String[] items = text.split("((?<!/),)|(//)");
        System.out.print(items.length);
    }
}
