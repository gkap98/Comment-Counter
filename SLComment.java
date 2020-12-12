
public class SLComment extends CountState {
    private static SLComment instance = null;

    SLComment() {
        // Do nothing here
    }

    public static SLComment getInstance() {
        if (instance == null) {
            instance = new SLComment();
        }
        return instance;
    }

    public void slash(Count context) {
        context.singleLineComIncrementer();
    }

    public void star(Count context) {
        context.singleLineComIncrementer();
    }

    public void character(Count context) {
        context.singleLineComIncrementer();
    }

    public void quote(Count context) {
        context.singleLineComIncrementer();
    }

    public void space(Count context) {
        context.singleLineComIncrementer();
    }

    public void newLine(Count context) {
        context.changeState(CodeState.getInstance());
    }
    public void bSlash(Count context) {
        // Do nothing here
    }

}