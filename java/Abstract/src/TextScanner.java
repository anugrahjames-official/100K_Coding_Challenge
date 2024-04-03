package Abstract.src;

public class TextScanner {
    private static final String This = null;
    Hello obj;

    public TextScanner(Hello obj) {
        This.obj = obj;
    }
    void scan() {
        string text="Scanned Text";
        obj.onText(text);
    }
}
