
public class Quote extends CountState {

    private static Quote instance = null;

    private Quote() {
        // Do nothing here
    }

    public static Quote getInstance() {
        if (instance == null) {
            instance = new Quote();
        }
        return instance;
    }

    public void slash(Count context) {
        context.codeIncrementer();
    }

    public void star(Count context) {
        context.codeIncrementer();
    }

    public void character(Count context) {
        context.codeIncrementer();
    }

    public void quote(Count context) {
        context.codeIncrementer();
        context.changeState(CodeState.getInstance());
    }

    public void space(Count context) {
        context.codeIncrementer();
    }
    public void newLine(Count context) {
        context.codeIncrementer();
    }
    public void bSlash(Count context) {
        context.codeIncrementer();
        context.changeState(BSlash.getInstance());
    }
}