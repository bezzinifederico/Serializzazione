/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializzazione;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Logger;

/**
 *
 * @author bezzini.federiconico
 */
public class Serializzazione {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException {
     Studente s = new Studente("mk","lo",123);
     try{
//    FileOutputStream FO= new FileOutputStream("test.ser");
//   ObjectOutputStream OS= new  ObjectOutputStream (FO); 
//   OS.writeObject(9);
//   OS.writeObject(1.367);
//   OS.writeObject(false);
//   OS.writeObject("a");
//   OS.flush();
//   OS.close();
//   OS.close();


    FileInputStream FI= new FileInputStream ("test.ser");
    ObjectInputStream IS= new  ObjectInputStream (FI); 
    int v1= (int) IS.readObject();
     System.out.println(" v1 "+v1);
   }  catch(FileNotFoundException ex){
       System.out.println("Impossibile trovare il file");
     
   } catch(IOException ex) {
          System.out.println("Addio Java");
                  
                  }
    
}
}

 //Logger.getLogger(Serializzazione.class.getName());