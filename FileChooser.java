import javax.swing.*;

public class FileChooser extends JFrame {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private String filePath;

    public FileChooser() {
        setUpGUI();
    }
    // I really need to work on commenting my code better.

    private void setUpGUI() {
        JFileChooser fileChooser = new JFileChooser();
        int retVal;
        retVal = fileChooser.showOpenDialog(null);
        if (retVal == JFileChooser.APPROVE_OPTION) {
            setFilePath(fileChooser.getSelectedFile().getAbsolutePath());
        } else {
            System.out.println("Open Operation Canceled");
        }
    }

    private void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public String getFilePath() {
        return filePath;
    }

}