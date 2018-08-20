package ar.com.ventas.vista.tm;

import ar.com.ventas.modelo.entidades.Venta;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.table.AbstractTableModel;
/**
 * Clase que define el modelo para la tabla venta
 *
 * @author Martín Manganiello
 */
public class VentaTableModel extends AbstractTableModel {

    private final SimpleDateFormat SDF = new SimpleDateFormat("dd/MM/yyyy");
    private String columnas[] = {"Cliente", "Fecha", "Valor", "Estado"};
    private List<Venta> datos;

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
        Venta venta = datos.get(l);
        switch (c) {
            case 0:
                return venta.getCodigoCliente().getNombre();
            case 1:
                return SDF.format(venta.getFechaVenta());
            case 2:
                return venta.getValorTotal();
            case 3:
                return venta.getEstado();
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

    public void setDatos(List<Venta> datos) {
        this.datos = datos;
        fireTableDataChanged();
    }

    public Venta getRowValue(int l) {
        return datos.get(l);
    }
}
