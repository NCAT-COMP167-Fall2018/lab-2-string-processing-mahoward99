/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package string.processing;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mirac
 */
public class StringProcessing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] recordsR = new String[100];
        try {
            // TODO code application logic here
            Scanner read = new Scanner(new File(args[0]));
            int currForm =0;
            while(read.hasNext()){
            String[] infoLine = read.nextLine().split(",");
                    
            String firstName = infoLine[0];
            String lastName = infoLine[1];
            String gender = infoLine[2];
            String age = infoLine[3];
            //int age;
            String phoneNum = infoLine[4];
            String emmyAddy= infoLine[5];
            recordsR[currForm] = String.format("%-8s,%-8s,%-7s,%-3s,%-10s,%-40s", firstName,lastName,gender,age,phoneNum,emmyAddy);
            
            System.out.println(recordsR[currForm]);
            
            currForm++;

            }
                        
        } catch (FileNotFoundException ex) {
            Logger.getLogger(StringProcessing.class.getName()).log(Level.SEVERE, null, ex);
        System.err.println("File NOT found");
        }
    
    }
    
}
