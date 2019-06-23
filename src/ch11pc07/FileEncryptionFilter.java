package ch11pc07;
import java.io.*;

/**
 *
 * @author Frank
 */
public class FileEncryptionFilter {
    //methods
    
    /**
     * 
     * This provides a basic encryption of a file and exports it to another file.
     * 
     * @param inputFileName the file to be encrypted
     * @param encryptedFile the file to which the the data will be encrypted
     * @throws IOException
     * @throws FileNotFoundException 
     */
    public static void encryptFile (String inputFileName, String encryptedFile) throws IOException, FileNotFoundException {
        //instantiate File class
        File inputFile = new File(inputFileName);
        File outputFile = new File(encryptedFile);
        
        //instantiate FileInputStream class and DataInputStream class
        FileInputStream fstream = new FileInputStream(inputFile);
        DataInputStream inputFileStream = new DataInputStream(fstream);
        
        //instantiate FileOutputStream and DataOutputStream classes
        FileOutputStream fileStream = new FileOutputStream(outputFile);
        DataOutputStream outputFileStream = new DataOutputStream(fileStream);
        
        //begin encryption of existing file
        byte[] b = new byte[inputFileStream.available()];
        
        inputFileStream.read(b);
                
        inputFileStream.close();
        
        //encrypt
        for (int i = 0; i < b.length; i++) {
            outputFileStream.write(b[i] + 1);
        }
        
        outputFileStream.close();
    }
}
