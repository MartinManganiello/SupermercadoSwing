package ar.com.ventas.modelo.entidades;

import ar.com.ventas.modelo.entidades.Itemcompra;
import ar.com.ventas.modelo.entidades.Itemventa;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.2.v20180622-rNA", date="2018-08-18T16:23:24")
@StaticMetamodel(Producto.class)
public class Producto_ { 

    public static volatile SingularAttribute<Producto, Integer> codigo;
    public static volatile ListAttribute<Producto, Itemcompra> itemcompraList;
    public static volatile SingularAttribute<Producto, Integer> cantidadStock;
    public static volatile SingularAttribute<Producto, Double> precioCompra;
    public static volatile SingularAttribute<Producto, Double> precioVenta;
    public static volatile SingularAttribute<Producto, String> nombre;
    public static volatile ListAttribute<Producto, Itemventa> itemventaList;

}