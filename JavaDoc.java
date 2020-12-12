
public class JavaDoc extends CountState {

    private static JavaDoc instance = null;

    private JavaDoc() {
        // Do Nothing Here
    }

    public static JavaDoc getInstance() {
        if (instance == null) {
            instance = new JavaDoc();
        }
        return instance;
    }

    public void slash(Count context) {
        context.jDocIcrementer();
    }

    public void star(Count context) {
        context.jDocIcrementer();
        context.changeState(JDStar.getInstance());
    }

    public void character(Count context) {
        context.jDocIcrementer();
    }

    public void quote(Count context) {
        context.jDocIcrementer();
    }

    public void space(Count context) {
        context.jDocIcrementer();
    }

    public void newLine(Count context) {
        // Do nothing here
    }

}