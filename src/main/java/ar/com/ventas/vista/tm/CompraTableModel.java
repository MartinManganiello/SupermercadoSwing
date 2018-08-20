package ar.com.ventas.vista.tm;

import ar.com.ventas.modelo.entidades.Compra;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.table.AbstractTableModel;
/**
 * Clase que define el modelo para la tabla Compra
 *
 * @author Martín Manganiello
 */
public class CompraTableModel extends AbstractTableModel{
 private final SimpleDateFormat SDF = new SimpleDateFormat("dd/MM/yyyy");
    private final NumberFormat NFC = NumberFormat.getCurrencyInstance();
    private String columnas[] = {"Proveedor", "Fecha", "Valor", "Situación"};
    private List<Compra> datos;

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
        Compra compra = datos.get(l);
        switch (c) {
            case 0:
                return compra.getCodigoProveedor().getNombre();
            case 1:
                return SDF.format(compra.getFechaCompra());
            case 2:
                return NFC.format(compra.getValorTotal());
            case 3:
                return compra.getEstado();
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

    public void setDatos(List<Compra> datos) {
        this.datos = datos;
        fireTableDataChanged();
    }

    public Compra getRowValue(int l) {
        return datos.get(l);
    }
}
