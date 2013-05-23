import javax.swing.UIManager;
import java.lang.Exception.*;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.JTextArea;
import javax.swing.JComponent;
//import java.io.FileOutputStream;
import java.io.*;
import java.util.Scanner;
import javax.swing.SwingUtilities;
import javax.swing.filechooser.*;
import javax.swing.JFileChooser;
import javax.swing.JFileChooser;
import java.io.*;
import java.util.HashSet;
import java.awt.Color;



public interface Language {
  
  public void getComponents();
  //get all of the component from the class of the language specified as a param
   //check for examples of mass gets from GridWorld
    
   //and wait, if this is void, can it return, well, anything?  do I need to return?  probably.
  public String getChromeText();
    //have to specify which class to take the chrome text from....
    //return null;//the string that contains the chrome text 
  
  public String getLastUsage();
  
  public String getExportButtonText();
    //this is another that really wants a language object...
  
    public String getPressCode(String character);
    //can't find characterList...of course!  because it's not a part of this class.
    //how are these supposed to work together???
//    int index;
//    if (characterList.contains(character)){
//      index = characterList.indexOf(character);
//    } else {
//      return null;
//    }
//    String pressCode = pressCodeList.get(index);
//    return pressCode;
  
    
public Color getBackground();
  //  -getBackground
  //to be set up w/ GUI--each will be an option on a list, each option = its own thing.
  //have to save the thing and then return it for use
  
public javax.swing.ImageIcon getLogo();
  //  -getLogo
  
  
}