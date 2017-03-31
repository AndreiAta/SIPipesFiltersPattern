public class Main {
    public static void main(String[] args) {
        // Declarations

        // Pipes
        StringPipe rawPipe;
        StringPipe censoredPipe;
        StringPipe emojiPipe;
        StringPipe capitalizedPipe;

        // Filters
        CensorFilter censorFilter = new CensorFilter();
        CensorFilter emojiFilter;        //  = new EmojiFilter();      TODO uncomment
        CensorFilter capitalizeFilter;   //  = new CapitalizeFilter(); TODO uncomment

        // Initialize raw pipe
        rawPipe = new StringPipe();

        // Input raw, unfiltered messages
        rawPipe.push("Hello World!");
        rawPipe.push("Another message :)");
        rawPipe.push("Pinnapple on pizza :)");
        rawPipe.push("I have a bloody pen!! I am an arse. Fuck my life");

        // Retrieve filtered messages from the rawPipe inside the censoredPipe
        censoredPipe        = censorFilter.process(rawPipe);
        System.out.println(censoredPipe.toString());

        // emojiPipe        = emojiFilter.process(censoredPipe);   TODO uncomment
        // capitalizedPipe  = capitalizeFilter.process(emojiPipe); TODO uncomment
    }
}
