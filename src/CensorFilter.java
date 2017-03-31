import java.util.Arrays;
import java.util.regex.Pattern;

public class CensorFilter implements Filter<StringPipe, StringPipe> {

    @Override
    public StringPipe process(StringPipe inputStream) {
        StringPipe outputStream = new StringPipe();

        while (inputStream.hasNext()) {
            String message = (String) inputStream.pop();
            outputStream.push(censorMessge(message));
        }
        return outputStream;
    }

    private String censorMessge(String message) {
        String[] wordsToCensor = {"arse", "arsehole", "bastard", "berk", "bint", "blimey", "blighter", "bloody", "bollocks", "bugger", "cack", "chav", "cobblers", "cad", "cock", "codger", "crikey", "cunt", "dick", "duffer", "feck", "fuck", "gormless", "knob", "manky", "minger", "minging", "munter", "naff", "numpty", "nutter", "pillock", "pish", "pissed", "plonker", "poxy", "prat", "rotter", "scrubber", "shit", "swine", "taking", "tosser", "tuss", "twat", "wally", "wanker"};

        for(String wordToCensor: wordsToCensor) {
            String replacement = stringOfSize(wordToCensor.length(), '*');

            // Case insensitive replacer
            message = Pattern.compile("(?i)"+wordToCensor).matcher(message).replaceAll(replacement);
        }

        return message;
    }

    private static String stringOfSize(int size, char ch)
    {
        final char[] array = new char[size];
        Arrays.fill(array, ch);
        return new String(array);
    }


}
