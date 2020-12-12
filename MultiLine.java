public class MultiLine extends CountState {
    private static MultiLine instance = null;

    private MultiLine() {
        // Do nothing here
    }

    public static MultiLine getInstance() {
        if (instance == null) {
            instance = new MultiLine();
        }
        return instance;
    }
    public void slash(Count context) {
        context.multilLineComIncrementer();
    }

    public void star(Count context) {
        context.multilLineComIncrementer();
        context.changeState(MLStar.getInstance());
    }

    public void character(Count context) {
        context.multilLineComIncrementer();
    }

    public void quote(Count context) {
        context.multilLineComIncrementer();
    }

    public void space(Count context) {
        context.multilLineComIncrementer();
    }

    public void newLine(Count context) {
        // Do nothing here
    }

    public void bSlash(Count context) {
        context.multilLineComIncrementer();
    }

}