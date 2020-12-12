
public class Star extends CountState {

    private static Star instance = null;

    private Star() {
        // Do nothing here
    }

    public static Star getInstance() {
        if (instance == null) {
            instance = new Star();
        }
        return instance;
    }

    public void slash(Count context) {
        character(context);
    }

    public void star(Count context) {
        context.jDocIcrementer();
        context.jDocIcrementer();
        context.jDocIcrementer();
        context.changeState(JavaDoc.getInstance());
    }

    public void character(Count context) {
        context.multilLineComIncrementer();
        context.multilLineComIncrementer();
        context.multilLineComIncrementer();
        context.changeState(MultiLine.getInstance());
    }

    public void quote(Count context) {
        character(context);
    }

    public void space(Count context) {
        context.multilLineComIncrementer();
        context.multilLineComIncrementer();
        context.multilLineComIncrementer();
        context.changeState(MultiLine.getInstance());
    }

    public void newLine(Count context) {
        context.multilLineComIncrementer();
        context.multilLineComIncrementer();
        context.changeState(MultiLine.getInstance());
    }
    public void bSlash(Count context) {
        character(context);
    }
}