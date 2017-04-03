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
        Filter capitalizeFilter  = new CapitalizeFilter();

        // Initialize raw pipe
        rawPipe = new StringPipe();

        // Input raw, unfiltered messages
        rawPipe.push("hello World!");
        rawPipe.push("Another message :)");
        rawPipe.push("pinnapple on pizza :)");
        rawPipe.push("i have a bloody pen!! I am an arse. Fuck my life :(");

        System.out.println("1 Raw pipe \n" + rawPipe.toString());

        // Retrieve filtered messages from the rawPipe inside the censoredPipe
        censoredPipe     = (StringPipe) censorFilter.process(rawPipe);
        System.out.println("\n\n2 Censored pipe \n" + censoredPipe.toString());

        emojiPipe        = (StringPipe) emojiFilter.process(censoredPipe);
        System.out.println("\n\n3 Emoji pipe \n" + emojiPipe.toString());

        capitalizedPipe  = (StringPipe) capitalizeFilter.process(emojiPipe);
        System.out.println("\n\n4 Capitalized pipe \n" + capitalizedPipe.toString());
    }
}
