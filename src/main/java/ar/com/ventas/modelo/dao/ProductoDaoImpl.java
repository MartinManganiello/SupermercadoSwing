package ar.com.ventas.modelo.dao;

import ar.com.ventas.JPADaoFactory;
import ar.com.ventas.modelo.entidades.Producto;
import javax.persistence.EntityManager;

public class ProductoDaoImpl extends GenericDaoImpl<Producto> implements ProductoDao {

    public ProductoDaoImpl() {
        super(Producto.class);
    }

    @Override
    protected EntityManager getEntityManager() {
        return JPADaoFactory.createEntityManager();
    }
}
