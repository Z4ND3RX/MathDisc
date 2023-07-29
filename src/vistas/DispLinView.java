/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import com.sun.awt.AWTUtilities;
import controladores.DispLinController;
import java.awt.Frame;
import java.awt.Shape;
import java.awt.geom.RoundRectangle2D;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Santiago
 */
public class DispLinView extends javax.swing.JFrame {

    /**
     * Creates new form DispLinView
     */
    public DispLinView() {
        initComponents();
        setLocationRelativeTo(this);
        Shape forma = new RoundRectangle2D.Double(0, 0, this.getBounds().width, this.getBounds().height, 20, 20);
        AWTUtilities.setWindowShape(this, forma);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        startxtxt = new javax.swing.JTextField();
        startytxt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        endxtxt = new javax.swing.JTextField();
        endytxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        returnbtn = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(243, 235, 212));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Disposición líneal", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(243, 235, 212));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Inicio", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        jPanel2.setForeground(new java.awt.Color(51, 51, 51));

        startxtxt.setBackground(new java.awt.Color(255, 255, 255));
        startxtxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                startxtxtKeyTyped(evt);
            }
        });

        startytxt.setBackground(new java.awt.Color(255, 255, 255));
        startytxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                startytxtKeyTyped(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("X");

        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Y");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(startxtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(startytxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(23, 23, 23))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(startxtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(startytxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, -1));

        jPanel3.setBackground(new java.awt.Color(243, 235, 212));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Fin", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        jPanel3.setForeground(new java.awt.Color(51, 51, 51));

        endxtxt.setBackground(new java.awt.Color(255, 255, 255));
        endxtxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                endxtxtKeyTyped(evt);
            }
        });

        endytxt.setBackground(new java.awt.Color(255, 255, 255));
        endytxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                endytxtKeyTyped(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("X");

        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Y");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(endxtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(endytxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(24, 24, 24))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(endxtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(endytxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, -1, -1));

        jButton1.setBackground(new java.awt.Color(243, 235, 212));
        jButton1.setForeground(new java.awt.Color(51, 51, 51));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnIniciar_HOME.png"))); // NOI18N
        jButton1.setText("Calcular");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnIniciarPressed_HOME.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 110, 35));

        returnbtn.setBackground(new java.awt.Color(243, 235, 212));
        returnbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnVolverDos.png"))); // NOI18N
        returnbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        returnbtn.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnVolverPressedDos.png"))); // NOI18N
        returnbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnbtnActionPerformed(evt);
            }
        });
        jPanel1.add(returnbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 18, 30, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 310, 270));

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));
        jPanel4.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel4MouseDragged(evt);
            }
        });
        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel4MousePressed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(0, 0, 0));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnMinimizar.png"))); // NOI18N
        jButton3.setToolTipText("Minimizar");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnMinimizar_Click.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnCerrar.png"))); // NOI18N
        jButton2.setToolTipText("Cerrar");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnCerrar_Click.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(258, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if (startxtxt.getText().isEmpty() || startytxt.getText().isEmpty()
                || endxtxt.getText().isEmpty() || endytxt.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debe completar los campos");
        } else {
            int startX = Integer.parseInt(startxtxt.getText());
            int startY = Integer.parseInt(startytxt.getText());

            int endX = Integer.parseInt(endxtxt.getText());
            int endY = Integer.parseInt(endytxt.getText());

            DispLinController disposicion = new DispLinController(startX, startY, endX, endY);

            List<String> disposiciones = disposicion.calcularDisposicionesLineales();

            disposicion.print(disposiciones);
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void startxtxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_startxtxtKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (c < '0' || c > '9') {
            evt.consume();
        }
    }//GEN-LAST:event_startxtxtKeyTyped

    private void startytxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_startytxtKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (c < '0' || c > '9') {
            evt.consume();
        }
    }//GEN-LAST:event_startytxtKeyTyped

    private void endxtxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_endxtxtKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (c < '0' || c > '9') {
            evt.consume();
        }
    }//GEN-LAST:event_endxtxtKeyTyped

    private void endytxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_endytxtKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (c < '0' || c > '9') {
            evt.consume();
        }
    }//GEN-LAST:event_endytxtKeyTyped

    private void returnbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnbtnActionPerformed
        // TODO add your handling code here:
        vistaMenu view = new vistaMenu();
        view.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_returnbtnActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.setState(Frame.ICONIFIED);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed
    int xx, xy;
    private void jPanel4MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        setLocation(x - xx, y - xy);
    }//GEN-LAST:event_jPanel4MouseDragged

    private void jPanel4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MousePressed
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_jPanel4MousePressed

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
            java.util.logging.Logger.getLogger(DispLinView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DispLinView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DispLinView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DispLinView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DispLinView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField endxtxt;
    private javax.swing.JTextField endytxt;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JButton returnbtn;
    private javax.swing.JTextField startxtxt;
    private javax.swing.JTextField startytxt;
    // End of variables declaration//GEN-END:variables
}
