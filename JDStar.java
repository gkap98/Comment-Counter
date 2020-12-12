
public class JDStar extends CountState {
    private static JDStar instance = null;

    private JDStar() {
        // Do Nothing here
    }

    public static JDStar getInstance() {
        if (instance == null) {
            instance = new JDStar();
        }
        return instance;
    }
    public void slash(Count context) {
        context.jDocIcrementer();
        context.changeState(CodeState.getInstance());
    }

    public void star(Count context) {
        context.jDocIcrementer();
    }

    public void character(Count context) {
        context.jDocIcrementer();
        context.changeState(JavaDoc.getInstance());
    }

    public void quote(Count context) {
        context.jDocIcrementer();
        context.changeState(JavaDoc.getInstance());
    }

    public void space(Count context) {
        context.jDocIcrementer();
        context.changeState(JavaDoc.getInstance());
    }

    public void newLine(Count context) {
        context.jDocIcrementer();
        context.changeState(JavaDoc.getInstance());
    }

    public void bSlash(Count context) {
        context.jDocIcrementer();
        context.changeState(JavaDoc.getInstance());
    }

}