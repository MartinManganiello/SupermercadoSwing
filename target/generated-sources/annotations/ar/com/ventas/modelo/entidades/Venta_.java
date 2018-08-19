package ar.com.ventas.modelo.entidades;

import ar.com.ventas.modelo.entidades.Cliente;
import ar.com.ventas.modelo.entidades.Itemventa;
import ar.com.ventas.modelo.entidades.enums.Estado;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.2.v20180622-rNA", date="2018-08-18T16:23:24")
@StaticMetamodel(Venta.class)
public class Venta_ { 

    public static volatile SingularAttribute<Venta, Integer> codigo;
    public static volatile SingularAttribute<Venta, Estado> estado;
    public static volatile SingularAttribute<Venta, Double> valorTotal;
    public static volatile SingularAttribute<Venta, Cliente> codigoCliente;
    public static volatile ListAttribute<Venta, Itemventa> itensRemover;
    public static volatile SingularAttribute<Venta, Date> fechaVenta;
    public static volatile ListAttribute<Venta, Itemventa> itemventaList;

}