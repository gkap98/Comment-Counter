
public class Slash extends CountState {

    private static Slash instance = null;

    private Slash() {
        // Do nothing here
    }

    public static Slash getInstance() {
        if (instance == null) {
            instance = new Slash();
        }
        return instance;
    }

    public void slash(Count context) {
        context.singleLineComIncrementer();
        context.singleLineComIncrementer();
        context.changeState(SLComment.getInstance());
    }

    public void character(Count context) {
        context.codeIncrementer();
        context.codeIncrementer();
        context.changeState(CodeState.getInstance());
    }

    public void star(Count context) {
        context.changeState(Star.getInstance());
    }

    public void quote(Count context) {
        context.codeIncrementer();
        context.codeIncrementer();
        context.changeState(CodeState.getInstance());
    }

    public void space(Count context) {
        context.codeIncrementer();
        context.changeState(CodeState.getInstance());
    }

    public void newLine(Count context) {
        context.codeIncrementer();
        context.changeState(CodeState.getInstance());
    }
    public void bSlash(Count context) {
        context.codeIncrementer();
        context.changeState(CodeState.getInstance());
    }
}