/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textwriter;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;

/**
 *
 * @author marcj_000
 */
public class FileSaver extends Thread{
    
    ArrayList<String> words;
    String filePath;

    public FileSaver(ArrayList<String> words, String filePath) {
        this.words = words;
        this.filePath = filePath;
    }
    
    @Override
    public void run(){
        save(words, filePath);
    }
    
    public static boolean save(ArrayList<String> stringArray, String filename)
    {
        if( stringArray == null ) { return false;  }  //Checking parameter for null.
        FileWriter output;  //Creating reference for filewriter.
        
        try {
                output = new FileWriter(new File(filename));  //Opening connection to file.
                for (String personline : stringArray) {   //running through the ArrayList.                    
                    output.write(personline.toString() + "\n");  //Each String object is written as a line in file.
            }

            output.close();  //Closing the file
        } catch (Exception ex) {  //If something goes wrong everything is send to system out.
            System.out.println("Could not save to file!");
            System.out.println(ex.toString());
            ex.printStackTrace();
            return false;  //If something goes wrong false is returned!
        }

        return true;
    }

}
   
