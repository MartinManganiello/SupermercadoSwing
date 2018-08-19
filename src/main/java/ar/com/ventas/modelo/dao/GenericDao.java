package ar.com.ventas.modelo.dao;

import java.util.List;

/**
 *
 * @author Martin Manganiello
 * @param <T> La clase a ser persistida.
 */
public interface GenericDao<T> {

    /**
     * Guarda la nueva instancia en la base de datos
     *
     * @param entity
     */
    void create(T entity);

    /**
     * Guarda cambios hechos al objeto persistente.
     *
     * @param entity
     */
    void edit(T entity);

    /**
     * Borra un objeto persistente en la base de datos
     *
     * @param entity
     */
    void remove(T entity);

    /**
     * Devuelve un objeto que fue previamente guardado en la base de datos
     * usando la clave primaria indicada
     *
     * @param id
     * @return
     */
    T find(int id);

    /**
     * Devuelve una lista de objetos previamente guardados en la base de datos.
     *
     * @return
     */
    List<T> findAll();
}
