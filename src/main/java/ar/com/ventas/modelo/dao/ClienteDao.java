package ar.com.ventas.modelo.dao;

import ar.com.ventas.modelo.entidades.Cliente;
import java.util.List;

/**
 *
 * @author Martin Manganiello
 */
public interface ClienteDao extends GenericDao<Cliente> {

    /**
     * Interfaz lista para agregar metodos especificos de Clientes
     *
     * @param cliente
     */
    @Override
    void create(Cliente cliente);

    @Override
    void edit(Cliente cliente);

    @Override
    void remove(Cliente cliente);

    @Override
    Cliente find(int id);

    @Override
    List<Cliente> findAll();
}
