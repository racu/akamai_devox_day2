public class Solution7
{
    public static void main(String[] args)
    {
        String text = args[0];
        while(text.indexOf("//") != -1)
            text = text.replaceAll("//","-");
        String[] items = text.split("((?<!/),)");
        System.out.print(items.length);
    }
}
