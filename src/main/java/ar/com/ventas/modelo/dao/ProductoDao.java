package ar.com.ventas.modelo.dao;

import ar.com.ventas.modelo.entidades.Producto;
import java.util.List;

/**
 *
 * @author Martin
 */
public interface ProductoDao extends GenericDao<Producto> {

    @Override
    void create(Producto producto);

    @Override
    void edit(Producto producto);

    @Override
    void remove(Producto producto);

    @Override
    Producto find(int id);

    @Override
    List<Producto> findAll();
}
