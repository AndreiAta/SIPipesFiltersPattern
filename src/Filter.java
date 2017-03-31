/**
 * Created by mancr on 3/31/2017.
 */
public interface Filter<S extends Pipe, T extends Pipe> {
    T process(S inputStream);
}
