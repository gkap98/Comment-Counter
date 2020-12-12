
public class BSlash extends CountState {
    private static BSlash instance = null;

    private BSlash() {
        // Do nothing here
    }

    public static BSlash getInstance() {
        if (instance == null) {
            instance = new BSlash();
        }
        return instance;
    }

    public void slash(Count context) {
        context.codeIncrementer();
        context.changeState(Quote.getInstance());
    }

    public void star(Count context) {
        context.codeIncrementer();
        context.changeState(Quote.getInstance());
    }

    public void character(Count context) {
        context.codeIncrementer();
        context.changeState(Quote.getInstance());
    }

    public void quote(Count context) {
        context.codeIncrementer();
        context.changeState(Quote.getInstance());
    }

    public void space(Count context) {
        context.codeIncrementer();
        context.changeState(Quote.getInstance());
    }

    public void newLine(Count context) {
        context.codeIncrementer();
        context.changeState(Quote.getInstance());
    }
    public void bSlash(Count context) {
        context.codeIncrementer();
        context.changeState(Quote.getInstance());
    }
}