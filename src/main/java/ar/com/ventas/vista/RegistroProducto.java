package ar.com.ventas.vista;

import ar.com.ventas.modelo.dao.ProductoDaoImpl;
import ar.com.ventas.modelo.entidades.Producto;
import ar.com.ventas.vista.tm.ProductoTableModel;
import javax.swing.JOptionPane;
/**
 Clase que permite registrar productos.
 */
public class RegistroProducto extends javax.swing.JInternalFrame {

    private Producto producto = null;
    private ProductoDaoImpl productoDao = new ProductoDaoImpl();

    public RegistroProducto() {
        initComponents();
        habilitarFormulario(false);
        cargarTabla();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        pnBarraHerramientas = new javax.swing.JPanel();
        barraHerramientas = new javax.swing.JToolBar();
        btNuevo = new javax.swing.JButton();
        btGuardar = new javax.swing.JButton();
        btBorrar = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();
        pnContenido = new javax.swing.JPanel();
        pnForm = new javax.swing.JPanel();
        lbNombre = new javax.swing.JLabel();
        lbPrecioCompra = new javax.swing.JLabel();
        lbPrecioVenta = new javax.swing.JLabel();
        ftfNombre = new javax.swing.JFormattedTextField();
        ftfPrecioCompra = new javax.swing.JTextField();
        ftfPrecioVenta = new javax.swing.JTextField();
        spTabla = new javax.swing.JScrollPane();
        tbTabla = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setTitle("Registro de productos");

        pnBarraHerramientas.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 0, 10));
        pnBarraHerramientas.setOpaque(false);
        pnBarraHerramientas.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 0));

        barraHerramientas.setFloatable(false);

        btNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/nuevo.png"))); // NOI18N
        btNuevo.setText("Nuevo");
        btNuevo.setFocusable(false);
        btNuevo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btNuevo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btNuevo.setMargin(new java.awt.Insets(2, 8, 2, 8));
        btNuevo.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/nuevo-ico.png"))); // NOI18N
        btNuevo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNuevoActionPerformed(evt);
            }
        });
        barraHerramientas.add(btNuevo);

        btGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/guardar.png"))); // NOI18N
        btGuardar.setText("Guardar");
        btGuardar.setFocusable(false);
        btGuardar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btGuardar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btGuardar.setMargin(new java.awt.Insets(2, 8, 2, 8));
        btGuardar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/guardar-ico.png"))); // NOI18N
        btGuardar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGuardarActionPerformed(evt);
            }
        });
        barraHerramientas.add(btGuardar);

        btBorrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/borrar.png"))); // NOI18N
        btBorrar.setText("Borrar");
        btBorrar.setFocusable(false);
        btBorrar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btBorrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btBorrar.setMargin(new java.awt.Insets(2, 8, 2, 8));
        btBorrar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/borrar-ico.png"))); // NOI18N
        btBorrar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBorrarActionPerformed(evt);
            }
        });
        barraHerramientas.add(btBorrar);

        btCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cancelar.png"))); // NOI18N
        btCancelar.setText("Cancelar");
        btCancelar.setFocusable(false);
        btCancelar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btCancelar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btCancelar.setMargin(new java.awt.Insets(2, 8, 2, 8));
        btCancelar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cancelar-ico.png"))); // NOI18N
        btCancelar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });
        barraHerramientas.add(btCancelar);

        pnBarraHerramientas.add(barraHerramientas);

        getContentPane().add(pnBarraHerramientas, java.awt.BorderLayout.PAGE_START);

        pnContenido.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 10, 10, 10));
        pnContenido.setLayout(new java.awt.BorderLayout());

        pnForm.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEmptyBorder(5, 0, 5, 0), javax.swing.BorderFactory.createTitledBorder(null, "Formulario", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 13), new java.awt.Color(102, 153, 255)))); // NOI18N
        pnForm.setOpaque(false);
        pnForm.setLayout(new java.awt.GridBagLayout());

        lbNombre.setText("Nombre:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(28, 235, 0, 0);
        pnForm.add(lbNombre, gridBagConstraints);

        lbPrecioCompra.setText("Precio de compra:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(7, 180, 0, 0);
        pnForm.add(lbPrecioCompra, gridBagConstraints);

        lbPrecioVenta.setText("Precio de venta:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(7, 192, 0, 0);
        pnForm.add(lbPrecioVenta, gridBagConstraints);

        ftfNombre.setColumns(25);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 275;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(25, 4, 0, 102);
        pnForm.add(ftfNombre, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 109;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(4, 5, 0, 0);
        pnForm.add(ftfPrecioCompra, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 109;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(4, 5, 15, 0);
        pnForm.add(ftfPrecioVenta, gridBagConstraints);

        pnContenido.add(pnForm, java.awt.BorderLayout.PAGE_START);

        tbTabla.setAutoCreateRowSorter(true);
        tbTabla.setModel(new ProductoTableModel());
        tbTabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbTablaMouseClicked(evt);
            }
        });
        spTabla.setViewportView(tbTabla);

        pnContenido.add(spTabla, java.awt.BorderLayout.CENTER);

        getContentPane().add(pnContenido, java.awt.BorderLayout.CENTER);

        setBounds(10, 10, 526, 450);
    }// </editor-fold>//GEN-END:initComponents
/**
 * Método encargado de crear un nuevo producto.
 * @param evt 
 */
    private void btNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNuevoActionPerformed
        producto = new Producto();
        habilitarFormulario(true);
        btBorrar.setEnabled(false);
    }//GEN-LAST:event_btNuevoActionPerformed
/**
 * Método que guarda el producto en la base de datos.
 * @param evt 
 */
    private void btGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGuardarActionPerformed
        if (validarFormulario()) {
            producto.setNombre(ftfNombre.getText().trim());
            producto.setPrecioCompra(Double.parseDouble(ftfPrecioCompra.getText()));
            producto.setPrecioVenta(Double.parseDouble(ftfPrecioVenta.getText()));

            if (producto.getCodigo() == null) {
                try {
                    productoDao.create(producto);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(this, "Error al insertar el producto.\n" + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
            } else {
                try {
                    productoDao.edit(producto);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(this, "Error al modificar el producto.\n" + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
            }
            habilitarFormulario(false);
            cargarTabla();
        }
    }//GEN-LAST:event_btGuardarActionPerformed
/**
 * Método que borra el producto de la base de datos.
 * @param evt 
 */
    private void btBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBorrarActionPerformed
        int opcion = JOptionPane.showConfirmDialog(this, "Desea borrar el producto " + producto + "?");
        if (opcion == 0) {
            try {
                productoDao.remove(producto);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Error al borrar el producto.\n" + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            habilitarFormulario(false);
            cargarTabla();
        }
    }//GEN-LAST:event_btBorrarActionPerformed
/**
 * Método que cancela la selección del producto.
 * @param evt 
 */
    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        habilitarFormulario(false);
    }//GEN-LAST:event_btCancelarActionPerformed
/**
 * Método que selecciona el producto desde la tabla de productos.
 * @param evt 
 */
    private void tbTablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbTablaMouseClicked
        if (evt.getClickCount() == 2) {
            ProductoTableModel tm = (ProductoTableModel) tbTabla.getModel();
            producto = tm.getRowValue(tbTabla.getRowSorter().convertRowIndexToModel(tbTabla.getSelectedRow()));

            ftfNombre.setValue(producto.getNombre());
            ftfPrecioCompra.setText(String.valueOf(producto.getPrecioCompra()));
            ftfPrecioVenta.setText(String.valueOf(producto.getPrecioVenta()));

            habilitarFormulario(true);
        }
    }//GEN-LAST:event_tbTablaMouseClicked
/**
 * Habilita o deshabilita el formulario.
 * @param activo 
 */
    private void habilitarFormulario(boolean activo) {
        btNuevo.setEnabled(!activo);
        btGuardar.setEnabled(activo);
        btBorrar.setEnabled(activo);
        btCancelar.setEnabled(activo);
        ftfNombre.setEnabled(activo);
        ftfPrecioCompra.setEnabled(activo);
        ftfPrecioVenta.setEnabled(activo);
        tbTabla.setEnabled(!activo);

        if (!activo) {
            limpiarFormulario();
        }
    }
/**
 * Limpia el formulario
 */
    private void limpiarFormulario() {
        producto = null;
        ftfNombre.setValue("");
        ftfPrecioCompra.setText("");
        ftfPrecioVenta.setText("");
    }
/**
 * Valida que los datos ingresados sean los correctos.
 * @return devuelve true si son correctos o false si hubo algún error.
 */
    private boolean validarFormulario() {
        if (ftfNombre.getText().trim().length() < 2) {
            JOptionPane.showMessageDialog(this, "Nombre invalido.", "Alerta", JOptionPane.WARNING_MESSAGE);
            ftfNombre.requestFocus();
            return false;
        }
        if (Double.parseDouble(ftfPrecioCompra.getText()) <= 0) {
            JOptionPane.showMessageDialog(this, "Precio de compra invalido.", "Alerta", JOptionPane.WARNING_MESSAGE);
            ftfPrecioCompra.requestFocus();
            return false;
        }
        if ((Double.parseDouble(ftfPrecioVenta.getText())) <= 0) {
            JOptionPane.showMessageDialog(this, "Precio de venta invalido.", "Alerta", JOptionPane.WARNING_MESSAGE);
            ftfPrecioVenta.requestFocus();
            return false;
        }
        if ((Double.parseDouble(ftfPrecioVenta.getText())) <= (Double.parseDouble(ftfPrecioCompra.getText()))) {
            JOptionPane.showMessageDialog(this, "Precio de venta menor que precio de compra.", "Alerta", JOptionPane.WARNING_MESSAGE);
            ftfPrecioVenta.requestFocus();
            return false;
        }
        return true;
    }
/**
 * Carga la tabla de productos.
 */
    private void cargarTabla() {
        ProductoTableModel tm = (ProductoTableModel) tbTabla.getModel();
        try {
            tm.setDatos(productoDao.findAll());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error al cargar tabla.\n" + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToolBar barraHerramientas;
    private javax.swing.JButton btBorrar;
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btGuardar;
    private javax.swing.JButton btNuevo;
    private javax.swing.JFormattedTextField ftfNombre;
    private javax.swing.JTextField ftfPrecioCompra;
    private javax.swing.JTextField ftfPrecioVenta;
    private javax.swing.JLabel lbNombre;
    private javax.swing.JLabel lbPrecioCompra;
    private javax.swing.JLabel lbPrecioVenta;
    private javax.swing.JPanel pnBarraHerramientas;
    private javax.swing.JPanel pnContenido;
    private javax.swing.JPanel pnForm;
    private javax.swing.JScrollPane spTabla;
    private javax.swing.JTable tbTabla;
    // End of variables declaration//GEN-END:variables
}
