/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pos;

import com.sun.corba.se.impl.protocol.giopmsgheaders.Message;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Khean Visal
 */
public class Main extends javax.swing.JFrame {
   int bb = 0;
   int a=0;
  Dashboard dash;
  Product product = null;
    public Main() {
        initComponents();
        this.setSize(1370,850);
        this.setResizable(false);
        dash = new Dashboard();
        dash.setSize(this.jDesktopPane1.getWidth(),this.jDesktopPane1.getHeight());
        this.jDesktopPane1.add(dash).setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSpinner1 = new javax.swing.JSpinner();
        jMenu3 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenu8 = new javax.swing.JMenu();
        jMenu9 = new javax.swing.JMenu();
        jMenu10 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jDesktopPane1 = new javax.swing.JDesktopPane();

        jMenu3.setText("jMenu3");

        jMenu5.setText("jMenu5");

        jMenu8.setText("jMenu8");

        jMenu9.setText("jMenu9");

        jMenu10.setText("jMenu10");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1280, 720));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(55, 55, 55));
        jPanel1.setForeground(new java.awt.Color(102, 102, 102));

        jLabel4.setFont(new java.awt.Font("Kh Siemreap", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("POS SYSTEM");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel4)
                .addContainerGap(1206, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(45, 45, 45))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 60));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-home-25.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-sorting-25.png"))); // NOI18N
        jLabel2.setText("jLabel2");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-product-hunt-25.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-reception-25.png"))); // NOI18N
        jLabel5.setText("jLabel5");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-user-group-2-25.png"))); // NOI18N
        jLabel6.setText("jLabel6");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-sale-25.png"))); // NOI18N
        jLabel7.setText("jLabel7");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-opened-folder-25.png"))); // NOI18N
        jLabel8.setText("jLabel8");

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-back-to-25.png"))); // NOI18N
        jLabel9.setText("jLabel9");

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-next-page-25.png"))); // NOI18N
        jLabel10.setText("jLabel10");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel9)
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addComponent(jLabel10)
                .addGap(28, 28, 28)
                .addComponent(jLabel7)
                .addGap(26, 26, 26)
                .addComponent(jLabel2)
                .addGap(34, 34, 34)
                .addComponent(jLabel3)
                .addGap(28, 28, 28)
                .addComponent(jLabel5)
                .addGap(29, 29, 29)
                .addComponent(jLabel6)
                .addGap(26, 26, 26)
                .addComponent(jLabel8)
                .addContainerGap(294, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 50, 770));

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1320, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 780, Short.MAX_VALUE)
        );

        getContentPane().add(jDesktopPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 1320, 780));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
         if(dash == null){
         dash = new Dashboard();
      } 
        JInternalFrame jj[]  =  this.jDesktopPane1.getAllFrames();
        if(jj.length>0){
//            JOptionPane.showMessageDialog(null, String.valueOf(jj.length));
             for(JInternalFrame jframes : this.jDesktopPane1.getAllFrames()){
             if(jframes.equals(dash)){
                this.jDesktopPane1.moveToFront(dash);
                return;
             }
         } 
        }
          this.jDesktopPane1.add(dash).setVisible(true); 
// TODO add your handling code here:
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
           Sale sale = new Sale();
           sale.setSize(this.getWidth(),this.getHeight());
           this.jDesktopPane1.add(sale).setVisible(true);
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
      if(product == null){
          product = new Product();
      } 
        JInternalFrame jj[]  =  this.jDesktopPane1.getAllFrames();
        if(jj.length>0){
             for(JInternalFrame jframes : this.jDesktopPane1.getAllFrames()){
             if(jframes.equals(product)){
                this.jDesktopPane1.moveToFront(product);
                return;
             }
         } 
        }
          product.setSize(this.jDesktopPane1.getWidth(),this.jDesktopPane1.getHeight());
          this.jDesktopPane1.add(product).setVisible(true);  
         
    }//GEN-LAST:event_jLabel3MouseClicked

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSpinner jSpinner1;
    // End of variables declaration//GEN-END:variables
}
