package ar.com.ventas.vista;

import ar.com.ventas.modelo.dao.ProductoDaoImpl;
import ar.com.ventas.modelo.entidades.Producto;
import ar.com.ventas.vista.tm.ProductoTableModel;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.TableRowSorter;

/**
 * Ventana de consulta a los datos del producto
 *
 * @author Martín Manganiello
 */
public class BuscaProducto extends javax.swing.JDialog {

    JInternalFrame parent;

    public BuscaProducto(JInternalFrame parent) {
        super();
        this.parent = parent;
        initComponents();
        cargarTabla();
    }

    private void cargarTabla() {
        try {
            ProductoDaoImpl productoDao = new ProductoDaoImpl();
            ProductoTableModel ptm = (ProductoTableModel) tbTabla.getModel();
            ptm.setDatos(productoDao.findAll());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error al cargar tabla.\n" + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnFiltro = new javax.swing.JPanel();
        lbFiltro = new javax.swing.JLabel();
        tfFiltro = new javax.swing.JTextField();
        spTabla = new javax.swing.JScrollPane();
        tbTabla = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Busca cliente");

        pnFiltro.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        lbFiltro.setText("Filtro:");
        pnFiltro.add(lbFiltro);

        tfFiltro.setColumns(30);
        tfFiltro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfFiltroKeyReleased(evt);
            }
        });
        pnFiltro.add(tfFiltro);

        getContentPane().add(pnFiltro, java.awt.BorderLayout.PAGE_START);

        tbTabla.setAutoCreateRowSorter(true);
        tbTabla.setModel(new ProductoTableModel());
        tbTabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbTablaMouseClicked(evt);
            }
        });
        spTabla.setViewportView(tbTabla);

        getContentPane().add(spTabla, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(500, 350));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tbTablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbTablaMouseClicked
        if (evt.getClickCount() == 2) {
            ProductoTableModel ptm = (ProductoTableModel) tbTabla.getModel();
            int registroSeleccionado = tbTabla.getRowSorter().convertRowIndexToModel(tbTabla.getSelectedRow());
            Producto producto = ptm.getRowValue(registroSeleccionado);

            if (parent instanceof RealizarVenta) {
                RealizarVenta rv = (RealizarVenta) parent;
                rv.setProducto(producto);
                dispose();
            } else if (parent instanceof RealizarCompra) {
                RealizarCompra rc = (RealizarCompra) parent;
                rc.setProducto(producto);
                dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Campo de destino invalido.", "Alerta", JOptionPane.WARNING_MESSAGE);
            }

        }
    }//GEN-LAST:event_tbTablaMouseClicked

    private void tfFiltroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfFiltroKeyReleased
        TableRowSorter rs = (TableRowSorter) tbTabla.getRowSorter();
        rs.setRowFilter(RowFilter.regexFilter("(?i)" + tfFiltro.getText(), 0, 1));
    }//GEN-LAST:event_tfFiltroKeyReleased
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lbFiltro;
    private javax.swing.JPanel pnFiltro;
    private javax.swing.JScrollPane spTabla;
    private javax.swing.JTable tbTabla;
    private javax.swing.JTextField tfFiltro;
    // End of variables declaration//GEN-END:variables
}
