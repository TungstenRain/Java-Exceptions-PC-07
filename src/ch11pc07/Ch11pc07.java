package ch11pc07;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Frank
 */
public class Ch11pc07 {

    public static void main(String[] args) {
        // variables
        String fileName, encryptName;
        boolean fileFound = true;
        
        //instantiate Scanner class keyboard
        Scanner keyboard = new Scanner(System.in);
        
        do {
            try {
                //Request file from user
                System.out.print("Please enter the name of the file to encrypt: ");
                fileName = keyboard.nextLine();
                System.out.print("Please enter the name of the file to encrypt to: ");
                encryptName = keyboard.nextLine();
                
                FileEncryptionFilter.encryptFile(fileName, encryptName);
                
                System.out.println("File successfully encrypted.");
                fileFound = true;
            }
            catch (FileNotFoundException ex) {
                System.out.println("Could not find file.");
                System.out.println(ex.getMessage());
                fileFound = false;
            }
            catch (IOException ex) {
                System.out.println("Error.  File was not encrypted.");
                System.out.println(ex.getMessage());
                fileFound = true;
            }
        } while (!fileFound);

    }
    
}
