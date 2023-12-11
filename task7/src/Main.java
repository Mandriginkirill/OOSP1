import Builder.*;

public class Main {
    public static void main(String[] args) {
        HtmlBuilder builder = new SimpleHtmlBuilder();
        HtmlDirector director = new HtmlDirector(builder);

        String htmlDocument = director.constructSampleHtml();
        System.out.println(htmlDocument);
    }
}