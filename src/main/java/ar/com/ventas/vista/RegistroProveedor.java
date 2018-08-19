package ar.com.ventas.vista;

import ar.com.ventas.modelo.dao.ProveedorDaoImpl;
import ar.com.ventas.modelo.entidades.Proveedor;
import ar.com.ventas.vista.tm.ProveedorTableModel;
import javax.swing.JOptionPane;

public class RegistroProveedor extends javax.swing.JInternalFrame {

    private Proveedor proveedor = null;
    private ProveedorDaoImpl proveedorDao = new ProveedorDaoImpl();

    public RegistroProveedor() {
        initComponents();
        habilitarFormulario(false);
        cargarTabla();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnBarraHerramientas = new javax.swing.JPanel();
        barraHerramientas = new javax.swing.JToolBar();
        btNuevo = new javax.swing.JButton();
        btGuardar = new javax.swing.JButton();
        btBorrar = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();
        pnContenido = new javax.swing.JPanel();
        pnForm = new javax.swing.JPanel();
        lbNombre = new javax.swing.JLabel();
        lbCuit = new javax.swing.JLabel();
        ftfNombre = new javax.swing.JFormattedTextField();
        ftfCuit = new javax.swing.JTextField();
        spTabla = new javax.swing.JScrollPane();
        tbTabla = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setTitle("Registro de Proveedores");

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

        lbNombre.setText("Nombre:");

        lbCuit.setText("CUIT:");

        ftfNombre.setColumns(25);

        javax.swing.GroupLayout pnFormLayout = new javax.swing.GroupLayout(pnForm);
        pnForm.setLayout(pnFormLayout);
        pnFormLayout.setHorizontalGroup(
            pnFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnFormLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(pnFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnFormLayout.createSequentialGroup()
                        .addComponent(lbNombre)
                        .addGap(4, 4, 4)
                        .addComponent(ftfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnFormLayout.createSequentialGroup()
                        .addComponent(lbCuit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ftfCuit, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(109, 109, 109))
        );
        pnFormLayout.setVerticalGroup(
            pnFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnFormLayout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(pnFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnFormLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(lbNombre))
                    .addComponent(ftfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(pnFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCuit)
                    .addComponent(ftfCuit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pnContenido.add(pnForm, java.awt.BorderLayout.PAGE_START);

        tbTabla.setAutoCreateRowSorter(true);
        tbTabla.setModel(new ProveedorTableModel());
        tbTabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbTablaMouseClicked(evt);
            }
        });
        spTabla.setViewportView(tbTabla);

        pnContenido.add(spTabla, java.awt.BorderLayout.CENTER);

        getContentPane().add(pnContenido, java.awt.BorderLayout.CENTER);

        setBounds(10, 10, 531, 450);
    }// </editor-fold>//GEN-END:initComponents

    private void btNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNuevoActionPerformed
        proveedor = new Proveedor();
        habilitarFormulario(true);
        btBorrar.setEnabled(false);
    }//GEN-LAST:event_btNuevoActionPerformed

    private void btGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGuardarActionPerformed
        if (validarFormulario()) {
            proveedor.setNombre(ftfNombre.getText().trim());
            proveedor.setCuit(ftfCuit.getText());

            if (proveedor.getCodigo() == null) {
                try {
                    proveedorDao.create(proveedor);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(this, "Error al insertar el proveedor.\n" + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
            } else {
                try {
                    proveedorDao.edit(proveedor);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(this, "Error al modificar el proveedor.\n" + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
            }

            habilitarFormulario(false);
            cargarTabla();
        }
    }//GEN-LAST:event_btGuardarActionPerformed

    private void btBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBorrarActionPerformed
        int opcion = JOptionPane.showConfirmDialog(this, "Desea borrar el proveedor " + proveedor + "?");
        if (opcion == 0) {
            try {
                proveedorDao.remove(proveedor);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Error al borrar el proveedor.\n" + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            habilitarFormulario(false);
            cargarTabla();
        }
    }//GEN-LAST:event_btBorrarActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        habilitarFormulario(false);
    }//GEN-LAST:event_btCancelarActionPerformed

    private void tbTablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbTablaMouseClicked
        if (evt.getClickCount() == 2) {
            ProveedorTableModel tm = (ProveedorTableModel) tbTabla.getModel();
            proveedor = tm.getRowValue(tbTabla.getRowSorter().convertRowIndexToModel(tbTabla.getSelectedRow()));

            ftfNombre.setValue(proveedor.getNombre());
            ftfCuit.setText(proveedor.getCuit());

            habilitarFormulario(true);
        }
    }//GEN-LAST:event_tbTablaMouseClicked

    private void habilitarFormulario(boolean activo) {
        btNuevo.setEnabled(!activo);
        btGuardar.setEnabled(activo);
        btBorrar.setEnabled(activo);
        btCancelar.setEnabled(activo);
        ftfNombre.setEnabled(activo);
        ftfCuit.setEnabled(activo);
        tbTabla.setEnabled(!activo);

        if (!activo) {
            limpiarFormulario();
        }
    }

    private void limpiarFormulario() {
        proveedor = null;
        ftfNombre.setValue("");
        ftfCuit.setText("");
    }

    private boolean validarFormulario() {
        if (ftfNombre.getText().trim().length() < 2) {
            JOptionPane.showMessageDialog(this, "Nombre invalido.", "Alerta", JOptionPane.WARNING_MESSAGE);
            ftfNombre.requestFocus();
            return false;
        }
        if (ftfCuit.getText().trim().length() != 11) {
            JOptionPane.showMessageDialog(this, "CUIT invalido.", "Alerta", JOptionPane.WARNING_MESSAGE);
            ftfCuit.requestFocus();
            return false;
        }
        return true;
    }

    private void cargarTabla() {
        ProveedorTableModel tm = (ProveedorTableModel) tbTabla.getModel();
        try {
            tm.setDatos(proveedorDao.findAll());
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
    private javax.swing.JTextField ftfCuit;
    private javax.swing.JFormattedTextField ftfNombre;
    private javax.swing.JLabel lbCuit;
    private javax.swing.JLabel lbNombre;
    private javax.swing.JPanel pnBarraHerramientas;
    private javax.swing.JPanel pnContenido;
    private javax.swing.JPanel pnForm;
    private javax.swing.JScrollPane spTabla;
    private javax.swing.JTable tbTabla;
    // End of variables declaration//GEN-END:variables
}
