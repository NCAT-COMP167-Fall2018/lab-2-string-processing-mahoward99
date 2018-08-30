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

    
    private static boolean GENDER_VALID(String gender){
    if (gender.trim().equalsIgnoreCase("male")){
    return true;
    }else if(gender.trim().equalsIgnoreCase("female")){
    return true;
    }
    return false;
    }
    
    private static boolean FNAME_VALID(String firstName){
    firstName = firstName.trim();

    if(firstName == null || firstName.equals("")){
        return false;
    }else if(!firstName.matches("[a-zA-Z]*")){
        return false;
    }
    return true;
}
    
    private static boolean LNAME_VALID(String lastName){
    lastName = lastName.trim();

    if(lastName == null || lastName.equals("")){
        return false;
    }else if(!lastName.matches("[a-zA-Z]*")){
        return false;
    }
    return true;
}
    
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
            recordsR[currForm] = String.format("%-20s%-20s,%-7s,%-3s,%-10s,%-40s", firstName,lastName,gender,age,phoneNum,emmyAddy);
            
            //System.out.println(recordsR[currForm]);
            
            if(FNAME_VALID(firstName)){
                System.out.println(recordsR[currForm]);
            }else{
                System.err.println(String.format("%-20s%-20s,%-7s,%-3s,%-10s,%-40s", firstName,lastName,gender,age,phoneNum,emmyAddy));
            }
            if(LNAME_VALID(lastName)){
                System.out.println(recordsR[currForm]);
            }else{
                System.err.println(String.format("%-20s%-20s,%-7s,%-3s,%-10s,%-40s", firstName,lastName,gender,age,phoneNum,emmyAddy));
            }    
            if(GENDER_VALID(gender)){
                System.out.println(recordsR[currForm]);
            }else{
                System.err.println(String.format("%-20s%-20s,%-7s,%-3s,%-10s,%-40s", firstName,lastName,gender,age,phoneNum,emmyAddy));
            }
            
            currForm++;

            }
                        
        } catch (FileNotFoundException ex) {
            Logger.getLogger(StringProcessing.class.getName()).log(Level.SEVERE, null, ex);
        System.err.println("File NOT found");
        }
    
    }
    }
    

