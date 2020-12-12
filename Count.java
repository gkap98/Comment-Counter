/*
    Main class for this program.
    Will hold logic
    Other states will extend this class.
*/

import java.util.*;
import java.io.*;

public class Count {
    private String filePath;

    private CountState currentState;

    private int codeCount;
    private int multiLineCommentCount;
    private int singleLineCommentCount;
    private int jDocCount;

    // Constructor will take in a file to work with.
    public Count() {
        // Carriage RETURN BULLSHIT
        codeCount = 0;
        multiLineCommentCount = 0;
        singleLineCommentCount = 0;
        jDocCount = 0;
        currentState = CodeState.getInstance();

        FileChooser fc = new FileChooser();
        filePath = fc.getFilePath();

        // read in file here
        BufferedReader br = null;

        try {
            char character = 0;
            br = new BufferedReader(new FileReader(filePath));
            while ((character = (char) br.read()) != (char) -1) {
                if (character == '/') {
                    currentState.slash(this);
                } else if (character == '*') {
                    currentState.star(this);
                } else if (character == ' ') {
                    currentState.space(this);
                } else if (character == '\n') {
                    currentState.newLine(this);
                } else if (character == '"') {
                    currentState.quote(this);
                } else if (character == '\\') {
                    currentState.bSlash(this);
                } else if (character == '\r') {

                } else {
                    currentState.character(this);
                }
            }
            System.out.println("Code Count: " + codeCount);
            System.out.println("JavaDoc Count: " + jDocCount);
            System.out.println("Multi Count: " + multiLineCommentCount);
            System.out.println("Single Count: " + singleLineCommentCount);
            Summary sum = new Summary(codeCount, singleLineCommentCount, multiLineCommentCount, jDocCount);

            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void changeState(CountState state) {
        currentState = state;
    }

    public void codeIncrementer() {
        codeCount++;
        System.out.println(codeCount);
    }

    public void singleLineComIncrementer() {
        singleLineCommentCount++;
        System.out.println("Single: " + singleLineCommentCount);
    }

    public void multilLineComIncrementer() {
        multiLineCommentCount++;
        System.out.println("Multi: " + multiLineCommentCount);
    }

    public void jDocIcrementer() {
        jDocCount++;
        System.out.println("Java: " + jDocCount);
    }

}