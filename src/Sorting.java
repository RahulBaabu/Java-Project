
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author JITHIN V J
 */
public class Sorting extends javax.swing.JFrame {

    /**
     * Creates new form Sorting
     */
    String ss4;
    public Sorting() {
        initComponents();
        p1.setVisible(false);
        p2.setVisible(false);
        p3.setVisible(false);
        p4.setVisible(false);
        p5.setVisible(false);
        p6.setVisible(false);
        p7.setVisible(false);
        p8.setVisible(false);
        p9.setVisible(false);
        p10.setVisible(false);
        b11.setVisible(false);
        tf1.setVisible(false);
        tf2.setVisible(false);
        tf3.setVisible(false);
        a1.setVisible(false);
        a2.setVisible(false);
        a3.setVisible(false);
        ar1.setVisible(false);
       // ar1.setEnabled(true);
        
        
        
        
        String query="Select * from doctor_signUp ";//where"+s+"="+s1;
         try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/e_healthcaredb";
            Connection c=DriverManager.getConnection(url,"root","");
            Statement st=c.createStatement();
        
            ResultSet rs=st.executeQuery(query);
                int i=1;
                while(rs.next())
                {
                switch (i) {
                    case 1:
                        p1.setVisible(true);
                        ll1.setText(rs.getString("Name"));
                        ll2.setText(rs.getString("Specialization"));
                        ll3.setText(rs.getString("MobileNo"));
                        break;
                    case 2:
                        p2.setVisible(true);
                        ll4.setText(rs.getString("Name"));
                        ll5.setText(rs.getString("Specialization"));
                        ll6.setText(rs.getString("MobileNo"));
                        break;
                    case 3:
                        p3.setVisible(true);
                        ll7.setText(rs.getString("Name"));
                        ll8.setText(rs.getString("Specialization"));
                        ll9.setText(rs.getString("MobileNo"));
                        break;
                    case 4:
                        p4.setVisible(true);
                        ll10.setText(rs.getString("Name"));
                        ll11.setText(rs.getString("Specialization"));
                        ll12.setText(rs.getString("MobileNo"));
                        break;
                    case 5:
                        p5.setVisible(true);
                        ll13.setText(rs.getString("Name"));
                        ll14.setText(rs.getString("Specialization"));
                        ll15.setText(rs.getString("MobileNo"));
                        break;
                    case 6:
                        p6.setVisible(true);
                        ll16.setText(rs.getString("Name"));
                        ll17.setText(rs.getString("Specialization"));
                        ll18.setText(rs.getString("MobileNo"));
                        break;
                    case 7:
                        p7.setVisible(true);
                        ll19.setText(rs.getString("Name"));
                        ll20.setText(rs.getString("Specialization"));
                        ll21.setText(rs.getString("MobileNo"));
                        break;
                    case 8:
                        p8.setVisible(true);
                        ll22.setText(rs.getString("Name"));
                        ll23.setText(rs.getString("Specialization"));
                        ll24.setText(rs.getString("MobileNo"));
                        break;
                    case 9:
                        p9.setVisible(true);
                        ll25.setText(rs.getString("Name"));
                        ll26.setText(rs.getString("Specialization"));
                        ll27.setText(rs.getString("MobileNo"));
                        break;
                    case 10:
                        p10.setVisible(true);
                        ll28.setText(rs.getString("Name"));
                        ll29.setText(rs.getString("Specialization"));
                        ll30.setText(rs.getString("MobileNo"));
                        break;
                    default:
                        break;
                }
                i=i+1;
                }
               
    } 
         catch (Exception ex) {
            Logger.getLogger(Sorting.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void insert(String s1,String s2, String s3,String s4)
    {
        try
            {
                int i=Integer.parseInt(s2);
                
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/e_healthcaredb","root","");
                Statement st=con.createStatement();
               // String s1;
               var str="INSERT INTO Appointment values('"+s1+"','"+s2+"','"+s3+"','"+s4+"')";//,'"+tf4.getText()+"','"+p1.getText()+"','"+s1+"','"+c2.getSelectedItem().toString()+"','"+tf6.getText()+"','"+tf5.getText()+"')";
               st.executeUpdate(str);
               JOptionPane.showMessageDialog(null, "You have successfully Booked your Appointment with"+s4);
               //System.out.println("dai");
               // JOptionPane.showMessageDialog(null,"Inserted");
               //LoginPatient p12=new LoginPatient();
               //p12.setVisible(true);
               //setVisible(false);
            }
            catch(SQLException e)
            {
                System.out.println(e);
                JOptionPane.showMessageDialog(null, "Not Inserted");
            }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // </editor-fold>
@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        p7 = new javax.swing.JPanel();
        ll19 = new javax.swing.JLabel();
        ll20 = new javax.swing.JLabel();
        ll21 = new javax.swing.JLabel();
        b7 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        p4 = new javax.swing.JPanel();
        ll10 = new javax.swing.JLabel();
        ll11 = new javax.swing.JLabel();
        ll12 = new javax.swing.JLabel();
        b4 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        p9 = new javax.swing.JPanel();
        ll25 = new javax.swing.JLabel();
        ll26 = new javax.swing.JLabel();
        ll27 = new javax.swing.JLabel();
        b9 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        p2 = new javax.swing.JPanel();
        ll4 = new javax.swing.JLabel();
        ll5 = new javax.swing.JLabel();
        ll6 = new javax.swing.JLabel();
        b2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        p5 = new javax.swing.JPanel();
        ll13 = new javax.swing.JLabel();
        ll14 = new javax.swing.JLabel();
        ll15 = new javax.swing.JLabel();
        b5 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        p3 = new javax.swing.JPanel();
        ll7 = new javax.swing.JLabel();
        ll8 = new javax.swing.JLabel();
        ll9 = new javax.swing.JLabel();
        b3 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        p6 = new javax.swing.JPanel();
        ll16 = new javax.swing.JLabel();
        ll17 = new javax.swing.JLabel();
        ll18 = new javax.swing.JLabel();
        b6 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        p1 = new javax.swing.JPanel();
        ll1 = new javax.swing.JLabel();
        ll2 = new javax.swing.JLabel();
        ll3 = new javax.swing.JLabel();
        b1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        p8 = new javax.swing.JPanel();
        ll22 = new javax.swing.JLabel();
        ll23 = new javax.swing.JLabel();
        ll24 = new javax.swing.JLabel();
        b8 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        p10 = new javax.swing.JPanel();
        ll28 = new javax.swing.JLabel();
        ll30 = new javax.swing.JLabel();
        ll29 = new javax.swing.JLabel();
        b10 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        tf1 = new javax.swing.JTextField();
        tf2 = new javax.swing.JTextField();
        tf3 = new javax.swing.JTextField();
        b11 = new javax.swing.JButton();
        a1 = new javax.swing.JLabel();
        a2 = new javax.swing.JLabel();
        a3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ar1 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        p7.setBackground(new java.awt.Color(255, 255, 255));
        p7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        ll19.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        ll19.setForeground(new java.awt.Color(255, 0, 0));
        ll19.setText("   ");

        ll20.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        ll20.setText("  ");

        ll21.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        ll21.setForeground(new java.awt.Color(0, 255, 0));
        ll21.setText("   ");

        b7.setText("Ok");
        b7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout p7Layout = new javax.swing.GroupLayout(p7);
        p7.setLayout(p7Layout);
        p7Layout.setHorizontalGroup(
            p7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p7Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(p7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ll19, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                    .addComponent(ll20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ll21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(b7)
                .addContainerGap())
            .addGroup(p7Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        p7Layout.setVerticalGroup(
            p7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p7Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(p7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p7Layout.createSequentialGroup()
                        .addComponent(ll19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ll20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ll21)
                        .addGap(17, 17, 17))
                    .addComponent(b7, javax.swing.GroupLayout.Alignment.TRAILING)))
        );

        jPanel1.add(p7, new org.netbeans.lib.awtextra.AbsoluteConstraints(421, 642, -1, 306));

        p4.setBackground(new java.awt.Color(255, 255, 255));
        p4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        ll10.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        ll10.setForeground(new java.awt.Color(255, 0, 0));
        ll10.setText("  ");

        ll11.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        ll11.setText("  ");

        ll12.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        ll12.setForeground(new java.awt.Color(0, 255, 0));
        ll12.setText("    ");

        b4.setText("Ok");
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout p4Layout = new javax.swing.GroupLayout(p4);
        p4.setLayout(p4Layout);
        p4Layout.setHorizontalGroup(
            p4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p4Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(p4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ll10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ll11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ll12, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(b4))
            .addGroup(p4Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 41, Short.MAX_VALUE))
        );
        p4Layout.setVerticalGroup(
            p4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(p4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p4Layout.createSequentialGroup()
                        .addComponent(ll10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ll11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ll12)
                        .addGap(17, 17, 17))
                    .addComponent(b4, javax.swing.GroupLayout.Alignment.TRAILING)))
        );

        jPanel1.add(p4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1064, 241, -1, 326));

        p9.setBackground(new java.awt.Color(255, 255, 255));
        p9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        ll25.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        ll25.setForeground(new java.awt.Color(255, 0, 0));
        ll25.setText("   ");

        ll26.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        ll26.setText("  ");

        ll27.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        ll27.setForeground(new java.awt.Color(0, 255, 0));
        ll27.setText("  ");

        b9.setText("Ok");
        b9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout p9Layout = new javax.swing.GroupLayout(p9);
        p9.setLayout(p9Layout);
        p9Layout.setHorizontalGroup(
            p9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p9Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(p9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ll25, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                    .addComponent(ll26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ll27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(b9)
                .addContainerGap())
            .addGroup(p9Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
        );
        p9Layout.setVerticalGroup(
            p9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p9Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(p9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p9Layout.createSequentialGroup()
                        .addComponent(ll25)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ll26)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ll27)
                        .addGap(17, 17, 17))
                    .addComponent(b9, javax.swing.GroupLayout.Alignment.TRAILING)))
        );

        jPanel1.add(p9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1064, 642, -1, 306));

        p2.setBackground(new java.awt.Color(255, 255, 255));
        p2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        ll4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        ll4.setForeground(new java.awt.Color(255, 0, 0));
        ll4.setText("   ");

        ll5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        ll5.setText("   ");

        ll6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        ll6.setForeground(new java.awt.Color(0, 255, 0));
        ll6.setText("   ");

        b2.setText("Ok");
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout p2Layout = new javax.swing.GroupLayout(p2);
        p2.setLayout(p2Layout);
        p2Layout.setHorizontalGroup(
            p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ll4, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                    .addComponent(ll5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ll6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(b2))
            .addGroup(p2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        p2Layout.setVerticalGroup(
            p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p2Layout.createSequentialGroup()
                        .addComponent(ll4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ll5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ll6)
                        .addGap(17, 17, 17))
                    .addComponent(b2, javax.swing.GroupLayout.Alignment.TRAILING)))
        );

        jPanel1.add(p2, new org.netbeans.lib.awtextra.AbsoluteConstraints(421, 241, -1, 326));

        p5.setBackground(new java.awt.Color(255, 255, 255));
        p5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        ll13.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        ll13.setForeground(new java.awt.Color(255, 0, 0));
        ll13.setText("  ");

        ll14.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        ll14.setText("  ");

        ll15.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        ll15.setForeground(new java.awt.Color(0, 255, 0));
        ll15.setText("  ");

        b5.setText("Ok");
        b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout p5Layout = new javax.swing.GroupLayout(p5);
        p5.setLayout(p5Layout);
        p5Layout.setHorizontalGroup(
            p5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p5Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(p5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ll13, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                    .addComponent(ll14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ll15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(b5))
            .addGroup(p5Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        p5Layout.setVerticalGroup(
            p5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p5Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(p5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p5Layout.createSequentialGroup()
                        .addComponent(ll13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ll14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ll15)
                        .addGap(17, 17, 17))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p5Layout.createSequentialGroup()
                        .addComponent(b5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        jPanel1.add(p5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1435, 241, 289, -1));

        p3.setBackground(new java.awt.Color(255, 255, 255));
        p3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        ll7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        ll7.setForeground(new java.awt.Color(255, 51, 51));
        ll7.setText("   ");

        ll8.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        ll8.setText("   ");

        ll9.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        ll9.setForeground(new java.awt.Color(0, 255, 0));
        ll9.setText("   ");

        b3.setText("Ok");
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout p3Layout = new javax.swing.GroupLayout(p3);
        p3.setLayout(p3Layout);
        p3Layout.setHorizontalGroup(
            p3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p3Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(p3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ll9, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                    .addComponent(ll7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ll8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(b3))
            .addGroup(p3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 47, Short.MAX_VALUE))
        );
        p3Layout.setVerticalGroup(
            p3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addComponent(ll7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ll8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(p3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p3Layout.createSequentialGroup()
                        .addComponent(ll9)
                        .addGap(17, 17, 17))
                    .addComponent(b3, javax.swing.GroupLayout.Alignment.TRAILING)))
        );

        jPanel1.add(p3, new org.netbeans.lib.awtextra.AbsoluteConstraints(735, 241, 287, 326));

        p6.setBackground(new java.awt.Color(255, 255, 255));
        p6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        ll16.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        ll16.setForeground(new java.awt.Color(255, 0, 0));
        ll16.setText("   ");

        ll17.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        ll17.setText("  ");

        ll18.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        ll18.setForeground(new java.awt.Color(51, 255, 0));
        ll18.setText("  ");

        b6.setText("Ok");
        b6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout p6Layout = new javax.swing.GroupLayout(p6);
        p6.setLayout(p6Layout);
        p6Layout.setHorizontalGroup(
            p6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p6Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(p6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ll16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ll17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ll18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 146, Short.MAX_VALUE)
                .addComponent(b6))
            .addGroup(p6Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        p6Layout.setVerticalGroup(
            p6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p6Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(p6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p6Layout.createSequentialGroup()
                        .addComponent(ll16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ll17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ll18)
                        .addGap(17, 17, 17))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p6Layout.createSequentialGroup()
                        .addComponent(b6)
                        .addContainerGap())))
        );

        jPanel1.add(p6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 640, -1, 306));

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("MAKE A HEALTHY WORLD");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 50, 500, 70));

        p1.setBackground(new java.awt.Color(255, 255, 255));
        p1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        ll1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        ll1.setForeground(new java.awt.Color(255, 0, 0));
        ll1.setText("  ");

        ll2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        ll2.setText("  ");

        ll3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        ll3.setForeground(new java.awt.Color(0, 255, 0));
        ll3.setText("  ");

        b1.setText("Ok");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout p1Layout = new javax.swing.GroupLayout(p1);
        p1.setLayout(p1Layout);
        p1Layout.setHorizontalGroup(
            p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ll1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ll2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ll3, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(b1)
                .addContainerGap())
            .addGroup(p1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        p1Layout.setVerticalGroup(
            p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p1Layout.createSequentialGroup()
                        .addComponent(ll1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ll2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ll3)
                        .addGap(12, 12, 12))
                    .addComponent(b1, javax.swing.GroupLayout.Alignment.TRAILING)))
        );

        jPanel1.add(p1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, 326));

        p8.setBackground(new java.awt.Color(255, 255, 255));
        p8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        ll22.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        ll22.setForeground(new java.awt.Color(255, 0, 0));
        ll22.setText("  ");

        ll23.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        ll23.setText("  ");

        ll24.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        ll24.setForeground(new java.awt.Color(0, 255, 0));
        ll24.setText("    ");

        b8.setText("Ok");
        b8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout p8Layout = new javax.swing.GroupLayout(p8);
        p8.setLayout(p8Layout);
        p8Layout.setHorizontalGroup(
            p8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p8Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(p8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(p8Layout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 32, Short.MAX_VALUE))
                    .addGroup(p8Layout.createSequentialGroup()
                        .addGroup(p8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ll22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ll23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ll24, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(b8))))
        );
        p8Layout.setVerticalGroup(
            p8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p8Layout.createSequentialGroup()
                .addGap(0, 30, Short.MAX_VALUE)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(p8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p8Layout.createSequentialGroup()
                        .addComponent(ll22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ll23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ll24)
                        .addGap(12, 12, 12))
                    .addComponent(b8, javax.swing.GroupLayout.Alignment.TRAILING)))
        );

        jPanel1.add(p8, new org.netbeans.lib.awtextra.AbsoluteConstraints(735, 642, -1, -1));

        p10.setBackground(new java.awt.Color(255, 255, 255));
        p10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        ll28.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        ll28.setForeground(new java.awt.Color(255, 0, 0));
        ll28.setText("   ");

        ll30.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        ll30.setForeground(new java.awt.Color(0, 255, 0));
        ll30.setText("  ");

        ll29.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        ll29.setText("  ");

        b10.setText("Ok");
        b10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout p10Layout = new javax.swing.GroupLayout(p10);
        p10.setLayout(p10Layout);
        p10Layout.setHorizontalGroup(
            p10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p10Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(p10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(p10Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 31, Short.MAX_VALUE))
                    .addGroup(p10Layout.createSequentialGroup()
                        .addGroup(p10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ll28, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                            .addComponent(ll30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ll29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(b10)))
                .addContainerGap())
        );
        p10Layout.setVerticalGroup(
            p10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p10Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(p10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p10Layout.createSequentialGroup()
                        .addComponent(ll28)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ll29)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ll30)
                        .addGap(16, 16, 16))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p10Layout.createSequentialGroup()
                        .addComponent(b10)
                        .addContainerGap())))
        );

        jPanel1.add(p10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1435, 642, -1, 306));

        tf1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tf1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tf1FocusLost(evt);
            }
        });
        tf1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf1ActionPerformed(evt);
            }
        });
        jPanel1.add(tf1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 160, 208, -1));

        tf2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf2ActionPerformed(evt);
            }
        });
        jPanel1.add(tf2, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 160, 177, -1));
        jPanel1.add(tf3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 160, 170, -1));

        b11.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        b11.setText("Confirm Your Appointment");
        b11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b11ActionPerformed(evt);
            }
        });
        jPanel1.add(b11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1227, 142, -1, 69));

        a1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        a1.setText("Patient");
        jPanel1.add(a1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 130, -1, -1));

        a2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        a2.setText("Age");
        jPanel1.add(a2, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 120, -1, -1));

        a3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        a3.setText("Contact");
        jPanel1.add(a3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 120, -1, -1));

        ar1.setEditable(false);
        ar1.setColumns(20);
        ar1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        ar1.setRows(5);
        ar1.setCaretColor(new java.awt.Color(0, 204, 204));
        jScrollPane2.setViewportView(ar1);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 220, 630, 550));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\JITHIN V J\\Downloads\\Project Wallpaper\\7.jpg")); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 2020, 1360));

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1954, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1686, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        setVisible(false);
        PatientPage pp=new PatientPage();
        pp.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void b5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b5ActionPerformed
ss4=ll13.getText();
p1.setVisible(false);
        p2.setVisible(false);
        p3.setVisible(false);
        p4.setVisible(false);
        p5.setVisible(false);
        p6.setVisible(false);
        p7.setVisible(false);
        p8.setVisible(false);
        p9.setVisible(false);
        p10.setVisible(false);
        b11.setVisible(true);
        tf1.setVisible(true);
        tf2.setVisible(true);
        tf3.setVisible(true); 
        a1.setVisible(true);
        a2.setVisible(true);
        a3.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_b5ActionPerformed

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
                ss4=ll1.getText();
        p1.setVisible(false);
        p2.setVisible(false);
        p3.setVisible(false);
        p4.setVisible(false);
        p5.setVisible(false);
        p6.setVisible(false);
        p7.setVisible(false);
        p8.setVisible(false);
        p9.setVisible(false);
        p10.setVisible(false);
        b11.setVisible(true);
        tf1.setVisible(true);
        tf2.setVisible(true);
        tf3.setVisible(true);
        a1.setVisible(true);
        a2.setVisible(true);
        a3.setVisible(true);
        
    }//GEN-LAST:event_b1ActionPerformed

    private void tf1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf1ActionPerformed

    private void tf2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf2ActionPerformed

    private void tf1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf1FocusGained
        
        //tf1.setText("       Patient");
        
        //tf1.setForeground(Color.red);// TODO add your handling code here:
    }//GEN-LAST:event_tf1FocusGained

    private void tf1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf1FocusLost
      // tf1.setText("        Patient"); // TODO add your handling code here:
    }//GEN-LAST:event_tf1FocusLost

    private void b11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b11ActionPerformed
        String ss1 = tf1.getText();
         
        //String ss2;
        String ss2 = tf2.getText();
        String ss3 = tf3.getText();
        String ss5 = null,ss6 = null,ss7 = null,ss8 = null;
        
        String query="Select * from doctor_signUp where Name="+ss4;
         try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/e_healthcaredb";
            Connection c=DriverManager.getConnection(url,"root","");
            Statement st=c.createStatement();
        
            ResultSet rs=st.executeQuery(query);
            while(rs.next())
            {
             ss5=rs.getString("FROM-TIME");
             ss6=rs.getString("FROM--SESSION");
             ss7=rs.getString("TO-TIME");
             ss8=rs.getString("TO--SESSION");
            }
        }
         catch(Exception e)
         {
             
         }
        ar1.setVisible(true);
        //ar1.setVisible(false);
        String s1="Patient Name     :   "+tf1.getText()+"\nAge  :   "+tf2.getText()+"\nContact  :   "+tf3.getText()+"\nDoctor     :   "+ss4;//+"\nTIMINGS  :   "+ss5+ss6+"to"+ss7+ss8;
        ar1.setText(s1);
       // String s2="Age     :   "+tf2.getText();
        //ar1.append("\n");
        //ar1.setText(s2);
        insert(ss1,ss2,ss3,ss4);        // TODO add your handling code here:
    }//GEN-LAST:event_b11ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
ss4=ll4.getText();
p1.setVisible(false);
        p2.setVisible(false);
        p3.setVisible(false);
        p4.setVisible(false);
        p5.setVisible(false);
        p6.setVisible(false);
        p7.setVisible(false);
        p8.setVisible(false);
        p9.setVisible(false);
        p10.setVisible(false);
        b11.setVisible(true);
        tf1.setVisible(true);
        tf2.setVisible(true);
        tf3.setVisible(true);  
        a1.setVisible(true);
        a2.setVisible(true);
        a3.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_b2ActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
ss4=ll7.getText();
p1.setVisible(false);
        p2.setVisible(false);
        p3.setVisible(false);
        p4.setVisible(false);
        p5.setVisible(false);
        p6.setVisible(false);
        p7.setVisible(false);
        p8.setVisible(false);
        p9.setVisible(false);
        p10.setVisible(false);
        b11.setVisible(true);
        tf1.setVisible(true);
        tf2.setVisible(true);
        tf3.setVisible(true);     
        a1.setVisible(true);
        a2.setVisible(true);
        a3.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_b3ActionPerformed

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed
ss4=ll10.getText();
p1.setVisible(false);
        p2.setVisible(false);
        p3.setVisible(false);
        p4.setVisible(false);
        p5.setVisible(false);
        p6.setVisible(false);
        p7.setVisible(false);
        p8.setVisible(false);
        p9.setVisible(false);
        p10.setVisible(false);
        b11.setVisible(true);
        tf1.setVisible(true);
        tf2.setVisible(true);
        tf3.setVisible(true);   
        a1.setVisible(true);
        a2.setVisible(true);
        a3.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_b4ActionPerformed

    private void b6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b6ActionPerformed
ss4=ll16.getText();
p1.setVisible(false);
        p2.setVisible(false);
        p3.setVisible(false);
        p4.setVisible(false);
        p5.setVisible(false);
        p6.setVisible(false);
        p7.setVisible(false);
        p8.setVisible(false);
        p9.setVisible(false);
        p10.setVisible(false);
        b11.setVisible(true);
        tf1.setVisible(true);
        tf2.setVisible(true);
        tf3.setVisible(true);   
        a1.setVisible(true);
        a2.setVisible(true);
        a3.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_b6ActionPerformed

    private void b7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b7ActionPerformed
ss4=ll19.getText();
p1.setVisible(false);
        p2.setVisible(false);
        p3.setVisible(false);
        p4.setVisible(false);
        p5.setVisible(false);
        p6.setVisible(false);
        p7.setVisible(false);
        p8.setVisible(false);
        p9.setVisible(false);
        p10.setVisible(false);
        b11.setVisible(true);
        tf1.setVisible(true);
        tf2.setVisible(true);
        tf3.setVisible(true);   
        a1.setVisible(true);
        a2.setVisible(true);
        a3.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_b7ActionPerformed

    private void b8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b8ActionPerformed
ss4=ll25.getText();
p1.setVisible(false);
        p2.setVisible(false);
        p3.setVisible(false);
        p4.setVisible(false);
        p5.setVisible(false);
        p6.setVisible(false);
        p7.setVisible(false);
        p8.setVisible(false);
        p9.setVisible(false);
        p10.setVisible(false);
        b11.setVisible(true);
        tf1.setVisible(true);
        tf2.setVisible(true);
        tf3.setVisible(true);   
        a1.setVisible(true);
        a2.setVisible(true);
        a3.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_b8ActionPerformed

    private void b9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b9ActionPerformed
ss4=ll22.getText();
p1.setVisible(false);
        p2.setVisible(false);
        p3.setVisible(false);
        p4.setVisible(false);
        p5.setVisible(false);
        p6.setVisible(false);
        p7.setVisible(false);
        p8.setVisible(false);
        p9.setVisible(false);
        p10.setVisible(false);
        b11.setVisible(true);
        tf1.setVisible(true);
        tf2.setVisible(true);
        tf3.setVisible(true);  
        a1.setVisible(true);
        a2.setVisible(true);
        a3.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_b9ActionPerformed

    private void b10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b10ActionPerformed
ss4=ll28.getText();
p1.setVisible(false);
        p2.setVisible(false);
        p3.setVisible(false);
        p4.setVisible(false);
        p5.setVisible(false);
        p6.setVisible(false);
        p7.setVisible(false);
        p8.setVisible(false);
        p9.setVisible(false);
        p10.setVisible(false);
        b11.setVisible(true);
        tf1.setVisible(true);
        tf2.setVisible(true);
        tf3.setVisible(true);   
        a1.setVisible(true);
        a2.setVisible(true);
        a3.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_b10ActionPerformed

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
            java.util.logging.Logger.getLogger(Sorting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sorting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sorting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sorting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sorting().setVisible(true);
            }
        });
    }

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel a1;
    private javax.swing.JLabel a2;
    private javax.swing.JLabel a3;
    private javax.swing.JTextArea ar1;
    private javax.swing.JButton b1;
    private javax.swing.JButton b10;
    private javax.swing.JButton b11;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JButton b5;
    private javax.swing.JButton b6;
    private javax.swing.JButton b7;
    private javax.swing.JButton b8;
    private javax.swing.JButton b9;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel ll1;
    private javax.swing.JLabel ll10;
    private javax.swing.JLabel ll11;
    private javax.swing.JLabel ll12;
    private javax.swing.JLabel ll13;
    private javax.swing.JLabel ll14;
    private javax.swing.JLabel ll15;
    private javax.swing.JLabel ll16;
    private javax.swing.JLabel ll17;
    private javax.swing.JLabel ll18;
    private javax.swing.JLabel ll19;
    private javax.swing.JLabel ll2;
    private javax.swing.JLabel ll20;
    private javax.swing.JLabel ll21;
    private javax.swing.JLabel ll22;
    private javax.swing.JLabel ll23;
    private javax.swing.JLabel ll24;
    private javax.swing.JLabel ll25;
    private javax.swing.JLabel ll26;
    private javax.swing.JLabel ll27;
    private javax.swing.JLabel ll28;
    private javax.swing.JLabel ll29;
    private javax.swing.JLabel ll3;
    private javax.swing.JLabel ll30;
    private javax.swing.JLabel ll4;
    private javax.swing.JLabel ll5;
    private javax.swing.JLabel ll6;
    private javax.swing.JLabel ll7;
    private javax.swing.JLabel ll8;
    private javax.swing.JLabel ll9;
    private javax.swing.JPanel p1;
    private javax.swing.JPanel p10;
    private javax.swing.JPanel p2;
    private javax.swing.JPanel p3;
    private javax.swing.JPanel p4;
    private javax.swing.JPanel p5;
    private javax.swing.JPanel p6;
    private javax.swing.JPanel p7;
    private javax.swing.JPanel p8;
    private javax.swing.JPanel p9;
    private javax.swing.JTextField tf1;
    private javax.swing.JTextField tf2;
    private javax.swing.JTextField tf3;
    // End of variables declaration//GEN-END:variables
}
