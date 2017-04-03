
public class CapitalizeFilter implements Filter<StringPipe, StringPipe>
{
    @Override
    public StringPipe process(StringPipe inputStream)
    {
        StringPipe outputStream = new StringPipe();

        while(inputStream.hasNext())
        {
            String message = (String) inputStream.pop();
            message = message.substring(0, 1).toUpperCase() + message.substring(1);
            outputStream.push(message);
        }
        return outputStream;
    }
}
