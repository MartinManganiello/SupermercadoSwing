package ar.com.ventas.modelo.dao;

import ar.com.ventas.JPADaoFactory;
import ar.com.ventas.modelo.entidades.Compra;
import javax.persistence.EntityManager;

public class CompraDaoImpl extends GenericDaoImpl<Compra> implements CompraDao {

    public CompraDaoImpl() {
        super(Compra.class);
    }

    @Override
    protected EntityManager getEntityManager() {
        return JPADaoFactory.createEntityManager();
    }

}
