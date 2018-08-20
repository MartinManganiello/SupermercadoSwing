package ar.com.ventas.vista.tm;

import ar.com.ventas.modelo.entidades.Itemventa;
import java.text.NumberFormat;
import java.util.List;
import javax.swing.table.AbstractTableModel;
/**
 * Clase que define el modelo para la tabla itemVenta
 *
 * @author Martín Manganiello
 */
public class ItemVentaTableModel extends AbstractTableModel {

    private final NumberFormat NF = NumberFormat.getNumberInstance();
    private String columnas[] = {"Producto", "Cantidad", "Valor Unitario"};
    private List<Itemventa> datos;

    @Override
    public int getRowCount() {
        if(datos == null){
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
        Itemventa itemVenta = datos.get(l);
        switch (c) {
            case 0:
                return itemVenta.getCodigoProducto().getNombre();
            case 1:
                return NF.format(itemVenta.getCantidad());
            case 2:
                return itemVenta.getValorUnitario();
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

    public void setDatos(List<Itemventa> dados) {
        this.datos = dados;
        fireTableDataChanged();
    }

    public Itemventa getRowValue(int l) {
        return datos.get(l);
    }

}
