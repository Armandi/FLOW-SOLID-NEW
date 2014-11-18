/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package view;

import controller.Control;
import interfaces.WordPairControlInterface;

/**
 *
 * @author Armandi
 */
public class GUI extends javax.swing.JFrame {

    /**
     * Creates new form GUI
     */
    
    WordPairControlInterface controller;
    
    
    public GUI() {
        initComponents();
        controller = new Control();
        controller.load("savedFile.txt");
        
        
        
        
        danishTF.setText(controller.getRandomQuestion());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        makeGuss = new javax.swing.JButton();
        nextWord = new javax.swing.JButton();
        addWord = new javax.swing.JButton();
        lookUp = new javax.swing.JButton();
        danishTF = new javax.swing.JTextField();
        polishTF = new javax.swing.JTextField();
        Feedback = new javax.swing.JTextField();
        DanishLabel = new javax.swing.JLabel();
        Headline = new javax.swing.JLabel();
        EnglishLable = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        makeGuss.setText("Make guss");
        makeGuss.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                makeGussActionPerformed(evt);
            }
        });

        nextWord.setText("Next word");
        nextWord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextWordActionPerformed(evt);
            }
        });

        addWord.setText("Add new word");

        lookUp.setText("Look word Up");
        lookUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lookUpActionPerformed(evt);
            }
        });

        danishTF.setEditable(false);
        danishTF.setText("hus");
        danishTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                danishTFActionPerformed(evt);
            }
        });

        polishTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                polishTFActionPerformed(evt);
            }
        });

        Feedback.setEditable(false);
        Feedback.setText("Correct!");

        DanishLabel.setText("Danish word:");

        Headline.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Headline.setText("What's the Polish word ?");

        EnglishLable.setText("Polish word:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Feedback)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lookUp)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(addWord)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(Headline))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(DanishLabel)
                                    .addComponent(EnglishLable))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(makeGuss)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                                        .addComponent(nextWord))
                                    .addComponent(polishTF)
                                    .addComponent(danishTF))))
                        .addGap(66, 66, 66))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Headline)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DanishLabel)
                    .addComponent(danishTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(polishTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EnglishLable))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nextWord)
                    .addComponent(makeGuss))
                .addGap(17, 17, 17)
                .addComponent(Feedback, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lookUp)
                    .addComponent(addWord))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void polishTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_polishTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_polishTFActionPerformed

    private void danishTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_danishTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_danishTFActionPerformed

    private void makeGussActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_makeGussActionPerformed

if (controller.checkGuess(danishTF.getText(), polishTF.getText())) {
            Feedback.setText("That's correct!");
           
            danishTF.setText(controller.getRandomQuestion());
            polishTF.setText("");
        } else {
            Feedback.setText("Wrong, try again!");
        }


    }//GEN-LAST:event_makeGussActionPerformed

    private void nextWordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextWordActionPerformed
    danishTF.setText(controller.getRandomQuestion());
    polishTF.setText("");
    }//GEN-LAST:event_nextWordActionPerformed

    private void lookUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lookUpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lookUpActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DanishLabel;
    private javax.swing.JLabel EnglishLable;
    private javax.swing.JTextField Feedback;
    private javax.swing.JLabel Headline;
    private javax.swing.JButton addWord;
    private javax.swing.JTextField danishTF;
    private javax.swing.JButton lookUp;
    private javax.swing.JButton makeGuss;
    private javax.swing.JButton nextWord;
    private javax.swing.JTextField polishTF;
    // End of variables declaration//GEN-END:variables
}
