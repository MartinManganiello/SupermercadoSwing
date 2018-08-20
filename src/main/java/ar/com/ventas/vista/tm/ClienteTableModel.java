package ar.com.ventas.vista.tm;

import ar.com.ventas.modelo.entidades.Cliente;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 * Clase que define el modelo para la tabla cliente
 *
 * @author Martín Manganiello
 */
public class ClienteTableModel extends AbstractTableModel {

    private String columnas[] = {"Nombre", "DNI"};
    private List<Cliente> datos;

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
        Cliente cliente = datos.get(l);
        switch (c) {
            case 0:
                return cliente.getNombre();
            case 1:
                return cliente.getDni();
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

    public void setDatos(List<Cliente> datos) {
        this.datos = datos;
        fireTableDataChanged();
    }

    public Cliente getRowValue(int l) {
        return datos.get(l);
    }
}
