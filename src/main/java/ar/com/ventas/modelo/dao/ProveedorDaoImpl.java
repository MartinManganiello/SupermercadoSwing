package ar.com.ventas.modelo.dao;

import ar.com.ventas.JPADaoFactory;
import ar.com.ventas.modelo.entidades.Proveedor;
import javax.persistence.EntityManager;

public class ProveedorDaoImpl extends GenericDaoImpl<Proveedor> implements ProveedorDao {

    public ProveedorDaoImpl() {
        super(Proveedor.class);
    }

    @Override
    protected EntityManager getEntityManager() {
        return JPADaoFactory.createEntityManager();
    }

}
