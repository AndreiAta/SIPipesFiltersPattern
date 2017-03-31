/**
 * Created by mancr on 3/31/2017.
 */
public class CensorFilter implements Filter<StringPipe, Pipe> {

    @Override
    public Pipe process(StringPipe inputStream) {
        Pipe outputStream = new StringPipe();

        while (inputStream.hasNext()) {
            String message = (String) inputStream.pop();
            outputStream.push(censorMessge(message));
        }
        return outputStream;
    }

    public String censorMessge(String message) {
        return "censoring " + message;
    }


}
