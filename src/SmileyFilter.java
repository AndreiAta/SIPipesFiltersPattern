import java.util.HashMap;
import java.util.Map;


public class SmileyFilter implements Filter<StringPipe, StringPipe>
{


    @Override
    public StringPipe process(StringPipe inputStream)
    {
        StringPipe outputStream = new StringPipe();

        while(inputStream.hasNext())
        {
            String message = (String) inputStream.pop();
            outputStream.push(convertSmiley(message));
        }
        return outputStream;
    }

    public String convertSmiley(String message)
    {
        HashMap<String, String> smileys = new HashMap<String, String>();
        smileys.put("&:\\)", "<img src=res/Smiley Face.jpg/>");
        smileys.put("&:D", "<img src=res/Happy Face.jpg/>");

        for (Map.Entry< String, String > smiley: smileys.entrySet())
            message = message.replaceAll(smiley.getKey(), smiley.getValue());
        return message;
    }
}
