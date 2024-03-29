/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import com.sun.awt.AWTUtilities;
import controladores.ControladorRelacionesFunciones;
import java.awt.Frame;
import java.awt.Shape;
import java.awt.geom.RoundRectangle2D;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javafx.util.Pair;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *
 * @author Z4ND3R
 */
public class VistaRelacionesFunciones extends javax.swing.JFrame {

    controladores.ControladorRelacionesFunciones controladorRF;

    /**
     * Creates new form VistaRelacionesFunciones
     */
    public VistaRelacionesFunciones() {
        initComponents();
        setLocationRelativeTo(this);
        Shape forma = new RoundRectangle2D.Double(0, 0, this.getBounds().width, this.getBounds().height, 20, 20);
        AWTUtilities.setWindowShape(this, forma);
        controladorRF = new ControladorRelacionesFunciones();
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
        txtConjuntoA = new javax.swing.JTextField();
        txtCantRelaciones = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        calcbtn = new javax.swing.JButton();
        returnbtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtConjuntoB = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(243, 235, 212));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Relaciones Funciones", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        jPanel1.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtConjuntoA.setBackground(new java.awt.Color(255, 255, 255));
        txtConjuntoA.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtConjuntoA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtConjuntoAActionPerformed(evt);
            }
        });
        txtConjuntoA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtConjuntoAKeyTyped(evt);
            }
        });
        jPanel1.add(txtConjuntoA, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 80, -1));

        txtCantRelaciones.setBackground(new java.awt.Color(255, 255, 255));
        txtCantRelaciones.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCantRelaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantRelacionesActionPerformed(evt);
            }
        });
        txtCantRelaciones.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCantRelacionesKeyTyped(evt);
            }
        });
        jPanel1.add(txtCantRelaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 80, -1));

        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Cant Relaciones:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Conjunto B");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, -1, -1));

        calcbtn.setBackground(new java.awt.Color(243, 235, 212));
        calcbtn.setForeground(new java.awt.Color(51, 51, 51));
        calcbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnIniciar_HOME.png"))); // NOI18N
        calcbtn.setText("Calcular");
        calcbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        calcbtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        calcbtn.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnIniciarPressed_HOME.png"))); // NOI18N
        calcbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcbtnActionPerformed(evt);
            }
        });
        jPanel1.add(calcbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, 110, 35));

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

        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Conjunto A");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, -1));

        txtConjuntoB.setBackground(new java.awt.Color(255, 255, 255));
        txtConjuntoB.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtConjuntoB.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtConjuntoBKeyTyped(evt);
            }
        });
        jPanel1.add(txtConjuntoB, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 80, -1));

        jLabel4.setFont(new java.awt.Font("Dialog", 2, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Puedes ingresar una cantidad X de números");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        jLabel5.setFont(new java.awt.Font("Dialog", 2, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("solo sepáralos por comas (,)");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 270, 250));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel2MouseDragged(evt);
            }
        });
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(218, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 270, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtConjuntoAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtConjuntoAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtConjuntoAActionPerformed

    private void txtConjuntoAKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtConjuntoAKeyTyped

    }//GEN-LAST:event_txtConjuntoAKeyTyped

    private void txtCantRelacionesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantRelacionesKeyTyped

    }//GEN-LAST:event_txtCantRelacionesKeyTyped
    public static void mostrarMensaje(StringBuilder mensaje) {
        JTextArea textArea = new JTextArea(mensaje.toString());

        // Agregar el JTextArea al JScrollPane.
        JScrollPane scrollPane = new JScrollPane(textArea);

        int fixedHeight = 300;
        scrollPane.setPreferredSize(
                new java.awt.Dimension(scrollPane.getPreferredSize().width, fixedHeight));
        // Mostrar el JOptionPane con el JScrollPane.
        JOptionPane.showMessageDialog(
                null,
                scrollPane,
                "Disposiciones líneales",
                JOptionPane.INFORMATION_MESSAGE
        );
    }

    private void calcbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcbtnActionPerformed

        if (txtConjuntoA.getText().isEmpty() || txtCantRelaciones.getText().isEmpty() || txtConjuntoB.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debe completar los campos");
        } else {

            String[] dominioArray = txtConjuntoA.getText().split(",");
            Set<String> dominio = new HashSet<>(Arrays.asList(dominioArray));

            String[] codominioArray = txtConjuntoB.getText().split(",");
            Set<String> codominio = new HashSet<>(Arrays.asList(codominioArray));

            int cantRelaciones = Integer.parseInt(txtCantRelaciones.getText());

            // Pedir al usuario que ingrese las relaciones
            List<Map.Entry<String, String>> relation = new ArrayList<>();
            for (int i = 0; i < cantRelaciones; i++) {
                String[] relationInput = JOptionPane.showInputDialog(this, "Ingrese la relación #" + (i + 1) + " en formato 'dominio codominio': ").split(",");
                String key = relationInput[0];
                String value = relationInput[1];
                relation.add(new AbstractMap.SimpleEntry<>(key, value));
            }
            
            controladorRF.checkFunctionType(dominio, codominio, relation);

            mostrarMensaje(controladorRF.mostrarRelaciones(dominio, codominio));

        }
        
        

    }//GEN-LAST:event_calcbtnActionPerformed

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

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        setLocation(x - xx, y - xy);
    }//GEN-LAST:event_jPanel2MouseDragged

    int xx, xy;
    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_jPanel2MousePressed

    private void txtConjuntoBKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtConjuntoBKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtConjuntoBKeyTyped

    private void txtCantRelacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantRelacionesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantRelacionesActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(VistaRelacionesFunciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(VistaRelacionesFunciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(VistaRelacionesFunciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(VistaRelacionesFunciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new VistaRelacionesFunciones().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton calcbtn;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton returnbtn;
    private javax.swing.JTextField txtCantRelaciones;
    private javax.swing.JTextField txtConjuntoA;
    private javax.swing.JTextField txtConjuntoB;
    // End of variables declaration//GEN-END:variables
}
