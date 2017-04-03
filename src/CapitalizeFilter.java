
public class CapitalizeFilter implements Filter<StringPipe, StringPipe>
{
    @Override
    public StringPipe process(StringPipe inputStream)
    {
        StringPipe outputStream = new StringPipe();
        boolean capitalized = false;

        while(inputStream.hasNext())
        {
            String message = (String) inputStream.pop();
            if(capitalized = false)
            {
                message = message.substring(0, 1).toUpperCase() + message.substring(1);
                capitalized = true;
            }
            outputStream.push(message);
        }
        return outputStream;
    }
}
