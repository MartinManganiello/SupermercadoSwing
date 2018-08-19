package ar.com.ventas.modelo.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaQuery;

public abstract class GenericDaoImpl<T> implements GenericDao<T> {

    /**
     * Clase generica que utiliza el patrón DAO con los metodos comunes a todas las entidades a persistir.
     */
    private final Class<T> entityClass;
    
    public GenericDaoImpl(Class<T> entityClass) {
        this.entityClass = entityClass;
    }

    protected abstract EntityManager getEntityManager();

    @Override
    public void create(T entity) {
        if(entity==null) return;
        try {
            getEntityManager().getTransaction().begin();
            getEntityManager().persist(entity);
            getEntityManager().getTransaction().commit();
        } catch (Exception ex) {
            System.out.println(ex);
            getEntityManager().getTransaction().rollback();
        }
    }

    @Override
    public T find(int id) {
        return getEntityManager().find(entityClass, id);
    }

    @Override
    public void edit(T entity) {
         if(entity==null) return;
        try {
            getEntityManager().getTransaction().begin();
            getEntityManager().persist(entity);
            getEntityManager().getTransaction().commit();
        } catch (Exception ex) {
            System.out.println(ex);
            getEntityManager().getTransaction().rollback();
        }  
    }

    @Override
    public void remove(T entity) {
         if(entity==null) return;
         try {
            getEntityManager().getTransaction().begin();
            getEntityManager().remove(entity);
            getEntityManager().getTransaction().commit();
        } catch (Exception ex) {
            System.out.println(ex);
            getEntityManager().getTransaction().rollback();
        }
    }

    @Override
    public List<T> findAll() {
        CriteriaQuery cq = getEntityManager().getCriteriaBuilder().createQuery();
        cq.select(cq.from(entityClass));
        return getEntityManager().createQuery(cq).getResultList();
    }

}
