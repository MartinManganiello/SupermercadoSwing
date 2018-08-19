package ar.com.ventas.vista;

import ar.com.ventas.modelo.dao.ProductoDaoImpl;
import ar.com.ventas.modelo.dao.VentaDaoImpl;
import ar.com.ventas.modelo.entidades.Cliente;
import ar.com.ventas.modelo.entidades.Itemventa;
import ar.com.ventas.modelo.entidades.Producto;
import ar.com.ventas.modelo.entidades.Venta;
import ar.com.ventas.modelo.entidades.enums.Estado;
import ar.com.ventas.vista.tm.ItemVentaTableModel;
import ar.com.ventas.vista.tm.VentaTableModel;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;

/**
 * Ventana para realizar venta
 *
 * @author Martín Manganiello
 */
public class RealizarVenta extends javax.swing.JInternalFrame {

    private Venta venta = null;
    private VentaDaoImpl ventaDao = new VentaDaoImpl();

    public RealizarVenta() {
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
        lbCliente = new javax.swing.JLabel();
        lbValorTotal = new javax.swing.JLabel();
        lbFechaVenta = new javax.swing.JLabel();
        ftfCliente = new javax.swing.JFormattedTextField();
        btCliente = new javax.swing.JButton();
        ftfFechaVenta = new javax.swing.JFormattedTextField();
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
        setTitle("Ventas");
        setToolTipText("");

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

        lbCliente.setText("Cliente:");

        lbValorTotal.setText("Valor Total:");

        lbFechaVenta.setText("Fecha Venta:");

        ftfCliente.setEditable(false);
        ftfCliente.setColumns(25);

        btCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buscar.png"))); // NOI18N
        btCliente.setToolTipText("Localizar cliente");
        btCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btCliente.setPreferredSize(new java.awt.Dimension(21, 21));
        btCliente.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buscar-ico.png"))); // NOI18N
        btCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btClienteActionPerformed(evt);
            }
        });

        ftfFechaVenta.setEditable(false);
        ftfFechaVenta.setColumns(10);
        ftfFechaVenta.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("d/MM/yyyy"))));
        ftfFechaVenta.setValue(new Date());

        javax.swing.GroupLayout pnFormLayout = new javax.swing.GroupLayout(pnForm);
        pnForm.setLayout(pnFormLayout);
        pnFormLayout.setHorizontalGroup(
            pnFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnFormLayout.createSequentialGroup()
                .addGroup(pnFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnFormLayout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(lbCliente)
                        .addGap(4, 4, 4)
                        .addComponent(ftfCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(btCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnFormLayout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addGroup(pnFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnFormLayout.createSequentialGroup()
                                .addComponent(lbValorTotal)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ftfValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnFormLayout.createSequentialGroup()
                                .addComponent(lbFechaVenta)
                                .addGap(4, 4, 4)
                                .addComponent(ftfFechaVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(145, 145, 145))
        );
        pnFormLayout.setVerticalGroup(
            pnFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnFormLayout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(pnFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnFormLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(lbCliente))
                    .addComponent(ftfCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(pnFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnFormLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(lbFechaVenta))
                    .addComponent(ftfFechaVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(pnFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbValorTotal)
                    .addComponent(ftfValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pnEncabezado.add(pnForm, java.awt.BorderLayout.PAGE_START);

        tbTabla.setModel(new VentaTableModel());
        tbTabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbTablaMouseClicked(evt);
            }
        });
        spTabla.setViewportView(tbTabla);

        pnEncabezado.add(spTabla, java.awt.BorderLayout.CENTER);

        tpContenido.addTab("Datos de la venta", pnEncabezado);

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
        ftfValorUnitario.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
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

        tbTablaItems.setModel(new ItemVentaTableModel());
        spTablaItems.setViewportView(tbTablaItems);

        pnItems.add(spTablaItems, java.awt.BorderLayout.CENTER);

        tpContenido.addTab("Items de la venta", pnItems);

        getContentPane().add(tpContenido, java.awt.BorderLayout.CENTER);

        setBounds(10, 10, 659, 500);
    }// </editor-fold>//GEN-END:initComponents

    private void btNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNuevoActionPerformed
        venta = new Venta();
        habilitarFormulario(true);
    }//GEN-LAST:event_btNuevoActionPerformed

    private void btGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGuardarActionPerformed
        guardar(false);
    }//GEN-LAST:event_btGuardarActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        habilitarFormulario(false);
    }//GEN-LAST:event_btCancelarActionPerformed

    private void btClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btClienteActionPerformed
        BuscaCliente buscaCliente = new BuscaCliente(this);
        buscaCliente.setVisible(true);
    }//GEN-LAST:event_btClienteActionPerformed

    private void btProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btProductoActionPerformed
        BuscaProducto buscaProducto = new BuscaProducto(this);
        buscaProducto.setVisible(true);
    }//GEN-LAST:event_btProductoActionPerformed

    private void btAgregarItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAgregarItemActionPerformed
        if (validarFormularioItems()) {
            Itemventa iv = new Itemventa();
            iv.setCodigoProducto((Producto) ftfProducto.getValue());
            iv.setCodigoVenta(venta);
            iv.setCantidad((int) spCantidad.getValue());
            iv.setValorUnitario((Double) ftfValorUnitario.getValue());
            venta.addItem(iv);

            ItemVentaTableModel ivtm = (ItemVentaTableModel) tbTablaItems.getModel();
            ivtm.setDatos(venta.getItemventaList());

            ftfValorTotal.setText(String.valueOf(venta.getValorTotal()));

            limpiarFormularioItems();
        }
    }//GEN-LAST:event_btAgregarItemActionPerformed

    private void btRemoverItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRemoverItemActionPerformed
        if (tbTablaItems.getSelectedRowCount() > 0) {
            int registroSeleccionado = tbTablaItems.getSelectedRow();
            ItemVentaTableModel ivtm = (ItemVentaTableModel) tbTablaItems.getModel();
            Itemventa iv = ivtm.getRowValue(registroSeleccionado);

            if (JOptionPane.showConfirmDialog(this, "Desea borrar el item " + iv + "?", "Confirmación", JOptionPane.YES_NO_OPTION) == 0) {
                venta.removeItem(iv);
                ivtm.setDatos(venta.getItemventaList());
            }
        } else {
            JOptionPane.showMessageDialog(this, "Selecione una linea para borrar.", "Alerta", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btRemoverItemActionPerformed

    private void tbTablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbTablaMouseClicked
        if (evt.getClickCount() == 2) {
            int registroSeleccionado = tbTabla.getSelectedRow();
            VentaTableModel vtm = (VentaTableModel) tbTabla.getModel();
            venta = vtm.getRowValue(registroSeleccionado);

            if (venta.getEstado() == Estado.FINALIZADA) {
                JOptionPane.showMessageDialog(this, "Venta finalizada no puede ser modificada.", "Alerta", JOptionPane.WARNING_MESSAGE);
                return;
            }
            if (venta.getEstado() == Estado.CANCELADA) {
                JOptionPane.showMessageDialog(this, "Venta cancelada no puede ser modificada.", "Alerta", JOptionPane.WARNING_MESSAGE);
                return;
            }

            ftfCliente.setValue(venta.getCodigoCliente());
            ftfFechaVenta.setValue(venta.getFechaVenta());
            ftfValorTotal.setText(String.valueOf(venta.getValorTotal()));

            ItemVentaTableModel ivtm = (ItemVentaTableModel) tbTablaItems.getModel();
            ivtm.setDatos(venta.getItemventaList());

            habilitarFormulario(true);
        }
    }//GEN-LAST:event_tbTablaMouseClicked

    private void btFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFinalizarActionPerformed
        int opcion = JOptionPane.showConfirmDialog(this, "Desea finalizar la venta?");
        if (opcion == 0) {
            ProductoDaoImpl productoDao = new ProductoDaoImpl();
            for (Itemventa iv : venta.getItemventaList()) {
                try {
                    if (iv.getCantidad() > productoDao.find(iv.getCodigoProducto().getCodigo()).getCantidadStock()) {
                        JOptionPane.showMessageDialog(this, "Imposible finalizar.\nProducto " + iv.getCodigoProducto() + " no hay en stock.", "Alerta", JOptionPane.WARNING_MESSAGE);
                        return;
                    }
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(this, "Error al consultar el stock.", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
            }
            guardar(true);
        }
    }//GEN-LAST:event_btFinalizarActionPerformed

    private void btBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBorrarActionPerformed
        int opcion = JOptionPane.showConfirmDialog(this, "¿Desea cancelar la venta?");
        if (opcion == 0) {
            try {
                ventaDao.remove(venta);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Error al borrar la venta.\n" + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            habilitarFormulario(false);
            cargarTabla();
        }
    }//GEN-LAST:event_btBorrarActionPerformed

    public void setCliente(Cliente cliente) {
        ftfCliente.setValue(cliente);
    }

    public void setProducto(Producto producto) {
        ftfProducto.setValue(producto);
        ftfValorUnitario.setValue(producto.getPrecioVenta());
    }

    private void habilitarFormulario(boolean activo) {
        btNuevo.setEnabled(!activo);
        btGuardar.setEnabled(activo);
        btFinalizar.setEnabled(activo);
        btBorrar.setEnabled(activo);
        btCancelar.setEnabled(activo);
        ftfCliente.setEnabled(activo);
        btCliente.setEnabled(activo);
        ftfFechaVenta.setEnabled(activo);
        ftfValorTotal.setEnabled(activo);
        ftfValorTotal.setEditable(!activo);
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

    private void limpiarFormulario() {
        venta = null;
        ftfCliente.setValue(null);
        ftfFechaVenta.setValue(new Date());
        ftfValorTotal.setText("");
        ftfProducto.setValue(null);
        spCantidad.setValue(1);
        ftfValorUnitario.setValue(new Double(0));
        tbTablaItems.setModel(new ItemVentaTableModel());
        limpiarFormularioItems();
    }

    private void limpiarFormularioItems() {
        ftfProducto.setValue(null);
        spCantidad.setValue(1);
        ftfValorUnitario.setValue(new Double(0));
    }

    private boolean validarFormulario() {
        if (ftfCliente.getValue() == null) {
            JOptionPane.showMessageDialog(this, "Cliente invalido.", "Alerta", JOptionPane.WARNING_MESSAGE);
            ftfCliente.requestFocus();
            return false;
        }
        if (venta.getItemventaList().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Cantidad de items incorrecta.", "Alerta", JOptionPane.WARNING_MESSAGE);
            tpContenido.setSelectedIndex(1);
            return false;
        }
        return true;
    }

    private boolean validarFormularioItems() {
        if (ftfProducto.getValue() == null) {
            JOptionPane.showMessageDialog(this, "Producto invalido.", "Alerta", JOptionPane.WARNING_MESSAGE);
            ftfProducto.requestFocus();
            return false;
        }
        return true;
    }

    private void cargarTabla() {
        VentaTableModel tm = (VentaTableModel) tbTabla.getModel();
        try {
            tm.setDatos(ventaDao.findAll());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error al cargar tabla.\n" + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void guardar(boolean finalizar) {
        if (validarFormulario()) {
            venta.setCodigoCliente((Cliente) ftfCliente.getValue());
            venta.setFechaVenta((Date) ftfFechaVenta.getValue());
            venta.setValorTotal(Double.parseDouble(this.ftfValorTotal.getText()));

            List<Itemventa> itemventa = venta.getItemventaList();
            for (Itemventa item : itemventa) {
                ProductoDaoImpl productoDao = new ProductoDaoImpl();
                Producto producto = item.getCodigoProducto(); //Obtengo el producto
                int stockAnterior = productoDao.find(producto.getCodigo()).getCantidadStock();
                int stockActual = stockAnterior - item.getCantidad();
                producto.setCantidadStock(stockActual);
                productoDao.edit(producto);
            }
            
            if (finalizar) {
                venta.setEstado(Estado.FINALIZADA);
            } else {
                venta.setEstado(Estado.ABIERTA);
            }

            if (venta.getCodigo() == null) {
                try {
                    ventaDao.create(venta);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(this, "Error al insertar la venta.\n" + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
            } else {
                try {
                    ventaDao.edit(venta);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(this, "Error al modificar la venta.\n" + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
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
    private javax.swing.JButton btCliente;
    private javax.swing.JButton btFinalizar;
    private javax.swing.JButton btGuardar;
    private javax.swing.JButton btNuevo;
    private javax.swing.JButton btProducto;
    private javax.swing.JButton btRemoverItem;
    private javax.swing.JFormattedTextField ftfCliente;
    private javax.swing.JFormattedTextField ftfFechaVenta;
    private javax.swing.JFormattedTextField ftfProducto;
    private javax.swing.JTextField ftfValorTotal;
    private javax.swing.JFormattedTextField ftfValorUnitario;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbCantidad;
    private javax.swing.JLabel lbCliente;
    private javax.swing.JLabel lbFechaVenta;
    private javax.swing.JLabel lbProducto;
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
