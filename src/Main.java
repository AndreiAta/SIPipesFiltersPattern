public class Main {
    public static void main(String[] args) {
        // Declarations

        // Pipes
        StringPipe rawPipe;
        StringPipe censoredPipe;
        StringPipe emojiPipe;
        StringPipe capitalizedPipe;

        // Filters
        Filter censorFilter = new CensorFilter();
        Filter emojiFilter  = new SmileyFilter();
//        Filter capitalizeFilter  = new CapitalizeFilter();

        // Initialize raw pipe
        rawPipe = new StringPipe();

        // Input raw, unfiltered messages
        rawPipe.push("Hello World!");
        rawPipe.push("Another message :)");
        rawPipe.push("Pinnapple on pizza :)");
        rawPipe.push("I have a bloody pen!! I am an arse. Fuck my life :(");

        // Retrieve filtered messages from the rawPipe inside the censoredPipe
        censoredPipe     = (StringPipe) censorFilter.process(rawPipe);
        System.out.println(censoredPipe.toString());

        emojiPipe        = (StringPipe) emojiFilter.process(censoredPipe);
        System.out.println(emojiPipe.toString());

//        capitalizedPipe  = (StringPipe) capitalizeFilter.process(emojiPipe);
//        System.out.println(capitalizedPipe.toString());
    }
}
