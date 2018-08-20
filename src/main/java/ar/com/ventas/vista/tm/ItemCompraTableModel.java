package ar.com.ventas.vista.tm;

import ar.com.ventas.modelo.entidades.Itemcompra;
import java.text.NumberFormat;
import java.util.List;
import javax.swing.table.AbstractTableModel;
/**
 * Clase que define el modelo para la tabla itemCompra
 *
 * @author Martín Manganiello
 */
public class ItemCompraTableModel extends AbstractTableModel {

    private final NumberFormat NF = NumberFormat.getNumberInstance();
    private final NumberFormat NFC = NumberFormat.getCurrencyInstance();
    private String columnas[] = {"Producto", "Cantidad", "Valor Unitario"};
    private List<Itemcompra> datos;

    @Override
    public int getRowCount() {
        if (datos == null) {
            return 0;
        }
        return datos.size();
    }

    @Override
    public int getColumnCount() {
        return columnas.length;
    }

    @Override
    public Object getValueAt(int l, int c) {
        Itemcompra itemCompra = datos.get(l);
        switch (c) {
            case 0:
                return itemCompra.getCodigoProducto().getNombre();
            case 1:
                return NF.format(itemCompra.getCantidad());
            case 2:
                return NFC.format(itemCompra.getValorUnitario());
            default:
                throw new IndexOutOfBoundsException("Columna inexistente!");
        }
    }

    @Override
    public String getColumnName(int c) {
        return columnas[c];
    }

    @Override
    public boolean isCellEditable(int l, int c) {
        return false;
    }

    public void setDatos(List<Itemcompra> datos) {
        this.datos = datos;
        fireTableDataChanged();
    }

    public Itemcompra getRowValue(int l) {
        return datos.get(l);
    }

}
