package ar.com.ventas.modelo.dao;

import ar.com.ventas.modelo.entidades.Proveedor;
import java.util.List;

public interface ProveedorDao extends GenericDao<Proveedor> {

    @Override
    void create(Proveedor proveedor);

    @Override
    void edit(Proveedor proveedor);

    @Override
    void remove(Proveedor proveedor);

    @Override
    Proveedor find(int id);

    @Override
    List<Proveedor> findAll();
}
