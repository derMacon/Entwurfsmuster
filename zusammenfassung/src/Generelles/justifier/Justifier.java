package Generelles.justifier;

import java.util.ArrayList;
import java.util.Random;

/**
 * Class that justifies a given textparagraph.
 *
 * @author silas
 */
public class Justifier {

    private final int MAX_LINE_LENGTH;
    private final int MIN_LINE_LENGTH;
    private static final String TXT_BLANK = " ";
    public static final String[][] SPECIAL_CHARS = {{"Ä", "ae"}, {"ä", "ae"}, 
        {"Ö", "oe"} , {"ö", "oe"}, {"Ü", "ue"}, {"ü", "ue"}};
    public static final int IDX_SPECIAL_CHAR = 0;
    public static final int IDX_SPECIAL_REPLACEMENT = 1;
    

    /**
     * Sets the default values
     */
    public Justifier() {
        this.MAX_LINE_LENGTH = 100;
        this.MIN_LINE_LENGTH = 90;
    }

    /**
     * Sets custom values
     *
     * @param maxLineLength
     * @param minLineLength
     */
    public Justifier(int maxLineLength, int minLineLength) {
        this.MAX_LINE_LENGTH = maxLineLength;
        this.MIN_LINE_LENGTH = minLineLength;
    }

    /**
     * Splits and modifies the input.
     *
     * @param txt input paragraph
     * @return formatted paragraph
     */
    public String organize(String input) {
        String txt = replaceAllSpecialChars(input);
        String[] lines = txt.split("\n");
        StringBuilder paragraph = new StringBuilder();
        for (int i = 0; i < lines.length; i++) {
            lines[i] = fillLineWithBlanks(lines[i]);
            System.out.println(lines[i]);
//            System.out.printf("%s%" + (MAX_LINE_LENGTH + 10 - lines[i].length()) + "s\n", lines[i], lines[i].length());
            paragraph.append(lines[i] + "\n");
        }
        return paragraph.toString();
    }
    
    public String replaceAllSpecialChars(String input) {
        for (int i = 0; i < Justifier.SPECIAL_CHARS.length; i++) {
            String sChar = Justifier.SPECIAL_CHARS[i][IDX_SPECIAL_CHAR];
            String temp = Justifier.SPECIAL_CHARS[i][IDX_SPECIAL_REPLACEMENT]; 
            input = input.replaceAll(Justifier.SPECIAL_CHARS[i][IDX_SPECIAL_CHAR], 
                    Justifier.SPECIAL_CHARS[i][IDX_SPECIAL_REPLACEMENT]);
        }
        return input;
    }

    /**
     * Fills line with blanks to fit the max. line length, but only if the line
     * is long enough.
     *
     * @param txt
     * @return
     */
    private String fillLineWithBlanks(String txt) {
        String txtTrimmed = txt.trim().replaceAll("\r", "");
        if (MIN_LINE_LENGTH <= txtTrimmed.length()) {
            int neededExtraBlanks = MAX_LINE_LENGTH - txt.trim().length();
            StringBuilder[] words = splitLineToWords(txtTrimmed);
            words = addRandomBlanksToFitLine(words, neededExtraBlanks);
            txtTrimmed = uniteWordsToLine(words);
            return txtTrimmed;
        } else {
            return txt;
        }
    }

    /**
     * Adds random blank spaces in the given word array
     *
     * @param words words in the current line
     * @param randomBlanksCount number of spaces that will be added randomly.
     * @return StringBuilder array with some words containing a blank space at
     * the end.
     */
    private StringBuilder[] addRandomBlanksToFitLine(StringBuilder[] words, int randomBlanksCount) {
        int lengthWithoutLastWord = words.length - 1; 
        int remainingBlanks = randomBlanksCount - lengthWithoutLastWord;
        if (remainingBlanks > 0) {
            words = addRandomBlanksToFitLine(words, remainingBlanks);
            randomBlanksCount = lengthWithoutLastWord;
        }
        ArrayList<Integer> listPosRandomBlanks = getRandomNumSeries(lengthWithoutLastWord, randomBlanksCount);
        for (Integer i : listPosRandomBlanks) {
            words[i].append(TXT_BLANK);
        }
        return words;
    }

    /**
     * Generates a random series of numbers which all differ from one another.
     *
     * @param maxVal maximum random value (exclusive)
     * @param n number of random Integers that will be created.
     * @return an ArrayList containing a list of random numbers.
     */
    private ArrayList<Integer> getRandomNumSeries(int maxVal, int n) {
        int count = 0;
        int temp = 0;
        Random rand = new Random();
        ArrayList<Integer> output = new ArrayList<>(n);
        while (count < n) {
            temp = rand.nextInt(maxVal);
            if (!output.contains(temp)) {
                output.add(temp);
                count++;
            }
        }
        return output;
    }

    /**
     * Splits current line into its words
     *
     * @param line current line of the paragraph
     * @return Array containing all words in this line.
     */
    private StringBuilder[] splitLineToWords(String line) {
        String[] arrStr = line.split(TXT_BLANK);
        StringBuilder[] output = new StringBuilder[arrStr.length];
        for (int i = 0; i < arrStr.length; i++) {
            output[i] = new StringBuilder(arrStr[i]);
        }
        return output;
    }

    /**
     * Generates a new line out of the word array
     *
     * @param words words in this line
     * @return new line containing all words in the given array.
     */
    private String uniteWordsToLine(StringBuilder[] words) {
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            output.append(words[i]);
            if (i != words.length - 1) {
                output.append(TXT_BLANK);
            }
        }
        return output.toString().trim();
    }

}
