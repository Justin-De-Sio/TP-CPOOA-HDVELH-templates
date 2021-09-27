/**
 * File: NodeMultipleEvents.java
 * Creation: 7 nov. 2020, Jean-Philippe.Prost@univ-amu.fr
 * Template étudiants
 */
package pracHDVELH;

import java.util.Scanner;

import myUtils.ErrorNaiveHandler;

/**
 * @author prost
 */

public class Event extends NodeMultiple {
    private static int lastId;// static : momune a toute les instance de la classe

    public Event(GUIManager gui, String data) {
        super();
        this.gui = gui;
        this.reader = gui.getInputReader();
        int id = ++lastId;
    }

    public static final String ERROR_MSG_UNEXPECTED_END = "Sorry, for some unexpected reason the story ends here...";
    public static final String PROMPT_ANSWER = "Answer: ";
    public static final String WARNING_MSG_INTEGER_EXPECTED = "Please input a integer within range!";
    private GUIManager gui;
    private static String PROMPT_ANS = "HOHO";
    private String playerAnswer;
    Scanner reader;
    private int chosenPath;

    public run() {
        gui.println(this.toString());
        gui.println(PROMPT_ANS);
        playerAnswer = reader.next();
        chosenPath = interpretAnswer();

    }

    private int interpretAnswer() {
        return 0;
    }

    /**
     * @return the playerAnswer
     */
    public String getPlayerAnswer() {
        return playerAnswer;
    }

    /**
     * @param playerAnswer the playerAnswer to set
     */
    public void setPlayerAnswer(String playerAnswer) {
        this.playerAnswer=playerAnswer;
    }

    /**
     * @return the reader
     */
    public Scanner getReader() {
        return reader;
    }

    /**
     * @param reader the reader to set
     */
    public void setReader(Scanner reader) {
        this.reader=reader;
    }

    /**
     * @return the chosenPath
     */
    public int getChosenPath() {
        return chosenPath;
    }

    /**
     * @param chosenPath the chosenPath to set
     */
    public void setChosenPath(int chosenPath) {
        this.chosenPath=chosenPath;
    }

    /* Methods */

    /**
     * @see pracHDVELH.NodeMultiple#getData()
     */
    public String getData() {
        /* TO BE COMPLETED */
    }

    /**
     * @param data
     * @see pracHDVELH.NodeMultiple#setData(Object)
     */
    public void setData(String data) {
        /* TO BE COMPLETED */
    }

    /**
     * @see pracHDVELH.NodeMultiple#getDaughter(int)
     */
    @Override
    public Event getDaughter(int i) {
        /* TO BE COMPLETED */
    }

    /**
     * @param daughter
     * @param i
     * @see pracHDVELH.NodeMultiple#setDaughter(NodeMultiple, int)
     */
    public void setDaughter(Event daughter, int i) {
        /* TO BE COMPLETED */
    }

    /**
     * @return the gui
     */
    public GUIManager getGui() {
        /* TO BE COMPLETED */
    }

    /**
     * @param gui the gui to set
     */
    public void setGui(GUIManager gui) {
        /* TO BE COMPLETED */
    }

    /**
     * @return the id
     */
    public int getId() {
        /* TO BE COMPLETED */
    }

    /* Methods */
    /* TO BE COMPLETED */

}

// eof