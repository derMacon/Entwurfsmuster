package Generelles.justifier;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Class reads and formats a txt file
 *
 * @author silas
 */
public class txtFileJustifier extends Justifier {

    public static String SHUTDOWN_INSTRUCTION = "x";
    private StringBuilder txtFileContent = null;
    private String fileAddress = null;

    /**
     * Handles the first call of the Justifier. Uses the direct commands from the 
     * command line to choose a the different opening from the different options.
     * @param args 
     */
    public void launchTxtJustifier(String[] args) {
        try {
        if (args.length == 0){
        System.out.println("Text justifier\nEnter File path of .txt file to juustify "
                + "paragraphs or 'x' to end programm.");
        } else if (args.length == 1) {
            formatTxtFile(args[0]);
        } else {
            throw new IllegalArgumentException("Illegal command args");
        }
        processUserInput();
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
    }
    
    /**
     * Handles the user data provided via the command line. Also ends the programm.
     */
    private void processUserInput() {
        Scanner sc = new Scanner(System.in); 
        String userInput;
        boolean notFinishedYet = true;
        do {
            System.out.print("Path: ");
            userInput = sc.next();
            notFinishedYet = !userInput.equals(txtFileJustifier.SHUTDOWN_INSTRUCTION);
            if(notFinishedYet) {
                formatTxtFile(userInput);
                
            }
        } while(notFinishedYet);
    }
    
    
    /**
     * Method that reads the text that will be formatted and writes the result into
     * the same txt file.
     * @param fileAddress txt file address from which the txt file will be 
     * provided.
     */
    public void formatTxtFile(String fileAddress) {
        readTxtFile(fileAddress);
        formatLoadedFile();
        writeFile();
    }

    /**
     * Reads / writes text into StringBuilder var from a txt file with a given address. 
     * @param address 
     */
    private void readTxtFile(String address) {
        this.fileAddress = address;
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(address));
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while (line != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
                line = br.readLine();
            }
            txtFileContent = sb;
        } catch (FileNotFoundException e) {
            System.err.println("File not found.");
        } catch (IOException e) {
            System.err.println("Error: IOException.");
        } finally {
            try {
                br.close();
            } catch (Exception e) {
                System.err.println("Error: Closing output stream.");
            }
        }
    }

    /**
     * Formats the content of the given txt file.
     */
    private void formatLoadedFile() {
        txtFileContent = new StringBuilder(this.organize(txtFileContent.toString()));
    }

    /**
     * Writes the newly formated text into the given txt file.
     */
    private void writeFile() {
        BufferedWriter bw = null;
        FileWriter fw = null;
        try {
            String content = "This is the content to write into file\n";
            File file = new File(this.fileAddress);
            fw = new FileWriter(file, false);
            bw = new BufferedWriter(fw);
            bw.write(this.txtFileContent.toString());
//            bw.write(content);
            System.out.println("Done");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bw != null) {
                    bw.close();
                }
                if (fw != null) {
                    fw.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

}
