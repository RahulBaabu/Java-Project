/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author JITHIN V J
 */
import java.io.*;
import static java.lang.Integer.parseInt;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import java.sql.*;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class SignUpPatient extends javax.swing.JFrame {
int i;
    /**
     * Creates new form SignUpPatient
     */
    public SignUpPatient() {
        initComponents();
          try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/e_healthcaredb";
            
           // JOptionPane.showMessageDialog(null,"Connected");
        }
        
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Not Connected");
            System.out.println("Exception"+e);
        }

        pp1.setVisible(false);
        sss.setVisible(false);
        jLabel10.setVisible(false);
        jLabel9.setVisible(false);
           }
    public boolean SignUpPatientmail(String mail)
    {
        final String emailregex = 
        "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
        + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
    Pattern pat=Pattern.compile(emailregex);
    if (mail == null)
            return false;
    return pat.matcher(mail).matches();
    }
    public String Gender()
    {
        String s1;
        if(r1.isSelected())
                {
                    s1="Male";
                }
                else if(r2.isSelected())
                {
                    s1="Female";
                }
                else if(r3.isSelected())
                {
                    s1="Others";
                }
                else 
                {
                    s1="";
                }
        return s1;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        l1 = new javax.swing.JLabel();
        tf1 = new javax.swing.JTextField();
        l2 = new javax.swing.JLabel();
        tf2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tf3 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tf4 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        r1 = new javax.swing.JRadioButton();
        r2 = new javax.swing.JRadioButton();
        r3 = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        tf5 = new javax.swing.JTextField();
        l6 = new javax.swing.JLabel();
        c2 = new javax.swing.JComboBox<>();
        l7 = new javax.swing.JLabel();
        l8 = new javax.swing.JLabel();
        p1 = new javax.swing.JPasswordField();
        c3 = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        tf6 = new javax.swing.JTextField();
        b1 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        c1 = new javax.swing.JCheckBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        tf9 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        l10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        pp1 = new javax.swing.JTextField();
        sss = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        l1.setText("FirstName");
        getContentPane().add(l1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 72, 129, 34));

        tf1.setName(""); // NOI18N
        tf1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf1ActionPerformed(evt);
            }
        });
        getContentPane().add(tf1, new org.netbeans.lib.awtextra.AbsoluteConstraints(249, 74, 190, -1));

        l2.setText("LastName");
        getContentPane().add(l2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 138, 129, -1));
        getContentPane().add(tf2, new org.netbeans.lib.awtextra.AbsoluteConstraints(249, 135, 190, -1));

        jLabel1.setText("DateOfBirth");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 204, 129, -1));

        jLabel2.setText("Age");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 264, -1, -1));

        tf3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf3ActionPerformed(evt);
            }
        });
        getContentPane().add(tf3, new org.netbeans.lib.awtextra.AbsoluteConstraints(249, 261, 190, -1));

        jLabel3.setText("EmailId");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 318, 129, -1));

        tf4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf4ActionPerformed(evt);
            }
        });
        getContentPane().add(tf4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 320, 281, -1));

        jLabel4.setText("Gender");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 418, -1, -1));

        bg1.add(r1);
        r1.setText("Male");
        r1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r1ActionPerformed(evt);
            }
        });
        getContentPane().add(r1, new org.netbeans.lib.awtextra.AbsoluteConstraints(249, 416, 64, -1));

        bg1.add(r2);
        r2.setText("Female");
        r2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r2ActionPerformed(evt);
            }
        });
        getContentPane().add(r2, new org.netbeans.lib.awtextra.AbsoluteConstraints(319, 416, -1, -1));

        bg1.add(r3);
        r3.setText("Others");
        r3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r3ActionPerformed(evt);
            }
        });
        getContentPane().add(r3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 416, -1, -1));

        jLabel5.setText("City");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 600, 129, -1));

        tf5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf5ActionPerformed(evt);
            }
        });
        getContentPane().add(tf5, new org.netbeans.lib.awtextra.AbsoluteConstraints(253, 586, 200, -1));

        l6.setText("BloodGroup");
        getContentPane().add(l6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 473, 129, -1));

        c2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {" ","A+","B+","A-","B-","AB+","AB-","O+","O-" }));
        c2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c2ActionPerformed(evt);
            }
        });
        getContentPane().add(c2, new org.netbeans.lib.awtextra.AbsoluteConstraints(249, 470, 200, -1));

        l7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        l7.setText("Create a new account..");
        getContentPane().add(l7, new org.netbeans.lib.awtextra.AbsoluteConstraints(249, 0, 289, -1));

        l8.setText("Password");
        getContentPane().add(l8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, 129, -1));

        p1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p1ActionPerformed(evt);
            }
        });
        getContentPane().add(p1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 370, 190, 30));

        c3.setText("show password");
        c3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c3ActionPerformed(evt);
            }
        });
        getContentPane().add(c3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 370, -1, -1));

        jLabel6.setText("Mobile No");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 532, 129, -1));
        getContentPane().add(tf6, new org.netbeans.lib.awtextra.AbsoluteConstraints(249, 529, 200, -1));

        b1.setText("Confirm");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });
        getContentPane().add(b1, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 745, 136, -1));

        jButton1.setText("Clear");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(283, 745, 136, -1));

        b3.setText("Back");
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });
        getContentPane().add(b3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 90, 30));

        c1.setText("Accept our terms  and conditions");
        c1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c1ActionPerformed(evt);
            }
        });
        getContentPane().add(c1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 662, -1, -1));

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jTextArea2.setText("Terms and Conditions:\n\n* Your data can be read by the admin and \n  the doctors who treat you.\n*If anyone is find misusing this App,they will\n be removed permanently\n");
        jScrollPane2.setViewportView(jTextArea2);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 100, 370, 493));
        getContentPane().add(tf9, new org.netbeans.lib.awtextra.AbsoluteConstraints(249, 201, 190, -1));
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(557, 201, -1, -1));

        l10.setText("DD-MM-YYYY");
        getContentPane().add(l10, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 210, 135, 17));
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, -1, -1));
        getContentPane().add(jTabbedPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 170, 290, 250));

        pp1.setText("jTextField1");
        pp1.setCaretPosition(0);
        pp1.setPreferredSize(new java.awt.Dimension(64, 31));
        getContentPane().add(pp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 370, 141, -1));

        sss.setText("*Invalid ");
        getContentPane().add(sss, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 320, -1, -1));

        jLabel10.setForeground(new java.awt.Color(255, 0, 0));
        jLabel10.setText("*All fields are required");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 630, -1, -1));

        jLabel9.setText("*Only 10 digits");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 530, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon("C:\\Users\\JITHIN V J\\Downloads\\2.jpg")); // NOI18N
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 2050, 1050));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tf1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf1ActionPerformed

    private void r3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_r3ActionPerformed

    private void r1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_r1ActionPerformed

    private void r2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_r2ActionPerformed

    private void tf3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf3ActionPerformed

    private void tf5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf5ActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
           
            SignUp s1=new SignUp();
            s1.setVisible(true);
             setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_b3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    tf1.setText("");
    tf2.setText("");
    tf3.setText("");
    tf4.setText("");
    tf5.setText("");
    tf6.setText("");
    pp1.setText("");
    p1.setText("");
    tf9.setText("");
    bg1.clearSelection();
    c2.setName(" ");
    
    

    }//GEN-LAST:event_jButton1ActionPerformed

    private void c1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c1ActionPerformed

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
         // TODO add your handling code here:
         int len;
         String mob;
         mob=tf6.getText();
         len=mob.length();
         String s2 = null;
          String ss=tf4.getText();
         try
         {
             
             s2=p1.getText();
             
         }
         catch(Exception e)
         {
             JOptionPane.showMessageDialog(null,"Password Field is required");
             System.out.println("Exception"+e);
         }
         System.out.println(s2);
         int flag=1;
         int cnt=0;
         if(flag==1)
         {    
        if (!c1.isSelected())
        {
            JOptionPane.showMessageDialog(null,"Accept the terms and conditions");
        }
        else
        {
            cnt++;
        }
        
    
        
         if("".equals(tf1.getText())||tf2.getText()==""||tf9.getText()==""||tf3.getText()==""||tf4.getText()==""||s2==null||tf6.getText()==""||tf5.getText()==""||Gender()=="")
        {
        jLabel10.setVisible(true);
        }
         else 
         {
             cnt++;
         }
         if(SignUpPatientmail(ss))
        {
            sss.setVisible(false);
        }
         
         if(!SignUpPatientmail(ss))
        {
            sss.setVisible(true);
            JOptionPane.showMessageDialog(null,"Enter a Valid Email Id");
        }
         else
         {
             cnt++;
         }
         if(len!=10)
        {
            jLabel9.setVisible(true);
        }
         else
         {
            cnt++;
         }
         }
         System.out.println(cnt);
        if(cnt==4)
         {
             System.out.println("Inside if");
            try
            {
                System.out.println("Inside if0");
                Connection con=java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/e_healthcaredb","root","");
                System.out.println("Inside if1");
                Statement st=con.createStatement();
                System.out.println("Inside if2");
                String s1;
                s1=Gender();
               String str="INSERT INTO Patient_SignUp values('"+tf1.getText()+"','"+tf2.getText()+"','"+tf9.getText()+"','"+tf3.getText()+"','"+tf4.getText()+"','"+p1.getText()+"','"+s1+"','"+c2.getSelectedItem().toString()+"','"+tf6.getText()+"','"+tf5.getText()+"')";
               st.executeUpdate(str);
               //System.out.println("dai");
               // JOptionPane.showMessageDialog(null,"Inserted");
               LoginPatient p12=new LoginPatient();
               p12.setVisible(true);
               setVisible(false);
            }
            catch(SQLException e)
            {
                System.out.println(e);
                JOptionPane.showMessageDialog(null, "Not Inserted");
            }
        }
        
        
        
    }//GEN-LAST:event_b1ActionPerformed

    private void p1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p1ActionPerformed
    // TODO add your handling code here:
    }//GEN-LAST:event_p1ActionPerformed

    private void c3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c3ActionPerformed
           String s=p1.getText();
           System.out.println(s);
           if(c3.isSelected())
           {
               p1.setVisible(false);
               pp1.setVisible(true);
               pp1.setText(s);
           }
           else
           {
               p1.setVisible(true);
               pp1.setVisible(false);
           }
           
           
           // TODO add your handling code here:
    }//GEN-LAST:event_c3ActionPerformed

    private void tf4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf4ActionPerformed
    
    }//GEN-LAST:event_tf4ActionPerformed

    private void c2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c2ActionPerformed

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
            java.util.logging.Logger.getLogger(SignUpPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignUpPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignUpPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignUpPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignUpPatient().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b1;
    private javax.swing.JButton b3;
    private javax.swing.ButtonGroup bg1;
    private javax.swing.JCheckBox c1;
    private static javax.swing.JComboBox<String> c2;
    private javax.swing.JCheckBox c3;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel l10;
    private javax.swing.JLabel l2;
    private javax.swing.JLabel l6;
    private javax.swing.JLabel l7;
    private javax.swing.JLabel l8;
    private javax.swing.JPasswordField p1;
    private javax.swing.JTextField pp1;
    private javax.swing.JRadioButton r1;
    private javax.swing.JRadioButton r2;
    private javax.swing.JRadioButton r3;
    private javax.swing.JLabel sss;
    private javax.swing.JTextField tf1;
    private javax.swing.JTextField tf2;
    private javax.swing.JTextField tf3;
    private javax.swing.JTextField tf4;
    private javax.swing.JTextField tf5;
    private javax.swing.JTextField tf6;
    private javax.swing.JTextField tf9;
    // End of variables declaration//GEN-END:variables

    
}