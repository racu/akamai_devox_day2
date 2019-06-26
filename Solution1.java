import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Solution1
{
    public static void main(String[] args) throws IOException
    {
        String filePath = args[0];
        Stream<String> lines = Files.lines(Paths.get(filePath));
        AtomicInteger countPal = new AtomicInteger(0);
        lines.forEach( word -> {
                    boolean isPal = true;
                    if (word.length() >= 2) {
                        for (int i = 0; i < word.length() / 2 + 1; i++)
                            if (word.charAt(i) != word.charAt(word.length() - 1 - i)) {
                                isPal = false;
                                break;
                            }
                        if (isPal)
                            countPal.addAndGet(1);
                    }
                }
        );
        System.out.print(countPal);

    }
}
