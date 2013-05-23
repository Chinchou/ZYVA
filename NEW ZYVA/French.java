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
import javax.swing.*;



public class French extends javax.swing.JFrame implements Language {
    
    public int x;  //tester for pressing buttons, change this to individual button codes eventually
    public javax.swing.JButton a1;
    public javax.swing.JButton a2;
    public javax.swing.JButton at;
    public javax.swing.JButton cd;
    public javax.swing.JLabel directions;
    public javax.swing.JButton e1;
    public javax.swing.JButton e2;
    public javax.swing.JButton e3;
    public javax.swing.JButton et;
    public javax.swing.JButton exportbutt;
    public javax.swing.JButton ic;
    public javax.swing.JButton it;
    public javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JLabel logo;
    public javax.swing.JButton lq;
    public javax.swing.JButton oc;
    public javax.swing.JButton oe;
    public javax.swing.JButton rq;
    public javax.swing.JTextArea textarea;
    public javax.swing.JButton u1;
    public javax.swing.JButton u2;
    public javax.swing.JButton ut;
    



// do I even need a constructor?  thinking no.
    
    //All of this could go in a void method of store.  Probs a good idea.
    
//store characters in ArrayLists here.
    
     
        String titleFrench = new String("ZYVA--" + "\u00e9" + "crivez simplement en fran" + "\u00e7" + "ais !" + "    (Ver. 0.1.1)");
        //storing title string...or something x)
        
        //zyva logo.  create logo for each lang, specifying the lang?  add this in to previously
        //mentioned switcher method?
        ImageIcon frenchIcon = new javax.swing.ImageIcon(getClass().getResource("Images/ZYVAlogoproto.png")); // NOI18N
        //frenchIcon.setText("jLabel1");

        //store whether or not last lang used (how to get this to be permanent between reboots
        //of the program?)
        
        //store button press codes
        
        //store fullscreen button text/image
        
        //figure out some way for a fullscreen mode.  just resizing, or actual new GUI?
        public void initComponents(){

   
        javax.swing.JLabel logo = new javax.swing.JLabel();
        javax.swing.JScrollPane jScrollPane1 = new javax.swing.JScrollPane();
        javax.swing.JTextArea textarea = new javax.swing.JTextArea();
        javax.swing.JLabel directions = new javax.swing.JLabel();
        javax.swing.JButton e1 = new javax.swing.JButton();
        javax.swing.JButton e2 = new javax.swing.JButton();
        javax.swing.JButton e3 = new javax.swing.JButton();
        javax.swing.JButton cd = new javax.swing.JButton();
        javax.swing.JButton a1 = new javax.swing.JButton();
        javax.swing.JButton a2 = new javax.swing.JButton();
        javax.swing.JButton ic = new javax.swing.JButton();
        javax.swing.JButton oc = new javax.swing.JButton();
        javax.swing.JButton u1 = new javax.swing.JButton();
        javax.swing.JButton u2 = new javax.swing.JButton();
        javax.swing.JButton oe = new javax.swing.JButton();
        javax.swing.JButton at = new javax.swing.JButton();
        javax.swing.JButton et = new javax.swing.JButton();
        javax.swing.JButton it = new javax.swing.JButton();
        javax.swing.JButton ut = new javax.swing.JButton();
        javax.swing.JButton lq = new javax.swing.JButton();
        javax.swing.JButton rq = new javax.swing.JButton();
        javax.swing.JButton exportbutt = new javax.swing.JButton();
        //add fullscreen button
        
        //thinking this is the set up for the text box
        textarea.setColumns(20);
        textarea.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        textarea.setRows(5);
        jScrollPane1.setViewportView(textarea);

        //is this the cut/copy/paste image?  replace with right-click menu, or maybe a more
        //complex text box.  still must have plain text though.
        directions.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        directions.setIcon(new javax.swing.ImageIcon(getClass().getResource("Images/directions.png"))); // NOI18N

        
        //here go the buttons.  if possible, would love not to use images again.
        //use what was learned when specifying the window chrome text
        //make sure this ports nicely between netbeans and dr. java
        e1.setIcon(new javax.swing.ImageIcon(getClass().getResource("Images/e1.png"))); // NOI18N
        e1.setText("jButton1");
        e1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                e1ActionPerformed(evt);
            }
        });

        e2.setIcon(new javax.swing.ImageIcon(getClass().getResource("Images/e3.png"))); // NOI18N
        e2.setText("jButton2");
        e2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                e2ActionPerformed(evt);
            }
        });

        e3.setIcon(new javax.swing.ImageIcon(getClass().getResource("Images/e2.png"))); // NOI18N
        e3.setText("jButton3");
        e3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                e3ActionPerformed(evt);
            }
        });

        cd.setIcon(new javax.swing.ImageIcon(getClass().getResource("Images/cd.png"))); // NOI18N
        cd.setText("jButton4");
        cd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cdActionPerformed(evt);
            }
        });

        a1.setIcon(new javax.swing.ImageIcon(getClass().getResource("Images/a2.png"))); // NOI18N
        a1.setText("jButton5");
        a1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a1ActionPerformed(evt);
            }
        });

        a2.setIcon(new javax.swing.ImageIcon(getClass().getResource("Images/a1.png"))); // NOI18N
        a2.setText("jButton6");
        a2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a2ActionPerformed(evt);
            }
        });

        ic.setIcon(new javax.swing.ImageIcon(getClass().getResource("Images/ic.png"))); // NOI18N
        ic.setText("jButton7");
        ic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                icActionPerformed(evt);
            }
        });

        oc.setIcon(new javax.swing.ImageIcon(getClass().getResource("Images/oc.png"))); // NOI18N
        oc.setText("jButton8");
        oc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ocActionPerformed(evt);
            }
        });

        u1.setIcon(new javax.swing.ImageIcon(getClass().getResource("Images/u1.png"))); // NOI18N
        u1.setText("jButton9");
        u1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                u1ActionPerformed(evt);
            }
        });

        u2.setIcon(new javax.swing.ImageIcon(getClass().getResource("Images/uc.png"))); // NOI18N
        u2.setText("jButton10");
        u2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                u2ActionPerformed(evt);
            }
        });

        oe.setIcon(new javax.swing.ImageIcon(getClass().getResource("Images/oe.png"))); // NOI18N
        oe.setText("jButton12");
        oe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oeActionPerformed(evt);
            }
        });

        at.setIcon(new javax.swing.ImageIcon(getClass().getResource("Images/at.png"))); // NOI18N
        at.setText("jButton1");
        at.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atActionPerformed(evt);
            }
        });

        et.setIcon(new javax.swing.ImageIcon(getClass().getResource("Images/et.png"))); // NOI18N
        et.setText("jButton2");
        et.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                etActionPerformed(evt);
            }
        });

        it.setIcon(new javax.swing.ImageIcon(getClass().getResource("Images/it.png"))); // NOI18N
        it.setText("jButton3");
        it.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itActionPerformed(evt);
            }
        });

        ut.setIcon(new javax.swing.ImageIcon(getClass().getResource("Images/ut.png"))); // NOI18N
        ut.setText("jButton4");
        ut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                utActionPerformed(evt);
            }
        });

        lq.setIcon(new javax.swing.ImageIcon(getClass().getResource("Images/lq.png"))); // NOI18N
        lq.setText("jButton5");
        lq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lqActionPerformed(evt);
            }
        });

        rq.setIcon(new javax.swing.ImageIcon(getClass().getResource("Images/rq.png"))); // NOI18N
        rq.setText("jButton6");
        rq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rqActionPerformed(evt);
            }
        });

        //export button.  change text here.
        exportbutt.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        exportbutt.setText("Exporte");
        exportbutt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exportbuttActionPerformed(evt);
            }
        });

        //ackkkkk the layout.  this will have to be redone.  can it be redone on the fly?
        // different langs have different layouts/configs...need to know where to put this!!!
        
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 507, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(exportbutt, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(92, 92, 92))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 40, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(directions)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(at, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(a1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(e1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(u1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lq, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(rq, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(e2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(e3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(cd, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(a2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(ic, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(oc, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(et, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(it, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(ut, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(u2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(oe, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap(33, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(exportbutt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(directions, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(e3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cd, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(e2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(e1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(a1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(a2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ic, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(oc, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                            .addComponent(it, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(et, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(at, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ut, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(u2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(u1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(oe, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lq, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rq, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())))
        );

        pack();
    }
    
    //the function of each button.  can this get more general, as in, one method that takes characters
    //from different arrays, and puts them in?  
    
    //basically then, what this would look like, is arrays of the characters, and the program 
    //would have to constantly reevaluate which language it wants.  
    
    public void e1ActionPerformed(java.awt.event.ActionEvent evt) {
      x = 1;
      textarea.insert("\u00e9", getPos());
    }//GEN-LAST:event_e1ActionPerformed

    public void e2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_e2ActionPerformed
    
      x = 2;
      textarea.insert("\u00e8", getPos());
    }//GEN-LAST:event_e2ActionPerformed

    public void e3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_e3ActionPerformed
    
      x = 3;
      textarea.insert("\u00ea", getPos());
    }//GEN-LAST:event_e3ActionPerformed

    public void cdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cdActionPerformed
       
      x = 4;
      textarea.insert("\u00e7", getPos());
    }//GEN-LAST:event_cdActionPerformed

    public void a1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a1ActionPerformed
    
      x = 5;
      textarea.insert("\u00e0", getPos());
    }//GEN-LAST:event_a1ActionPerformed

    public void a2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a2ActionPerformed
       
      x = 6;
      textarea.insert("\u00e2", getPos());
    }//GEN-LAST:event_a2ActionPerformed

    public void icActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_icActionPerformed
     
      x = 7;
      textarea.insert("\u00ee", getPos());
    }//GEN-LAST:event_icActionPerformed

    public void ocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ocActionPerformed
        
      x = 8;
      textarea.insert("\u00f4", getPos());
    }//GEN-LAST:event_ocActionPerformed

    public void u1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_u1ActionPerformed
       
      x = 9;
      textarea.insert("\u00f9", getPos());
    }//GEN-LAST:event_u1ActionPerformed

    public void u2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_u2ActionPerformed
       
      x = 10;
      textarea.insert("\u00fb", getPos());
    }//GEN-LAST:event_u2ActionPerformed

    public void oeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oeActionPerformed
       
      x = 12;
      textarea.insert("\u0153", getPos());
    }//GEN-LAST:event_oeActionPerformed

    public void atActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atActionPerformed
        
      x = 13;
      textarea.insert("\u00e4", getPos());
    }//GEN-LAST:event_atActionPerformed

    public void etActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_etActionPerformed
       
      x = 14;
      textarea.insert("\u00eb", getPos());
    }//GEN-LAST:event_etActionPerformed

    public void itActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itActionPerformed
        // TODO add your handling code here:
      x = 15;
      textarea.insert("\u00eb", getPos());
    }//GEN-LAST:event_itActionPerformed

    public void utActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_utActionPerformed
       
      x = 16;
      textarea.insert("\u00fc", getPos());
    }//GEN-LAST:event_utActionPerformed

    public void lqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lqActionPerformed
       
      x = 17;
      textarea.insert("\u00ab", getPos());
    }//GEN-LAST:event_lqActionPerformed

    public void rqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rqActionPerformed
       
      x = 18;
      textarea.insert("\u00bb", getPos());
    }//GEN-LAST:event_rqActionPerformed
    
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    
    //oh yeah, netbeans put the instance fields at the end.  weird >.>
    
    
    
    // End of variables declaration//GEN-END:variables

