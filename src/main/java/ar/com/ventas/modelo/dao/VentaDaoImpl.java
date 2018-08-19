package ar.com.ventas.modelo.dao;
import ar.com.ventas.JPADaoFactory;
import ar.com.ventas.modelo.entidades.Venta;
import javax.persistence.EntityManager;

public class VentaDaoImpl extends GenericDaoImpl<Venta> implements VentaDao{

    public VentaDaoImpl() {
        super(Venta.class);
    }

    @Override
    protected EntityManager getEntityManager() {
       return JPADaoFactory.createEntityManager();
    }

}
