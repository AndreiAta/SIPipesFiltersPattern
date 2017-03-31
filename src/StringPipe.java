import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by mancr on 3/31/2017.
 */
public class StringPipe implements Pipe<String> {
    LinkedList<String> stream;

    StringPipe() {
        stream = new LinkedList<>();
    }

    @Override
    public void push(String input) {
        stream.add(input);
    }

    @Override
    public String pop() {
        if (hasNext()) {
            return stream.pop();
        } else {
            throw new RuntimeException("Dude, WTF? Can't pop anymore. You Greedy Bastard.");
        }
    }

    @Override
    public boolean hasNext() {
        return stream.peek() != null;
    }

    public String toString() {
        return stream.toString();
    }
}
