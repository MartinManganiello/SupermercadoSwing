package ar.com.ventas.vista.tm;

import ar.com.ventas.modelo.entidades.Proveedor;
import java.util.List;
import javax.swing.table.AbstractTableModel;
/**
 * Clase que define el modelo para la tabla proveedor
 *
 * @author Martín Manganiello
 */
public class ProveedorTableModel extends AbstractTableModel {

    private String columnas[] = {"Nombre", "CUIT"};
    private List<Proveedor> datos;

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
        Proveedor proveedor = datos.get(l);
        switch (c) {
            case 0:
                return proveedor.getNombre();
            case 1:
                return proveedor.getCuit();
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

    public void setDatos(List<Proveedor> datos) {
        this.datos = datos;
        fireTableDataChanged();
    }

    public Proveedor getRowValue(int l) {
        return datos.get(l);
    }
}
