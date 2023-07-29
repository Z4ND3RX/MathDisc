/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import controladores.ControladorConjuntos;
import excepciones.NoSubconjuntosException;
import excepciones.NoUniversalException;
import excepciones.SubconjuntosSinRellenar;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.SwingConstants;

/**
 *
 * @author Z4ND3R
 */
public class vistaTeoriaConjuntos extends javax.swing.JFrame {

    //Return, Add and Remove TextFields
    private JButton returnX;
    private JButton addButton;
    private JButton removeButton;

    //Process Buttons
    private JButton subconjuntoPropio;
    private JButton subconjuntosButton;
    private JButton potencia;
    private JButton complemento;
    private JButton complementoRelativo;
    private JButton union;
    private JButton interseccion;
    private JButton diferenciaSimetrica;

    private ArrayList<JTextField> txtFields;
    private JPanel textFieldPanel;
    JTextField newTextField;

    //Controladores
    private controladores.ControladorConjuntos controladorConjuntos;

    /**
     * Creates new form vistaTeoriaConjuntos
     */
    public vistaTeoriaConjuntos() {
        initComponents();
        // Centrar la ventana en relación con otro componente o ventana (this en este caso)
        setLocationRelativeTo(this);
        // Obtener la altura de la ventana
        int windowHeight = getHeight();
        // Desplazar la ventana 100 píxeles hacia arriba desde su posición central
        int desiredY = getLocation().y - 100;
        // Establecer la nueva posición de la ventana
        setLocation(getLocation().x, desiredY);

        controladorConjuntos = new ControladorConjuntos();
        txtFields = new ArrayList<JTextField>();

        // Configurar JFrame
        setTitle("Teoría de Conjuntos");
        setSize(700, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        Color color = Color.decode("#F3EBD4"); // Código hexadecimal del color de fondo
        getContentPane().setBackground(color);

        //Botón volver y Título
        returnX = new JButton("Volver al menú principal");
        returnX.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        JPanel panelWR = new JPanel(new GridLayout(0, 2));
        panelWR.setBackground(color);
        JLabel bienvenida = new JLabel("Bienvenido a la sección de conjuntos", SwingConstants.CENTER);

        //Logo app
        JLabel logo = new JLabel("", SwingConstants.CENTER);
        ImageIcon imageIcon = new ImageIcon(getClass().getResource("/imagenes/logo.png"));
        Image image = imageIcon.getImage();
        Image imagenRedimensionada = image.getScaledInstance(80, 40, Image.SCALE_SMOOTH);
        logo.setIcon(new ImageIcon(imagenRedimensionada));

        panelWR.add(returnX);
        panelWR.add(logo);

        // Conjunto universal
        JLabel universal = new JLabel("Conjunto Universal: ", SwingConstants.LEFT);
        newTextField = new JTextField(20);
        JLabel subconjuntos = new JLabel("Subconjuntos: ", SwingConstants.LEFT);
        JLabel subconjuntosInfo = new JLabel("Tenga en cuenta que debe ingresar los elementos del conjunto"
                + "\n separados por comas : ", SwingConstants.LEFT);

        // crear botones 
        addButton = new JButton("Add");
        addButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        removeButton = new JButton("Remove");
        removeButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        textFieldPanel = new JPanel();
        textFieldPanel.setLayout(new GridLayout(0, 2));

        // Agregar los botones al JFrame
        JPanel buttonPanel = new JPanel(new GridLayout(0, 1));
        buttonPanel.setBackground(color);
        buttonPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        buttonPanel.add(panelWR);
        buttonPanel.add(bienvenida);
        buttonPanel.add(universal);
        buttonPanel.add(newTextField);
        buttonPanel.add(subconjuntos);
        buttonPanel.add(subconjuntosInfo);
        JPanel buttonsAddRem = new JPanel(new GridLayout(0, 2));
        buttonsAddRem.setBackground(color);
        buttonsAddRem.add(addButton);
        buttonsAddRem.add(removeButton);
        buttonPanel.add(buttonsAddRem);

        //botones funcionales final (Procesos)
        JPanel endPanel = new JPanel(new GridLayout(0, 4));
        endPanel.setBackground(color);
        endPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        subconjuntoPropio = new JButton("Subconjuntos Propios");
        subconjuntoPropio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        subconjuntosButton = new JButton("Subconjuntos");
        subconjuntosButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        potencia = new JButton("Conjuntos Potencia");
        potencia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        complemento = new JButton("Complementos");
        complemento.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        complementoRelativo = new JButton("Complementos Relativos");
        complementoRelativo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        union = new JButton("Uniones");
        union.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        interseccion = new JButton("Intersecciones");
        interseccion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        diferenciaSimetrica = new JButton("Diferencias Simétricas");
        diferenciaSimetrica.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        //Añadir botones funcionales al panel inferior (Procesos)
        endPanel.add(subconjuntosButton);
        endPanel.add(subconjuntoPropio);
        endPanel.add(potencia);
        endPanel.add(complemento);
        endPanel.add(complementoRelativo);
        endPanel.add(union);
        endPanel.add(interseccion);
        endPanel.add(diferenciaSimetrica);

        add(buttonPanel, BorderLayout.NORTH);
        add(new JScrollPane(textFieldPanel), BorderLayout.CENTER);
        add(endPanel, BorderLayout.SOUTH);

        // Agregar ActionListener al botón "ReturnX"
        returnX.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vistaMenu vistaM = new vistaMenu();
                vistaM.setVisible(true);
                dispose();
            }
        });

        // Agregar ActionListener al botón "Add"
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                agregarTextField();
            }
        });

        // Agregar ActionListener al botón "Eliminar TextField"
        removeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                removeTextField();
            }
        });

        //Agregar ActionListener al botón "subConjuntoPropio"
        subconjuntoPropio.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                try {
                    controladorConjuntos.obtenerSubconjuntosPropios(obtenerSubConjuntos());
                } catch (NoSubconjuntosException | NoUniversalException | SubconjuntosSinRellenar ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }
            }
        });

        //Agregar ActionListener al botón "Subconjuntos"
        subconjuntosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                try {
                    controladorConjuntos.obtenerSubconjuntos(obtenerSubConjuntos());
                } catch (NoSubconjuntosException | NoUniversalException | SubconjuntosSinRellenar ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }
            }
        });

        //Agregar ActionListener al botón "potencia"
        potencia.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                try {
                    controladorConjuntos.conjuntoPotencia(obtenerSubConjuntos());
                } catch (NoSubconjuntosException | NoUniversalException | SubconjuntosSinRellenar ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }
            }
        });

        //Agregar ActionListener al botón "complemento"
        complemento.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                try {
                    controladorConjuntos.complementoUniversal(obtenerSubConjuntos(), obtenerConjuntoUniversal());
                } catch (NoSubconjuntosException | NoUniversalException | SubconjuntosSinRellenar ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }
            }
        });

        //Agregar ActionListener al botón "complementoRelativo"
        complementoRelativo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                try {
                    controladorConjuntos.complementoRelativoTotal(obtenerSubConjuntos());
                } catch (NoSubconjuntosException | NoUniversalException | SubconjuntosSinRellenar ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }
            }
        });

        //Agregar ActionListener al botón "union"
        union.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                try {
                    controladorConjuntos.unionTotal(obtenerSubConjuntos());
                } catch (NoSubconjuntosException | NoUniversalException | SubconjuntosSinRellenar ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }
            }
        });

        //Agregar ActionListener al botón "interseccion"
        interseccion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                try {
                    controladorConjuntos.interseccionTotal(obtenerSubConjuntos());
                } catch (NoSubconjuntosException | NoUniversalException | SubconjuntosSinRellenar ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }
            }
        });

        //Agregar ActionListener al botón "diferenciaSimetrica"
        diferenciaSimetrica.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                try {
                    controladorConjuntos.diferenciaSimetricaTotal(obtenerSubConjuntos());
                } catch (NoSubconjuntosException | NoUniversalException | SubconjuntosSinRellenar ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }
            }
        });
    }

    private void agregarTextField() {
        // Crear y agregar un nuevo campo textField al panel
        JTextField newTextField = new JTextField(20);
        txtFields.add(newTextField);
        textFieldPanel.add(newTextField);

        // Actualizar la vista
        textFieldPanel.revalidate();
        textFieldPanel.repaint();
    }

    private void removeTextField() {
        // Verificar si hay textFields para eliminar
        if (!txtFields.isEmpty()) {
            // Eliminar el último campo textField del panel y de la lista
            JTextField lastTextField = txtFields.remove(txtFields.size() - 1);
            textFieldPanel.remove(lastTextField);

            // Actualizar la vista
            textFieldPanel.revalidate();
            textFieldPanel.repaint();
        }
    }

    private Set<Character> obtenerConjuntoUniversal() {
        Set<Character> conjuntoUniversal = new HashSet<>();
        if (!newTextField.getText().isEmpty()) {
            String[] elementosUniversal = newTextField.getText().split(",");
            for (String element : elementosUniversal) {
                if (!element.isEmpty()) {
                    conjuntoUniversal.add(element.charAt(0));
                }
            }
            System.out.println(conjuntoUniversal);

        } else {
            throw new NoUniversalException();
        }
        return conjuntoUniversal;
    }

    private List<Set<Character>> obtenerSubConjuntos() {
        List<Set<Character>> conjuntos = new ArrayList<>();
        if (!txtFields.isEmpty()) {
            for (JTextField textField : txtFields) {
                if (!textField.getText().isEmpty()) {
                    String[] elementosConjunto = textField.getText().split(",");
                    Set<Character> conjunto = new HashSet<>();
                    for (String element : elementosConjunto) {
                        if (!element.isEmpty()) {
                            conjunto.add(element.charAt(0));
                        }
                    }
                    conjuntos.add(conjunto);
                } else {
                    throw new SubconjuntosSinRellenar();
                }
            }
            for (Set<Character> conjunto : conjuntos) {
                System.out.println("Conjunto " + conjunto);
            }

        } else {
            throw new NoSubconjuntosException();
        }
        return conjuntos;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 567, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 404, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    int xx, xy;

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
//            java.util.logging.Logger.getLogger(vistaTeoriaConjuntos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(vistaTeoriaConjuntos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(vistaTeoriaConjuntos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(vistaTeoriaConjuntos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new vistaTeoriaConjuntos().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
