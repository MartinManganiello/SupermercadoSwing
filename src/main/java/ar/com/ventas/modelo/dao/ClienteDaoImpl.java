package ar.com.ventas.modelo.dao;

import ar.com.ventas.JPADaoFactory;
import ar.com.ventas.modelo.entidades.Cliente;
import javax.persistence.EntityManager;

public class ClienteDaoImpl extends GenericDaoImpl<Cliente> implements ClienteDao{

    public ClienteDaoImpl() {
        super(Cliente.class);
    }

    @Override
    protected EntityManager getEntityManager() {
        return JPADaoFactory.createEntityManager();
    }
}
