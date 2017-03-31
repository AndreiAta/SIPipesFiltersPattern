public class Main {

    public static void main(String[] args) {

        StringPipe stringPipe = new StringPipe();
        stringPipe.push("Hello World!");
        stringPipe.push("Another message :)");
        stringPipe.push("Pinnapple on pizza :)");
        stringPipe.push("I have a pen!!");

        CensorFilter censorFilter = new CensorFilter();
        Pipe censoredPipe = censorFilter.process(stringPipe);
        System.out.println(censoredPipe.toString());
    }
}
