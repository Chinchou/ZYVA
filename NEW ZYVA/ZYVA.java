//Things from ZYVA to preserve
//NOTE: Code not intended to compile/run.  Code is annotated for reference.


//Imports
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



public class ZYVA extends javax.swing.JFrame {
    
    public ZYVA() {
        UIManager.setLookAndFeel(getLookFeel());  //getLF()
        initComponents();
    } 
    
    @SuppressWarnings("unchecked")
    private void initComponents() {
      // language = getLastLanguage();
      // getComponents(language);
    }
    
    getContentPane().setBackground(getBackground()); //getBackground();
        
        
        //window chrome text--have one of these for each language, and a method that switches between them?
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle(); //getTitle();
        setIconImages(null);
        setResizable(true); //TRUE. MAKE SURE VALUES CORRESPOND WITH THIS.
        
        
        // public string printButtonsPressed() {
                 //System.out.println(getPressCode());
        //      
        
        
        //somewhere in here goes the global undo....
        
        
        //somewhere in here goes right-click menu for cut/copy/paste
        
        //somewhere in here goes switch to fullscreen mode
        

    public void exportbuttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exportbuttActionPerformed
      
      //previous ways trying to export.  don't touch this, it finally works...
      //can there be a direct print function? as in, to a printer?
      
//      String doc = textarea.getText();
//      JFileChooser fc = new JFileChooser();
//      fc.setDialogTitle("Sauvegarder");
//      fc.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
//      fc.setFileFilter(new FileNameExtensionFilter("Text Files", "txt"));
//      int userSelection = fc.showSaveDialog(textarea);
//      if (userSelection == JFileChooser.APPROVE_OPTION){
//        File filetosave = fc.getSelectedFile();
//        System.out.println("Sauvegarder: " + filetosave.getAbsolutePath());
      
      JFileChooser saver = new JFileChooser();  
        saver.setFileFilter(new FileNameExtensionFilter("Text Files", "txt"));  
        int returnVal = saver.showSaveDialog(textarea);  
        File file = saver.getSelectedFile();  
        BufferedWriter writer = null;  
        if (returnVal == JFileChooser.APPROVE_OPTION)  
        {  
          try {
            writer = new BufferedWriter( new FileWriter( file + ".txt"));  
            
            writer.write(textarea.getText());  
            writer.close( );  
          }
          catch (IOException e)  {
          }
            
        }  
    }