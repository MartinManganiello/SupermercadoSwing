package ar.com.ventas.modelo.entidades;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "itemcompra")
@NamedQueries({
    @NamedQuery(name = "Itemcompra.findAll", query = "SELECT i FROM Itemcompra i")
    , @NamedQuery(name = "Itemcompra.findByCodigo", query = "SELECT i FROM Itemcompra i WHERE i.codigo = :codigo")
    , @NamedQuery(name = "Itemcompra.findByCantidad", query = "SELECT i FROM Itemcompra i WHERE i.cantidad = :cantidad")
    , @NamedQuery(name = "Itemcompra.findByValorUnitario", query = "SELECT i FROM Itemcompra i WHERE i.valorUnitario = :valorUnitario")})
public class Itemcompra implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Codigo")
    private Integer codigo;
    @Basic(optional = false)
    @Column(name = "Cantidad")
    private int cantidad;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "ValorUnitario")
    private Double valorUnitario;
    @JoinColumn(name = "CodigoCompra", referencedColumnName = "Codigo")
    @ManyToOne(optional = false)
    private Compra codigoCompra;
    @JoinColumn(name = "CodigoProducto", referencedColumnName = "Codigo")
    @ManyToOne(optional = false)
    private Producto codigoProducto;

    public Itemcompra() {
    }

    public Itemcompra(Integer codigo) {
        this.codigo = codigo;
    }

    public Itemcompra(Integer codigo, int cantidad, Double valorUnitario) {
        this.codigo = codigo;
        this.cantidad = cantidad;
        this.valorUnitario = valorUnitario;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(Double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public Compra getCodigoCompra() {
        return codigoCompra;
    }

    public void setCodigoCompra(Compra codigoCompra) {
        this.codigoCompra = codigoCompra;
    }

    public Producto getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(Producto codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigo != null ? codigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Itemcompra)) {
            return false;
        }
        Itemcompra other = (Itemcompra) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ar.com.ventas.modelo.entidades.Itemcompra[ codigo=" + codigo + " ]";
    }

}
