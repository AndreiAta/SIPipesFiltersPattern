import java.util.ArrayList;

/**
 * Created by mancr on 3/31/2017.
 */
public interface Pipe<T> {
    void push(T input);

    T pop();

    boolean hasNext();
}
