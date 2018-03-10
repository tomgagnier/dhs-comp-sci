package util;

import java.nio.CharBuffer;
import java.util.Scanner;

/**
 * Use this Scanner to see input echoed to the console.
 */
@SuppressWarnings("ALL")
public class Utilities {
    public static Scanner newTestScanner(String responses) {
        final CharBuffer input = CharBuffer.wrap(responses.toCharArray());
        return new Scanner(charBuffer -> {
            if (input.hasRemaining()) {
                char c = input.get();
                charBuffer.append(c);
                System.out.print(c);
                return 1;
            }
            return 0;
        });
    }
}
