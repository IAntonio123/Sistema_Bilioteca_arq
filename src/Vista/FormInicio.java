/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

/**
 *
 * @author Antonio
 */
public class FormInicio extends javax.swing.JFrame {

    /**
     * Creates new form FormInicio
     */
    public FormInicio() {
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

        jMenuItem5 = new javax.swing.JMenuItem();
        jdpContenedor = new javax.swing.JDesktopPane();
        txtusuarioName = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmRegistro = new javax.swing.JMenu();
        jmFormCliente = new javax.swing.JMenuItem();
        jmFormLibro = new javax.swing.JMenuItem();
        jmFormAutor = new javax.swing.JMenuItem();
        jmNegocio = new javax.swing.JMenu();
        jmFormVenta = new javax.swing.JMenuItem();
        jmFormPrestamo = new javax.swing.JMenuItem();
        jmListar = new javax.swing.JMenu();
        jmMostrarVentas = new javax.swing.JMenuItem();
        jmMostrarPrestamos = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();

        jMenuItem5.setText("jMenuItem5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtusuarioName.setText("asd");

        jLabel1.setText("jLabel1");

        jdpContenedor.setLayer(txtusuarioName, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdpContenedor.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jdpContenedorLayout = new javax.swing.GroupLayout(jdpContenedor);
        jdpContenedor.setLayout(jdpContenedorLayout);
        jdpContenedorLayout.setHorizontalGroup(
            jdpContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jdpContenedorLayout.createSequentialGroup()
                .addGap(243, 243, 243)
                .addGroup(jdpContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jdpContenedorLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel1))
                    .addComponent(txtusuarioName, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(635, Short.MAX_VALUE))
        );
        jdpContenedorLayout.setVerticalGroup(
            jdpContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jdpContenedorLayout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(txtusuarioName, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addContainerGap(450, Short.MAX_VALUE))
        );

        jmRegistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/registros_icon.png"))); // NOI18N
        jmRegistro.setText("Registro");

        jmFormCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/clientes_icon.png"))); // NOI18N
        jmFormCliente.setText("Cliente");
        jmRegistro.add(jmFormCliente);

        jmFormLibro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/libros_icon.png"))); // NOI18N
        jmFormLibro.setText("Libro");
        jmRegistro.add(jmFormLibro);

        jmFormAutor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/autores_icon.png"))); // NOI18N
        jmFormAutor.setText("Autor");
        jmRegistro.add(jmFormAutor);

        jMenuBar1.add(jmRegistro);

        jmNegocio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/negocio_icon.png"))); // NOI18N
        jmNegocio.setText("Negocio");

        jmFormVenta.setText("Venta");
        jmNegocio.add(jmFormVenta);

        jmFormPrestamo.setText("Prestamo");
        jmNegocio.add(jmFormPrestamo);

        jMenuBar1.add(jmNegocio);

        jmListar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/listar_icon.png"))); // NOI18N
        jmListar.setText("Listar");

        jmMostrarVentas.setText("Mostrar Ventas");
        jmListar.add(jmMostrarVentas);

        jmMostrarPrestamos.setText("Mostrar prestamos");
        jmListar.add(jmMostrarPrestamos);

        jMenuBar1.add(jmListar);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/historial_icon.png"))); // NOI18N
        jMenu4.setText("Historial");

        jMenuItem4.setText("Ventas");
        jMenu4.add(jMenuItem4);

        jMenuItem6.setText("Prestamos");
        jMenu4.add(jMenuItem6);

        jMenuItem7.setText("Libros");
        jMenu4.add(jMenuItem7);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdpContenedor)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdpContenedor, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(FormInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormInicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    public javax.swing.JDesktopPane jdpContenedor;
    public javax.swing.JMenuItem jmFormAutor;
    public javax.swing.JMenuItem jmFormCliente;
    public javax.swing.JMenuItem jmFormLibro;
    public javax.swing.JMenuItem jmFormPrestamo;
    public javax.swing.JMenuItem jmFormVenta;
    private javax.swing.JMenu jmListar;
    private javax.swing.JMenuItem jmMostrarPrestamos;
    private javax.swing.JMenuItem jmMostrarVentas;
    private javax.swing.JMenu jmNegocio;
    private javax.swing.JMenu jmRegistro;
    public javax.swing.JLabel txtusuarioName;
    // End of variables declaration//GEN-END:variables
}
