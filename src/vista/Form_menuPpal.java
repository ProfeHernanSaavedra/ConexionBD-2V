/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

/**
 *
 * @author USRVI-LC2
 */
public class Form_menuPpal extends javax.swing.JFrame {

    /**
     * Creates new form Form_menuPpal
     */
    public Form_menuPpal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jmi_ingresarCarrera = new javax.swing.JMenuItem();
        jmi_listarCarrera = new javax.swing.JMenuItem();
        jmi_eliminar = new javax.swing.JMenuItem();
        jmi_actualizarCarrera = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jmi_salir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu1.setText("Archivo");

        jMenu3.setText("Carrera");

        jmi_ingresarCarrera.setText("Ingresar Carrera");
        jmi_ingresarCarrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_ingresarCarreraActionPerformed(evt);
            }
        });
        jMenu3.add(jmi_ingresarCarrera);

        jmi_listarCarrera.setText("Listar Carrera");
        jmi_listarCarrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_listarCarreraActionPerformed(evt);
            }
        });
        jMenu3.add(jmi_listarCarrera);

        jmi_eliminar.setText("Eliminar Carrera");
        jmi_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_eliminarActionPerformed(evt);
            }
        });
        jMenu3.add(jmi_eliminar);

        jmi_actualizarCarrera.setText("Actualizar Carrera");
        jmi_actualizarCarrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_actualizarCarreraActionPerformed(evt);
            }
        });
        jMenu3.add(jmi_actualizarCarrera);

        jMenu1.add(jMenu3);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Salir");

        jmi_salir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jmi_salir.setText("Salir - ");
        jmi_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_salirActionPerformed(evt);
            }
        });
        jMenu2.add(jmi_salir);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 592, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 371, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmi_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_salirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jmi_salirActionPerformed

    private void jmi_ingresarCarreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_ingresarCarreraActionPerformed

        Form_ingresarCarrera fic = new Form_ingresarCarrera();
        fic.setVisible(true);
    }//GEN-LAST:event_jmi_ingresarCarreraActionPerformed

    private void jmi_listarCarreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_listarCarreraActionPerformed
        Form_listarCarrera flc = new Form_listarCarrera();
        flc.setVisible(true);
    }//GEN-LAST:event_jmi_listarCarreraActionPerformed

    private void jmi_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_eliminarActionPerformed

        Form_eliminarCarrera fec = new Form_eliminarCarrera();
        fec.setVisible(true);
    }//GEN-LAST:event_jmi_eliminarActionPerformed

    private void jmi_actualizarCarreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_actualizarCarreraActionPerformed
        Form_actualizarCarrera fac = new Form_actualizarCarrera();
        fac.setVisible(true);
    }//GEN-LAST:event_jmi_actualizarCarreraActionPerformed

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
            java.util.logging.Logger.getLogger(Form_menuPpal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form_menuPpal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form_menuPpal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form_menuPpal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form_menuPpal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jmi_actualizarCarrera;
    private javax.swing.JMenuItem jmi_eliminar;
    private javax.swing.JMenuItem jmi_ingresarCarrera;
    private javax.swing.JMenuItem jmi_listarCarrera;
    private javax.swing.JMenuItem jmi_salir;
    // End of variables declaration//GEN-END:variables
}
