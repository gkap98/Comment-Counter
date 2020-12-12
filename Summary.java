import javax.swing.*;
import java.util.*;

public class Summary extends JFrame {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    private JLabel summaryLabel;
    private JPanel summaryPanel;

    public Summary(int code, int sl, int ml, int jd) {
        super("Comment Counter Summary");

        summaryPanel = new JPanel();

        String html = "";
        html += "<html><h1>Comment Count Summary</h1><table><tr><th>Comment Type</th><th></th><th>Count</th></tr>";
        html += "<tr><td>Code Count</td><td>--></td>" + "<td>" + code + "</td></tr>";
        html += "<tr><td>JavaDoc Count</td><td>--></td>" + "<td>" + jd + "</td></tr>";
        html += "<tr><td>Multi Line Count</td><td>--></td>" + "<td>" + ml + "</td></tr>";
        html += "<tr><td>Single Line Count</td><td>--></td>" + "<td>" + sl + "</td></tr>";
        html += "</table></html>";

        summaryLabel = new JLabel(html);
        summaryPanel.add(summaryLabel);
        add(summaryPanel);
        setSize(500,250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocation(850,100);
        setVisible(true);
    }
}