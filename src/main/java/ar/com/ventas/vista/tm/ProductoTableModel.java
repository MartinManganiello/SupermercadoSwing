package ar.com.ventas.vista.tm;

import ar.com.ventas.modelo.entidades.Producto;
import java.util.List;
import javax.swing.table.AbstractTableModel;
/**
 * Clase que define el modelo para la tabla producto
 *
 * @author Martín Manganiello
 */
public class ProductoTableModel extends AbstractTableModel {
   private String columnas[] = {"Nombre"};
    private List<Producto> datos;

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
        Producto producto = datos.get(l);
        switch (c) {
            case 0:
                return producto.getNombre();
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

    public void setDatos (List<Producto> datos) {
        this.datos = datos;
        fireTableDataChanged();
    }

    public Producto getRowValue(int l) {
        return datos.get(l);
    }
}
