package ar.com.ventas.modelo.dao;

import ar.com.ventas.modelo.entidades.Compra;
import java.util.List;

public interface CompraDao extends GenericDao<Compra> {

    @Override
    void create(Compra compra);

    @Override
    void edit(Compra compra);

    @Override
    void remove(Compra compra);

    @Override
    Compra find(int id);

    @Override
    List<Compra> findAll();
}
