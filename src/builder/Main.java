package builder;

import org.w3c.dom.Text;

public class Main {
    public static void main(String[] args) {
        //makeText();
        System.out.println("-------------------------------------");
        makeHtml();
    }

    public static void makeText() {
        TextBuilder textBuilder = new TextBuilder();
        Director director = new Director(textBuilder);
        director.construct();
        String result = textBuilder.getTextResult();
        System.out.println(result);
    }

    public static void makeHtml() {
        HTMLBuilder htmlBuilder = new HTMLBuilder();
        Director director = new Director(htmlBuilder);
        director.construct();
        String result = htmlBuilder.getHTMLResult();
        System.out.println(result);
    }

    public static void usage() {
        System.out.println("Usage:: java Main Text 텍스트로 문서 작성");
        System.out.println("Usage:: java Main Text HTML로  문서 작성");
    }

    public int dd() {
        return 10;
    }
}
