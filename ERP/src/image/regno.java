/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package image;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author collo k
 */
public class regno extends javax.swing.JFrame {

    /**
     * Creates new form regno
     */
    public regno() {
        initComponents();
    }
    public Connection getConnection(){
    Connection con;
    try{
        Class.forName("com.mysql.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/collodb","root","collins24");
         return con;
        
        
    }catch(Exception ex){
        ex.printStackTrace();
        return null;
        
    }
}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        image = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ittxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        sttxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        fntxt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lntxt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        sntxt = new javax.swing.JTextField();
        regtxt = new javax.swing.JTextField();
        search = new javax.swing.JButton();
        sear = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(image, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(image, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
        );
        jDesktopPane1.setLayer(image, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel3.setText("intake course");

        jLabel4.setText("status");

        jLabel5.setText("STUDENT IDENTITY");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Search for sudent", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 51, 51))); // NOI18N

        jLabel6.setText("SYRNAME");

        jLabel2.setText("FIRST NAME");

        jLabel7.setText("LAST NAME");

        jLabel1.setText("enter reg/no");

        regtxt.setToolTipText("regno");
        regtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regtxtActionPerformed(evt);
            }
        });
        regtxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                regtxtKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(fntxt)
                    .addComponent(regtxt)
                    .addComponent(sntxt)
                    .addComponent(lntxt, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(regtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(fntxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(sntxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(lntxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        search.setText("search");
        search.setToolTipText("search student by regno");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        sear.setToolTipText("search student by reg no");
        sear.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searKeyReleased(evt);
            }
        });

        jLabel8.setText("search students");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(sttxt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                            .addComponent(ittxt, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(0, 229, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(sear, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                            .addComponent(jDesktopPane1)))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(search)))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(ittxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(sttxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searKeyReleased
        
        PreparedStatement pst;
        Connection con =getConnection();
        ResultSet rs;
        try{
            String sql="select * from identity where regno=?";
            pst=con.prepareStatement(sql);
            pst.setString(1 ,sear.getText());
            rs=pst.executeQuery();
            if(rs.next()){
                String add1=rs.getString("regno");
                regtxt.setText(add1);
                String add2=rs.getString("fname");
                fntxt.setText(add2);
                 String add3=rs.getString("surname");
                sntxt.setText(add3);
                String add4=rs.getString("lname");
                lntxt.setText(add4);
                 String add5=rs.getString("icourse");
                ittxt.setText(add5);
                 String add6=rs.getString("status");
                sttxt.setText(add6);
                 

                
            }
            
        }catch(Exception e){
            
            JOptionPane.showMessageDialog(null, "this stident is not in this database");
            search.setText("");
            
        }
               
       
        try{
            String sql="select * from identity where surname=?";
            pst=con.prepareStatement(sql);
            pst.setString(1 ,sear.getText());
            rs=pst.executeQuery();
            if(rs.next()){
                String add1=rs.getString("regno");
                regtxt.setText(add1);
                String add2=rs.getString("fname");
                fntxt.setText(add2);
                 String add3=rs.getString("surname");
                sntxt.setText(add3);
                String add4=rs.getString("lname");
                lntxt.setText(add4);
                 String add5=rs.getString("icourse");
                ittxt.setText(add5);
                 String add6=rs.getString("status");
                sttxt.setText(add6);
                
                
            }
            
        }catch(Exception e){
            
            JOptionPane.showMessageDialog(null, "this stident is not in this database");
            search.setText("");
            
        }
               
        
        try{
            String sql="select * from identity where lname=?";
            pst=con.prepareStatement(sql);
            pst.setString(1 ,sear.getText());
            rs=pst.executeQuery();
            if(rs.next()){
                String add1=rs.getString("regno");
                regtxt.setText(add1);
                String add2=rs.getString("fname");
                fntxt.setText(add2);
                 String add3=rs.getString("surname");
                sntxt.setText(add3);
                String add4=rs.getString("lname");
                lntxt.setText(add4);
                 String add5=rs.getString("icourse");
                ittxt.setText(add5);
                 String add6=rs.getString("status");
                sttxt.setText(add6);
                
                
            }
            
        }catch(Exception e){
            
            JOptionPane.showMessageDialog(null, "this stident is not in this database");
            search.setText("");
            
        }
                try{
            String sql="select * from identity where fname=?";
            pst=con.prepareStatement(sql);
            pst.setString(1 ,sear.getText());
            rs=pst.executeQuery();
            if(rs.next()){
                String add1=rs.getString("regno");
                regtxt.setText(add1);
                String add2=rs.getString("fname");
                fntxt.setText(add2);
                 String add3=rs.getString("surname");
                sntxt.setText(add3);
                String add4=rs.getString("lname");
                lntxt.setText(add4);
                 String add5=rs.getString("icourse");
                ittxt.setText(add5);
                 String add6=rs.getString("status");
                sttxt.setText(add6);
                
                
            }
            
        }catch(Exception e){
            
            JOptionPane.showMessageDialog(null, "this stident is not in this database");
            search.setText("");
            
        }
                try{
            String sql="select image from identity  where regno="+sear.getText();
            pst=con.prepareStatement(sql);
            rs=pst.executeQuery();
            if(rs.next()){
                byte[]imagedata=rs.getBytes("image");
                format=new ImageIcon(imagedata);
                image.setIcon(format);
                
                
            }
            
        }catch(Exception ex){
            ex.printStackTrace();
        }
   
        
    }//GEN-LAST:event_searKeyReleased

    private void regtxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_regtxtKeyReleased

    }//GEN-LAST:event_regtxtKeyReleased

    private void regtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regtxtActionPerformed
        
    }//GEN-LAST:event_regtxtActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        PreparedStatement pst;
        Connection con =getConnection();
        ResultSet rs;                
        try{
            String sql="select image from identity  where regno="+regtxt.getText();
            pst=con.prepareStatement(sql);
            rs=pst.executeQuery();
            
            if(rs.next()){
                byte[]imagedata=rs.getBytes("image");
                format=new ImageIcon(imagedata);
                image.setIcon(format);
                
                
            }
            
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "student not found");
        } 
    }//GEN-LAST:event_searchActionPerformed

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
            java.util.logging.Logger.getLogger(regno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(regno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(regno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(regno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new regno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField fntxt;
    private javax.swing.JLabel image;
    private javax.swing.JTextField ittxt;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField lntxt;
    private javax.swing.JTextField regtxt;
    private javax.swing.JTextField sear;
    private javax.swing.JButton search;
    private javax.swing.JTextField sntxt;
    private javax.swing.JTextField sttxt;
    // End of variables declaration//GEN-END:variables
private ImageIcon format =null;
String filename=null;
}
