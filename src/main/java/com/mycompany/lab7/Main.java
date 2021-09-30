
package com.mycompany.lab7;

import edu.tarleton.caesarcipher.Caesar;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;



public class Main {
    
    public static void main(String[] args) {
        encryptFile("InputFile.txt");
        decryptFile("encryptedFile.txt");
    }
    
    public static void encryptFile(String inputFile)
    {
        try {
            Caesar cc = new Caesar(20);
            File input = new File(inputFile);
            File output = new File("encryptedFile.txt");
            Scanner sc = new Scanner(input);
            PrintWriter printer = new PrintWriter(output);
            while (sc.hasNextLine()) 
            {
                String data = sc.nextLine();
                printer.write(cc.encrypt(data));
            }
            sc.close();
            printer.close();
            } catch (IOException e) {
                System.out.println("An error occurred.");
            }
    }
    
    public static void decryptFile(String inputFile)
    {
        try {
            Caesar cc = new Caesar(20);
            File input = new File(inputFile);
            File output = new File("DecryptedFile.txt");
            Scanner sc = new Scanner(input);
            PrintWriter printer = new PrintWriter(output);
            while (sc.hasNextLine()) 
            {
                String data = sc.nextLine();
                printer.write(cc.decrypt(data));
            }
            sc.close();
            printer.close();
            } catch (IOException e) {
                System.out.println("An error occurred.");
            }
    }
}
        
