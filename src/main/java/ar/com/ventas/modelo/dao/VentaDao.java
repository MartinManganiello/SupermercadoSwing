package ar.com.ventas.modelo.dao;

import ar.com.ventas.modelo.entidades.Venta;
import java.util.List;

/**
 *
 * @author Martin Manganiello
 */
public interface VentaDao extends GenericDao<Venta> {

    @Override
    void create(Venta venta);

    @Override
    void edit(Venta venta);

    @Override
    void remove(Venta venta);

    @Override
    Venta find(int id);

    @Override
    List<Venta> findAll();
}
