
public class CodeState extends CountState {
    private static CodeState instance = null;

    private CodeState() {
        // Do nothing here
    }

    public static CodeState getInstance() {
        if (instance == null) {
            instance = new CodeState();
        }
        return instance;
    }

    public void slash(Count context) {
        context.changeState(Slash.getInstance());
    }

    public void star(Count context) {
        context.codeIncrementer();
    }

    public void character(Count context) {
        context.codeIncrementer();
    }

    public void quote(Count context) {
        context.codeIncrementer();
        context.changeState(Quote.getInstance());
    }

    public void space(Count context) {
        context.codeIncrementer();
    }

    public void newLine(Count context) {
        // Do nothing here
    }
    public void bSlash(Count context) {
        // Do nothing here
    }
}