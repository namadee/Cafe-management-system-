/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package cafe.management.system;
import model.User;
import javax.swing.JOptionPane;
import dao.Userdao;
/**
 *
 * @author 94773
 */
public class ForgotPassword extends javax.swing.JFrame {
private String dbAnswer = null ;
private String email = null ;
public String emailPattern = "^[a-zA-Z0-9]+[@]+[a-zA-Z0-9]+[.]+[a-zA-Z0-9]+$";

    public ForgotPassword() {
        initComponents();
        btnUpdate.setEnabled(false);
        btnsearch.setEnabled(false);
        txtsecQues.setEnabled(false);
    }
    public void clear(){
        btnUpdate.setEnabled(false);
        btnsearch.setEnabled(false);
        txtemail.setEditable(true);
        txtemail.setText("");
        txtsecQues.setText("");
        txtanswer.setText("");
        txtnewPass.setText("");
        
    }
public void validateEmail(){
    email = txtemail.getText();
    if(email.matches(emailPattern))
        btnsearch.setEnabled(true);
    else
        btnsearch.setEnabled(false);
    
}

public void ValidateFields(){
    String password = txtnewPass.getText();
    String answer = txtanswer.getText();
    String SecurityQuestion = txtsecQues.getText();
    if(!password.equals("")  && !answer.equals("") && !SecurityQuestion.equals(""))
         btnUpdate.setEnabled(true);
    else
       btnUpdate.setEnabled(false);
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtemail = new javax.swing.JTextField();
        txtanswer = new javax.swing.JTextField();
        txtsecQues = new javax.swing.JTextField();
        txtnewPass = new javax.swing.JPasswordField();
        btnUpdate = new javax.swing.JButton();
        btnsearch = new javax.swing.JButton();
        btnlogin = new javax.swing.JButton();
        btnclear = new javax.swing.JButton();
        btnSignup = new javax.swing.JButton();
        btnexit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Forgot Password?");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 190, -1, -1));

        jLabel2.setText("Your Answer");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(458, 398, -1, -1));

        jLabel3.setText("Email");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(458, 291, -1, -1));

        jLabel4.setText("Your Security Question");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(458, 342, -1, -1));

        jLabel5.setText("Enter new Password");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(458, 453, -1, -1));

        txtemail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtemailKeyReleased(evt);
            }
        });
        getContentPane().add(txtemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(691, 287, 322, -1));

        txtanswer.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtanswerKeyReleased(evt);
            }
        });
        getContentPane().add(txtanswer, new org.netbeans.lib.awtextra.AbsoluteConstraints(691, 394, 322, -1));

        txtsecQues.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtsecQuesKeyReleased(evt);
            }
        });
        getContentPane().add(txtsecQues, new org.netbeans.lib.awtextra.AbsoluteConstraints(691, 338, 322, -1));

        txtnewPass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtnewPassKeyReleased(evt);
            }
        });
        getContentPane().add(txtnewPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(691, 449, 322, -1));

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(691, 507, -1, -1));

        btnsearch.setText("search");
        btnsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsearchActionPerformed(evt);
            }
        });
        getContentPane().add(btnsearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(1054, 287, -1, -1));

        btnlogin.setText("Login");
        btnlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnloginActionPerformed(evt);
            }
        });
        getContentPane().add(btnlogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(923, 554, -1, -1));

        btnclear.setText("Clear");
        btnclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclearActionPerformed(evt);
            }
        });
        getContentPane().add(btnclear, new org.netbeans.lib.awtextra.AbsoluteConstraints(805, 507, -1, -1));

        btnSignup.setText("Signup");
        btnSignup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignupActionPerformed(evt);
            }
        });
        getContentPane().add(btnSignup, new org.netbeans.lib.awtextra.AbsoluteConstraints(691, 554, -1, -1));

        btnexit.setText("Exit");
        btnexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexitActionPerformed(evt);
            }
        });
        getContentPane().add(btnexit, new org.netbeans.lib.awtextra.AbsoluteConstraints(923, 507, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
       String answer = txtanswer.getText();
       String newPasswrod = txtnewPass.getText();
       if(answer.equals(dbAnswer))
       {
          Userdao.update(email, newPasswrod);
          clear();
       }
       else{
           JOptionPane.showMessageDialog(null, "<html> <b style =\"color:red\"> Incorrect Answer </b></html>","Message",JOptionPane.ERROR_MESSAGE);
       }
        
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsearchActionPerformed
        email = txtemail.getText();
        User user = null;
        user = Userdao.getSecurityQuestion(email);
        if(user == null)
        {
            JOptionPane.showMessageDialog(null, "<html> <b style =\"color:red\"> Incorrect email </b></html>","Message",JOptionPane.ERROR_MESSAGE);
        }
        else
            btnsearch.setEnabled(false);
        txtemail.setEditable(false);
        dbAnswer = user.getAnswer();
    }//GEN-LAST:event_btnsearchActionPerformed

    private void btnloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnloginActionPerformed
        setVisible(false);
        new login().setVisible(true);
    }//GEN-LAST:event_btnloginActionPerformed

    private void btnclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclearActionPerformed
      clear();
    }//GEN-LAST:event_btnclearActionPerformed

    private void btnSignupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignupActionPerformed
        setVisible(false);
       new Signup().setVisible(true);
    }//GEN-LAST:event_btnSignupActionPerformed

    private void btnexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexitActionPerformed
        int a = JOptionPane.showConfirmDialog(null, "Do you really want to Close Application", "Select", JOptionPane.YES_NO_OPTION);
        if (a == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_btnexitActionPerformed

    private void txtemailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtemailKeyReleased
        validateEmail();
    }//GEN-LAST:event_txtemailKeyReleased

    private void txtsecQuesKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsecQuesKeyReleased
       ValidateFields();
    }//GEN-LAST:event_txtsecQuesKeyReleased

    private void txtanswerKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtanswerKeyReleased
     ValidateFields();
    }//GEN-LAST:event_txtanswerKeyReleased

    private void txtnewPassKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnewPassKeyReleased
       ValidateFields();
    }//GEN-LAST:event_txtnewPassKeyReleased

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
            java.util.logging.Logger.getLogger(ForgotPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ForgotPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ForgotPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ForgotPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ForgotPassword().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSignup;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnclear;
    private javax.swing.JButton btnexit;
    private javax.swing.JButton btnlogin;
    private javax.swing.JButton btnsearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField txtanswer;
    private javax.swing.JTextField txtemail;
    private javax.swing.JPasswordField txtnewPass;
    private javax.swing.JTextField txtsecQues;
    // End of variables declaration//GEN-END:variables
}
