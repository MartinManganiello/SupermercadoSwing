package ar.com.ventas.modelo.entidades;

import ar.com.ventas.modelo.entidades.Itemcompra;
import ar.com.ventas.modelo.entidades.Proveedor;
import ar.com.ventas.modelo.entidades.enums.Estado;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.2.v20180622-rNA", date="2018-08-18T16:23:24")
@StaticMetamodel(Compra.class)
public class Compra_ { 

    public static volatile ListAttribute<Compra, Itemcompra> itemsRemover;
    public static volatile SingularAttribute<Compra, Date> fechaCompra;
    public static volatile SingularAttribute<Compra, Integer> codigo;
    public static volatile SingularAttribute<Compra, Estado> estado;
    public static volatile ListAttribute<Compra, Itemcompra> itemcompraList;
    public static volatile SingularAttribute<Compra, BigDecimal> valorTotal;
    public static volatile SingularAttribute<Compra, Proveedor> codigoProveedor;

}