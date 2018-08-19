package ar.com.ventas.vista;
/**
 * Ventana menú principal de la aplicación
 *
 * @author Martín Manganiello
 */
public class Menu extends javax.swing.JFrame {

    public Menu() {
        initComponents();
    }
/**
 * Método generado por NetBeans, encargado de iniciar los componentes de la ventana.
 */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        toolBar = new javax.swing.JToolBar();
        btVenta = new javax.swing.JButton();
        btCompra = new javax.swing.JButton();
        btProducto = new javax.swing.JButton();
        btCliente = new javax.swing.JButton();
        btProveedor = new javax.swing.JButton();
        btSalir = new javax.swing.JButton();
        desktopPane = new javax.swing.JDesktopPane();
        menuBar = new javax.swing.JMenuBar();
        menuRegistros = new javax.swing.JMenu();
        miProducto = new javax.swing.JMenuItem();
        miCliente = new javax.swing.JMenuItem();
        miProveedor = new javax.swing.JMenuItem();
        menuMovimentos = new javax.swing.JMenu();
        miVenta = new javax.swing.JMenuItem();
        miCompra = new javax.swing.JMenuItem();
        menuSistema = new javax.swing.JMenu();
        miSobre = new javax.swing.JMenuItem();
        miSalir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Ventas");

        toolBar.setFloatable(false);

        btVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/venta.png"))); // NOI18N
        btVenta.setText("Venta");
        btVenta.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btVenta.setFocusable(false);
        btVenta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btVenta.setMargin(new java.awt.Insets(2, 12, 2, 12));
        btVenta.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/venta-ico.png"))); // NOI18N
        btVenta.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btVenta.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miVentaActionPerformed(evt);
            }
        });
        toolBar.add(btVenta);

        btCompra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/compra.png"))); // NOI18N
        btCompra.setText("Compra");
        btCompra.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btCompra.setFocusable(false);
        btCompra.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btCompra.setMargin(new java.awt.Insets(2, 12, 2, 12));
        btCompra.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/compra-ico.png"))); // NOI18N
        btCompra.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btCompra.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miCompraActionPerformed(evt);
            }
        });
        toolBar.add(btCompra);

        btProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/producto.png"))); // NOI18N
        btProducto.setText("Producto");
        btProducto.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btProducto.setFocusable(false);
        btProducto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btProducto.setMargin(new java.awt.Insets(2, 12, 2, 12));
        btProducto.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/producto-ico.png"))); // NOI18N
        btProducto.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miProductoActionPerformed(evt);
            }
        });
        toolBar.add(btProducto);

        btCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cliente.png"))); // NOI18N
        btCliente.setText("Cliente");
        btCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btCliente.setFocusable(false);
        btCliente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btCliente.setMargin(new java.awt.Insets(2, 12, 2, 12));
        btCliente.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cliente-ico.png"))); // NOI18N
        btCliente.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miClienteActionPerformed(evt);
            }
        });
        toolBar.add(btCliente);

        btProveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/proveedor.png"))); // NOI18N
        btProveedor.setText("Proveedor");
        btProveedor.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btProveedor.setFocusable(false);
        btProveedor.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btProveedor.setMargin(new java.awt.Insets(2, 12, 2, 12));
        btProveedor.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/proveedor-ico.png"))); // NOI18N
        btProveedor.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miProveedorActionPerformed(evt);
            }
        });
        toolBar.add(btProveedor);

        btSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/salir.png"))); // NOI18N
        btSalir.setText("Salir");
        btSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btSalir.setFocusable(false);
        btSalir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btSalir.setMargin(new java.awt.Insets(2, 12, 2, 12));
        btSalir.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/salir-ico.png"))); // NOI18N
        btSalir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miSalirActionPerformed(evt);
            }
        });
        toolBar.add(btSalir);

        getContentPane().add(toolBar, java.awt.BorderLayout.PAGE_START);

        desktopPane.setOpaque(false);
        getContentPane().add(desktopPane, java.awt.BorderLayout.CENTER);

        menuRegistros.setText("Registros");

        miProducto.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, 0));
        miProducto.setText("Registrar Producto");
        miProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miProductoActionPerformed(evt);
            }
        });
        menuRegistros.add(miProducto);

        miCliente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F3, 0));
        miCliente.setText("Registrar Cliente");
        miCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miClienteActionPerformed(evt);
            }
        });
        menuRegistros.add(miCliente);

        miProveedor.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, 0));
        miProveedor.setText("Registrar Proveedor");
        miProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miProveedorActionPerformed(evt);
            }
        });
        menuRegistros.add(miProveedor);

        menuBar.add(menuRegistros);

        menuMovimentos.setText("Movimientos");

        miVenta.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F5, 0));
        miVenta.setText("Registrar Venta");
        miVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miVentaActionPerformed(evt);
            }
        });
        menuMovimentos.add(miVenta);

        miCompra.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F6, 0));
        miCompra.setText("Registrar Compra");
        miCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miCompraActionPerformed(evt);
            }
        });
        menuMovimentos.add(miCompra);

        menuBar.add(menuMovimentos);

        menuSistema.setText("Sistema");

        miSobre.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        miSobre.setText("Acerca de");
        miSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miSobreActionPerformed(evt);
            }
        });
        menuSistema.add(miSobre);

        miSalir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        miSalir.setText("Salir");
        miSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miSalirActionPerformed(evt);
            }
        });
        menuSistema.add(miSalir);

        menuBar.add(menuSistema);

        setJMenuBar(menuBar);

        setSize(new java.awt.Dimension(900, 700));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void miProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miProductoActionPerformed
       RegistroProducto rp = new RegistroProducto();
       desktopPane.add(rp);
       rp.setVisible(true);
    }//GEN-LAST:event_miProductoActionPerformed

    private void miClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miClienteActionPerformed
        RegistroCliente rc = new RegistroCliente();
        desktopPane.add(rc);
        rc.setVisible(true);
    }//GEN-LAST:event_miClienteActionPerformed

    private void miProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miProveedorActionPerformed
        RegistroProveedor rp = new RegistroProveedor();
        desktopPane.add(rp);
        rp.setVisible(true);
    }//GEN-LAST:event_miProveedorActionPerformed

    private void miVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miVentaActionPerformed
        RealizarVenta rv = new RealizarVenta();
        desktopPane.add(rv);
        rv.setVisible(true);
    }//GEN-LAST:event_miVentaActionPerformed

    private void miCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miCompraActionPerformed
        RealizarCompra rc = new RealizarCompra();
        desktopPane.add(rc);
        rc.setVisible(true);
    }//GEN-LAST:event_miCompraActionPerformed

    private void miSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miSobreActionPerformed
        Sobre s = new Sobre(this, true);
        s.setVisible(true);
    }//GEN-LAST:event_miSobreActionPerformed

    private void miSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_miSalirActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCliente;
    private javax.swing.JButton btCompra;
    private javax.swing.JButton btProducto;
    private javax.swing.JButton btProveedor;
    private javax.swing.JButton btSalir;
    private javax.swing.JButton btVenta;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menuMovimentos;
    private javax.swing.JMenu menuRegistros;
    private javax.swing.JMenu menuSistema;
    private javax.swing.JMenuItem miCliente;
    private javax.swing.JMenuItem miCompra;
    private javax.swing.JMenuItem miProducto;
    private javax.swing.JMenuItem miProveedor;
    private javax.swing.JMenuItem miSalir;
    private javax.swing.JMenuItem miSobre;
    private javax.swing.JMenuItem miVenta;
    private javax.swing.JToolBar toolBar;
    // End of variables declaration//GEN-END:variables
}
