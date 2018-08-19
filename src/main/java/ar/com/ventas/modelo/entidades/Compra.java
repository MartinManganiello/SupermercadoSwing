package ar.com.ventas.modelo.entidades;

import ar.com.ventas.modelo.entidades.enums.Estado;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "compra")
@NamedQueries({
    @NamedQuery(name = "Compra.findAll", query = "SELECT c FROM Compra c")
    , @NamedQuery(name = "Compra.findByCodigo", query = "SELECT c FROM Compra c WHERE c.codigo = :codigo")
    , @NamedQuery(name = "Compra.findByFechaCompra", query = "SELECT c FROM Compra c WHERE c.fechaCompra = :fechaCompra")
    , @NamedQuery(name = "Compra.findByValorTotal", query = "SELECT c FROM Compra c WHERE c.valorTotal = :valorTotal")
    , @NamedQuery(name = "Compra.findByEstado", query = "SELECT c FROM Compra c WHERE c.estado = :estado")})
public class Compra implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Codigo")
    private Integer codigo;
    @Basic(optional = false)
    @Column(name = "FechaCompra")
    @Temporal(TemporalType.DATE)
    private Date fechaCompra;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "ValorTotal")
    private Double valorTotal;
    @Basic(optional = false)
    @Column(name = "Situacion")
    private Estado estado;
    @JoinColumn(name = "CodigoProveedor", referencedColumnName = "Codigo")
    @ManyToOne(optional = false)
    private Proveedor codigoProveedor;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codigoCompra")
    private List<Itemcompra> itemcompraList = new ArrayList();
    private List<Itemcompra> itemsRemover = new ArrayList();

    public Compra() {
    }

    public Compra(Integer codigo) {
        this.codigo = codigo;
    }

    public Compra(Integer codigo, Date fechaCompra, Double valorTotal, Estado estado) {
        this.codigo = codigo;
        this.fechaCompra = fechaCompra;
        this.valorTotal = valorTotal;
        this.estado = estado;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Date getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(Date fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public Double getValorTotal() {
          double total = 0;
        for (Itemcompra iv : itemcompraList) {
            total += (iv.getValorUnitario() * iv.getCantidad());
        }
        return total;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
      public void setEstado(int estado) {
           if (estado == Estado.ABIERTA.getId()) {
            setEstado(Estado.ABIERTA);
        } else if (estado == Estado.FINALIZADA.getId()) {
            setEstado(Estado.FINALIZADA);
        } else if (estado == Estado.CANCELADA.getId()) {
            setEstado(Estado.CANCELADA);
        }
    }

    public Proveedor getCodigoProveedor() {
        return codigoProveedor;
    }

    public void setCodigoProveedor(Proveedor codigoProveedor) {
        this.codigoProveedor = codigoProveedor;
    }

    public List<Itemcompra> getItemcompraList() {
        return itemcompraList;
    }

    public void setItemcompraList(List<Itemcompra> itemcompraList) {
        this.itemcompraList = itemcompraList;
    }

    public void addItem(Itemcompra itemCompra) {
        itemcompraList.add(itemCompra);
    }

    public void removeItem(Itemcompra itemCompra) {
        itemcompraList.remove(itemCompra);
        if (itemCompra.getCodigo() != 0) {
            itemsRemover.add(itemCompra);
        }
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
        if (!(object instanceof Compra)) {
            return false;
        }
        Compra other = (Compra) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ar.com.ventas.modelo.entidades.Compra[ codigo=" + codigo + " ]";
    }

}
