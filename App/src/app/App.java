/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.io.IOException;

/**
 *
 * @author Kiburu
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        if (args.length == 0) {  
            try {  
                // re-launch the app itselft with VM option passed  
                Runtime.getRuntime().exec(new String[] {"java", "-Dcom.sun.javafx.isEmbedded=true", "-Dcom.sun.javafx.virtualKeyboard=\"javafx\"", "-Dcom.sun.javafx.touch=true", "-jar", "Restaurant_BACKUP.jar"});  
            } catch (IOException ioe) {  
                ioe.printStackTrace();  
            }  
            System.exit(0);  
        }  
    }
    
}
