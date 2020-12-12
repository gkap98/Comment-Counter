
public class MLStar extends CountState {
    private static MLStar instance = null;

    private MLStar() {
        // Do nothing here
    }

    public static MLStar getInstance() {
        if (instance == null) {
            instance = new MLStar();
        }
        return instance;
    }
    public void slash(Count context) {
        context.multilLineComIncrementer();
        context.changeState(CodeState.getInstance());
    }

    public void star(Count context) {
        context.multilLineComIncrementer();
    }

    public void character(Count context) {
        context.multilLineComIncrementer();
        context.changeState(MultiLine.getInstance());
    }

    public void quote(Count context) {
        context.multilLineComIncrementer();
        context.changeState(MultiLine.getInstance());
    }

    public void space(Count context) {
        context.multilLineComIncrementer();
        context.changeState(MultiLine.getInstance());
    }

    public void newLine(Count context) {
        context.changeState(MultiLine.getInstance());
    }

    public void bSlash(Count context) {
        context.multilLineComIncrementer();
        context.changeState(MultiLine.getInstance());
    }

}