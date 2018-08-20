package ar.com.ventas.vista;

import ar.com.ventas.modelo.dao.CompraDaoImpl;
import ar.com.ventas.modelo.dao.ProductoDaoImpl;
import ar.com.ventas.modelo.entidades.Compra;
import ar.com.ventas.modelo.entidades.Itemcompra;
import ar.com.ventas.modelo.entidades.Producto;
import ar.com.ventas.modelo.entidades.Proveedor;
import ar.com.ventas.modelo.entidades.enums.Estado;
import ar.com.ventas.vista.tm.CompraTableModel;
import ar.com.ventas.vista.tm.ItemCompraTableModel;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;

public class RealizarCompra extends javax.swing.JInternalFrame {

    private Compra compra = null;
    private CompraDaoImpl compraDao = new CompraDaoImpl();

    public RealizarCompra() {
        initComponents();
        habilitarFormulario(false);
        cargarTabla();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel2 = new javax.swing.JPanel();
        pnBarraHerramientas = new javax.swing.JPanel();
        barraHerramientas = new javax.swing.JToolBar();
        btNuevo = new javax.swing.JButton();
        btGuardar = new javax.swing.JButton();
        btFinalizar = new javax.swing.JButton();
        btBorrar = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();
        tpContenido = new javax.swing.JTabbedPane();
        pnEncabezado = new javax.swing.JPanel();
        pnForm = new javax.swing.JPanel();
        lbProveedor = new javax.swing.JLabel();
        lbValorTotal = new javax.swing.JLabel();
        lbFechaCompra = new javax.swing.JLabel();
        ftfProveedor = new javax.swing.JFormattedTextField();
        btProveedor = new javax.swing.JButton();
        ftfFechaCompra = new javax.swing.JFormattedTextField();
        ftfValorTotal = new javax.swing.JTextField();
        spTabla = new javax.swing.JScrollPane();
        tbTabla = new javax.swing.JTable();
        pnItems = new javax.swing.JPanel();
        pnFormItems = new javax.swing.JPanel();
        lbProducto = new javax.swing.JLabel();
        lbValorUnitario = new javax.swing.JLabel();
        lbCantidad = new javax.swing.JLabel();
        ftfProducto = new javax.swing.JFormattedTextField();
        btProducto = new javax.swing.JButton();
        ftfValorUnitario = new javax.swing.JFormattedTextField();
        spCantidad = new javax.swing.JSpinner();
        btAgregarItem = new javax.swing.JButton();
        btRemoverItem = new javax.swing.JButton();
        spTablaItems = new javax.swing.JScrollPane();
        tbTablaItems = new javax.swing.JTable();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setClosable(true);
        setIconifiable(true);
        setTitle("Compras");

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

        btFinalizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/finalizar.png"))); // NOI18N
        btFinalizar.setText("Finalizar");
        btFinalizar.setFocusable(false);
        btFinalizar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btFinalizar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btFinalizar.setMargin(new java.awt.Insets(2, 8, 2, 8));
        btFinalizar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/finalizar-ico.png"))); // NOI18N
        btFinalizar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFinalizarActionPerformed(evt);
            }
        });
        barraHerramientas.add(btFinalizar);

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

        pnEncabezado.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 10, 10, 10));
        pnEncabezado.setLayout(new java.awt.BorderLayout());

        pnForm.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEmptyBorder(5, 0, 5, 0), javax.swing.BorderFactory.createTitledBorder(null, "Formulario", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 13), new java.awt.Color(102, 153, 255)))); // NOI18N
        pnForm.setOpaque(false);

        lbProveedor.setText("Proveedor:");

        lbValorTotal.setText("Valor Total:");

        lbFechaCompra.setText("Fecha Compra:");

        ftfProveedor.setEditable(false);
        ftfProveedor.setColumns(25);

        btProveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buscar.png"))); // NOI18N
        btProveedor.setToolTipText("Localizar cliente");
        btProveedor.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btProveedor.setPreferredSize(new java.awt.Dimension(21, 21));
        btProveedor.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buscar-ico.png"))); // NOI18N
        btProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btProveedorActionPerformed(evt);
            }
        });

        ftfFechaCompra.setEditable(false);
        ftfFechaCompra.setColumns(10);
        ftfFechaCompra.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("d/MM/yyyy"))));
        ftfFechaCompra.setValue(new Date());

        ftfValorTotal.setEditable(false);

        javax.swing.GroupLayout pnFormLayout = new javax.swing.GroupLayout(pnForm);
        pnForm.setLayout(pnFormLayout);
        pnFormLayout.setHorizontalGroup(
            pnFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnFormLayout.createSequentialGroup()
                .addGroup(pnFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnFormLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(lbProveedor)
                        .addGap(4, 4, 4)
                        .addComponent(ftfProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(btProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnFormLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(pnFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnFormLayout.createSequentialGroup()
                                .addComponent(lbValorTotal)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ftfValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnFormLayout.createSequentialGroup()
                                .addComponent(lbFechaCompra)
                                .addGap(4, 4, 4)
                                .addComponent(ftfFechaCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(7, 7, 7))
        );
        pnFormLayout.setVerticalGroup(
            pnFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnFormLayout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(pnFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnFormLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(lbProveedor))
                    .addComponent(ftfProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(pnFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnFormLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(lbFechaCompra))
                    .addComponent(ftfFechaCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(pnFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbValorTotal)
                    .addComponent(ftfValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pnEncabezado.add(pnForm, java.awt.BorderLayout.PAGE_START);

        tbTabla.setModel(new CompraTableModel());
        tbTabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbTablaMouseClicked(evt);
            }
        });
        spTabla.setViewportView(tbTabla);

        pnEncabezado.add(spTabla, java.awt.BorderLayout.CENTER);

        tpContenido.addTab("Datos de la compra", pnEncabezado);

        pnItems.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 10, 10, 10));
        pnItems.setLayout(new java.awt.BorderLayout());

        pnFormItems.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEmptyBorder(5, 0, 5, 0), javax.swing.BorderFactory.createTitledBorder(null, "Formulario", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 13), new java.awt.Color(102, 153, 255)))); // NOI18N
        pnFormItems.setOpaque(false);
        pnFormItems.setLayout(new java.awt.GridBagLayout());

        lbProducto.setText("Producto:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        pnFormItems.add(lbProducto, gridBagConstraints);

        lbValorUnitario.setText("Valor Unitario:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        pnFormItems.add(lbValorUnitario, gridBagConstraints);

        lbCantidad.setText("Cantidad:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        pnFormItems.add(lbCantidad, gridBagConstraints);

        ftfProducto.setEditable(false);
        ftfProducto.setColumns(25);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        pnFormItems.add(ftfProducto, gridBagConstraints);

        btProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buscar.png"))); // NOI18N
        btProducto.setToolTipText("Localizar produto");
        btProducto.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btProducto.setPreferredSize(new java.awt.Dimension(21, 21));
        btProducto.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buscar-ico.png"))); // NOI18N
        btProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btProductoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        pnFormItems.add(btProducto, gridBagConstraints);

        ftfValorUnitario.setColumns(10);
        ftfValorUnitario.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0.00"))));
        ftfValorUnitario.setValue(new Double(0));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        pnFormItems.add(ftfValorUnitario, gridBagConstraints);

        spCantidad.setModel(new javax.swing.SpinnerNumberModel(1, 1, 1000000, 1));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        pnFormItems.add(spCantidad, gridBagConstraints);

        btAgregarItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/nuevo.png"))); // NOI18N
        btAgregarItem.setToolTipText("Adicionar item");
        btAgregarItem.setPreferredSize(new java.awt.Dimension(35, 30));
        btAgregarItem.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/nuevo-ico.png"))); // NOI18N
        btAgregarItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAgregarItemActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        pnFormItems.add(btAgregarItem, gridBagConstraints);

        btRemoverItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/borrar.png"))); // NOI18N
        btRemoverItem.setToolTipText("Remover item");
        btRemoverItem.setPreferredSize(new java.awt.Dimension(35, 30));
        btRemoverItem.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/borrar-ico.png"))); // NOI18N
        btRemoverItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRemoverItemActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        pnFormItems.add(btRemoverItem, gridBagConstraints);

        pnItems.add(pnFormItems, java.awt.BorderLayout.PAGE_START);

        tbTablaItems.setModel(new ItemCompraTableModel());
        spTablaItems.setViewportView(tbTablaItems);

        pnItems.add(spTablaItems, java.awt.BorderLayout.CENTER);

        tpContenido.addTab("Items de la compra", pnItems);

        getContentPane().add(tpContenido, java.awt.BorderLayout.CENTER);

        setBounds(10, 10, 464, 500);
    }// </editor-fold>//GEN-END:initComponents
/**
     * Método que crea una nueva compra.
     *
     * @param evt
     */
    private void btNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNuevoActionPerformed
        compra = new Compra();
        habilitarFormulario(true);
    }//GEN-LAST:event_btNuevoActionPerformed
    /**
     * Método que guarda la compra.
     *
     * @param evt
     */
    private void btGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGuardarActionPerformed
        guardar(false);
    }//GEN-LAST:event_btGuardarActionPerformed
    /**
     * Método que cancela la compra
     *
     * @param evt
     */
    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        habilitarFormulario(false);
    }//GEN-LAST:event_btCancelarActionPerformed
    /**
     * Método que abre la ventana BuscaProveedor
     *
     * @param evt
     */
    private void btProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btProveedorActionPerformed
//        BuscaProveedor buscaProveedor = new BuscaProveedor(this);
//        buscaProveedor.setVisible(true);
        new BuscaProveedor(this).setVisible(true);
    }//GEN-LAST:event_btProveedorActionPerformed
    /**
     * Método que abre la ventana buscaProducto.
     *
     * @param evt
     */
    private void btProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btProductoActionPerformed
//        BuscaProducto buscaProducto = new BuscaProducto(this);
//        buscaProducto.setVisible(true);
        new BuscaProducto(this).setVisible(true);
    }//GEN-LAST:event_btProductoActionPerformed
/**
 * Método que agrega un item a la compra.
 * @param evt 
 */
    private void btAgregarItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAgregarItemActionPerformed
        if (validarFormularioItems()) {
            Itemcompra iv = new Itemcompra();
            iv.setCodigoProducto((Producto) ftfProducto.getValue());
            iv.setCodigoCompra(compra);
            iv.setCantidad((int) spCantidad.getValue());
            iv.setValorUnitario((double) ftfValorUnitario.getValue());
            compra.addItem(iv); //Agrega el item a la compra.

            ItemCompraTableModel ivtm = (ItemCompraTableModel) tbTablaItems.getModel();
            ivtm.setDatos(compra.getItemcompraList()); //Obtiene la lista de items de la compra, para mostrar en la tabla.

            ftfValorTotal.setText(String.valueOf(compra.getValorTotal())); //Actualiza el valor total de la compra.

            limpiarFormularioItems();
        }
    }//GEN-LAST:event_btAgregarItemActionPerformed
/**
 * Método que borra un item de la compra.
 * @param evt 
 */
    private void btRemoverItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRemoverItemActionPerformed
        if (tbTablaItems.getSelectedRowCount() > 0) {
            int registroSeleccionado = tbTablaItems.getSelectedRow();
            ItemCompraTableModel ivtm = (ItemCompraTableModel) tbTablaItems.getModel();
            Itemcompra iv = ivtm.getRowValue(registroSeleccionado);

            if (JOptionPane.showConfirmDialog(this, "Desea borrar el item " + iv + "?", "Confirmación", JOptionPane.YES_NO_OPTION) == 0) {
                compra.removeItem(iv);
                ivtm.setDatos(compra.getItemcompraList());
            }
        } else {
            JOptionPane.showMessageDialog(this, "Selecione una linea para borrar.", "Alerta", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btRemoverItemActionPerformed
/**
 * Método que selecciona una compra.
 * @param evt 
 */
    private void tbTablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbTablaMouseClicked
        if (evt.getClickCount() == 2) {
            int registroSeleccionado = tbTabla.getSelectedRow();
            CompraTableModel vtm = (CompraTableModel) tbTabla.getModel();
            compra = vtm.getRowValue(registroSeleccionado);

            if (compra.getEstado() == Estado.FINALIZADA) {
                JOptionPane.showMessageDialog(this, "Compra finalizada no puede ser modificada.", "Alerta", JOptionPane.WARNING_MESSAGE);
                return;
            }
            if (compra.getEstado() == Estado.CANCELADA) {
                JOptionPane.showMessageDialog(this, "Compra cancelada no puede ser modificada.", "Alerta", JOptionPane.WARNING_MESSAGE);
                return;
            }

            ftfProveedor.setValue(compra.getCodigoProveedor());
            ftfFechaCompra.setValue(compra.getFechaCompra());
            ftfValorTotal.setText(String.valueOf(compra.getValorTotal()));

            ItemCompraTableModel ivtm = (ItemCompraTableModel) tbTablaItems.getModel();
            ivtm.setDatos(compra.getItemcompraList());

            habilitarFormulario(true);
        }
    }//GEN-LAST:event_tbTablaMouseClicked
/**
 * Método que finaliza la compra
 * @param evt 
 */
    private void btFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFinalizarActionPerformed
        int opcion = JOptionPane.showConfirmDialog(this, "Desea finalizar la compra?");
        if (opcion == 0) {
            guardar(true);
        }
    }//GEN-LAST:event_btFinalizarActionPerformed
/**
 * Método que borra la compra.
 * @param evt 
 */
    private void btBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBorrarActionPerformed
        int opcion = JOptionPane.showConfirmDialog(this, "Desea cancelar la compra " + compra + "?");
        if (opcion == 0) {
            try {
                compraDao.remove(compra);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Error al borrar la compra.\n" + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            habilitarFormulario(false);
            cargarTabla();
        }
    }//GEN-LAST:event_btBorrarActionPerformed
/**
 * Método que settea el Proveedor
 * @param proveedor 
 */
    public void setProveedor(Proveedor proveedor) {
        ftfProveedor.setValue(proveedor);
    }
/**
 * Método que settea el Producto.
 * @param producto 
 */
    public void setProducto(Producto producto) {
        ftfProducto.setValue(producto);
        ftfValorUnitario.setValue(producto.getPrecioCompra());
    }
/**
 * Metodo que habilita el formulario o lo deshabilita.
 * @param activo 
 */
    private void habilitarFormulario(boolean activo) {
        btNuevo.setEnabled(!activo);
        btGuardar.setEnabled(activo);
        btFinalizar.setEnabled(activo);
        btBorrar.setEnabled(activo);
        btCancelar.setEnabled(activo);
        ftfProveedor.setEnabled(activo);
        btProveedor.setEnabled(activo);
        ftfFechaCompra.setEnabled(activo);
        ftfValorTotal.setEnabled(activo);
        ftfValorTotal.setEditable(false);
        ftfProducto.setEnabled(activo);
        btProducto.setEnabled(activo);
        spCantidad.setEnabled(activo);
        ftfValorUnitario.setEnabled(activo);
        btAgregarItem.setEnabled(activo);
        btRemoverItem.setEnabled(activo);
        tbTabla.setEnabled(!activo);

        if (!activo) {
            limpiarFormulario();
        }
    }
/**
 * Método que limpia el formulario de compras.
 */
    private void limpiarFormulario() {
        compra = null;
        ftfProveedor.setValue(null);
        ftfFechaCompra.setValue(new Date());
        ftfValorTotal.setText("");
        ftfProducto.setValue(null);
        spCantidad.setValue(1);
        ftfValorUnitario.setValue(new Double(0));
        tbTablaItems.setModel(new ItemCompraTableModel());
        limpiarFormularioItems();
    }
/**
 * Método que limpia el formulario de items.
 */
    private void limpiarFormularioItems() {
        ftfProducto.setValue(null);
        spCantidad.setValue(1);
        ftfValorUnitario.setValue(new Double(0));
    }
/**
 * Método que valida el formulario de compras.
 * @return 
 */
    private boolean validarFormulario() {
        if (ftfProveedor.getValue() == null) {
            JOptionPane.showMessageDialog(this, "Proveedor invalido.", "Alerta", JOptionPane.WARNING_MESSAGE);
            ftfProveedor.requestFocus();
            return false;
        }
        if (compra.getItemcompraList().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Cantidad de items incorrecto.", "Alerta", JOptionPane.WARNING_MESSAGE);
            tpContenido.setSelectedIndex(1);
            return false;
        }
        return true;
    }
/**
 * Método que valida el formulario de items.
 * @return 
 */
    private boolean validarFormularioItems() {
        if (ftfProducto.getValue() == null) {
            JOptionPane.showMessageDialog(this, "Producto invalido.", "Alerta", JOptionPane.WARNING_MESSAGE);
            ftfProducto.requestFocus();
            return false;
        }
        return true;
    }
/**
 * Método que carga la tabla de compras.
 */
    private void cargarTabla() {
        CompraTableModel tm = (CompraTableModel) tbTabla.getModel();
        try {
            tm.setDatos(compraDao.findAll());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error al cargar tabla.\n" + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
/**
 * Método que guarda una compra en la base de datos.
 * @param finalizar 
 */
    private void guardar(boolean finalizar) {
        if (validarFormulario()) {
            compra.setCodigoProveedor((Proveedor) ftfProveedor.getValue());
            compra.setFechaCompra((Date) ftfFechaCompra.getValue());
            compra.setValorTotal(Double.parseDouble(this.ftfValorTotal.getText()));

            List<Itemcompra> itemCompra = compra.getItemcompraList();

            for (Itemcompra item : itemCompra) {
                ProductoDaoImpl productoDao = new ProductoDaoImpl();
                Producto producto = item.getCodigoProducto(); //Obtengo el producto
                int stockAnterior = productoDao.find(producto.getCodigo()).getCantidadStock();
                int stockActual = stockAnterior + item.getCantidad();
                producto.setCantidadStock(stockActual);
                productoDao.edit(producto);
            }

            if (finalizar) {
                compra.setEstado(Estado.FINALIZADA);
            } else {
                compra.setEstado(Estado.ABIERTA);
            }

            if (compra.getCodigo() == null) {
                try {
                    compraDao.create(compra);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(this, "Error al insertar la compra.\n" + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
            } else {
                try {
                    compraDao.edit(compra);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(this, "Error al modificar la compra.\n" + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
            }

            habilitarFormulario(false);
            cargarTabla();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToolBar barraHerramientas;
    private javax.swing.JButton btAgregarItem;
    private javax.swing.JButton btBorrar;
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btFinalizar;
    private javax.swing.JButton btGuardar;
    private javax.swing.JButton btNuevo;
    private javax.swing.JButton btProducto;
    private javax.swing.JButton btProveedor;
    private javax.swing.JButton btRemoverItem;
    private javax.swing.JFormattedTextField ftfFechaCompra;
    private javax.swing.JFormattedTextField ftfProducto;
    private javax.swing.JFormattedTextField ftfProveedor;
    private javax.swing.JTextField ftfValorTotal;
    private javax.swing.JFormattedTextField ftfValorUnitario;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbCantidad;
    private javax.swing.JLabel lbFechaCompra;
    private javax.swing.JLabel lbProducto;
    private javax.swing.JLabel lbProveedor;
    private javax.swing.JLabel lbValorTotal;
    private javax.swing.JLabel lbValorUnitario;
    private javax.swing.JPanel pnBarraHerramientas;
    private javax.swing.JPanel pnEncabezado;
    private javax.swing.JPanel pnForm;
    private javax.swing.JPanel pnFormItems;
    private javax.swing.JPanel pnItems;
    private javax.swing.JSpinner spCantidad;
    private javax.swing.JScrollPane spTabla;
    private javax.swing.JScrollPane spTablaItems;
    private javax.swing.JTable tbTabla;
    private javax.swing.JTable tbTablaItems;
    private javax.swing.JTabbedPane tpContenido;
    // End of variables declaration//GEN-END:variables

}
