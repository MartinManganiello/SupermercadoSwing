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
@Table(name = "venta")
@NamedQueries({
    @NamedQuery(name = "Venta.findAll", query = "SELECT v FROM Venta v")
    , @NamedQuery(name = "Venta.findByCodigo", query = "SELECT v FROM Venta v WHERE v.codigo = :codigo")
    , @NamedQuery(name = "Venta.findByFechaVenta", query = "SELECT v FROM Venta v WHERE v.fechaVenta = :fechaVenta")
    , @NamedQuery(name = "Venta.findByValorTotal", query = "SELECT v FROM Venta v WHERE v.valorTotal = :valorTotal")
    , @NamedQuery(name = "Venta.findByEstado", query = "SELECT v FROM Venta v WHERE v.estado = :estado")})
public class Venta implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Codigo")
    private Integer codigo;
    @Basic(optional = false)
    @Column(name = "FechaVenta")
    @Temporal(TemporalType.DATE)
    private Date fechaVenta;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "ValorTotal")
    private Double valorTotal;
    @Basic(optional = false)
    @Column(name = "Situacion")
    private Estado estado;
    @JoinColumn(name = "CodigoCliente", referencedColumnName = "Codigo")
    @ManyToOne(optional = false)
    private Cliente codigoCliente;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codigoVenta")
    private List<Itemventa> itemventaList = new ArrayList();
    private List<Itemventa> itensRemover  = new ArrayList();

    public Venta() {
    }

    public Venta(Integer codigo) {
        this.codigo = codigo;
    }

    public Venta(Integer codigo, Date fechaVenta, Double valorTotal, Estado estado) {
        this.codigo = codigo;
        this.fechaVenta = fechaVenta;
        this.valorTotal = valorTotal;
        this.estado = estado;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Date getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(Date fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public Double getValorTotal() {
        double total = 0;
        for (Itemventa iv : itemventaList) {
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
    
    public void setEstado(int estado){
      if (estado == Estado.ABIERTA.getId()) {
            setEstado(Estado.ABIERTA);
        } else if (estado == Estado.FINALIZADA.getId()) {
            setEstado(Estado.FINALIZADA);
        } else if (estado == Estado.CANCELADA.getId()) {
            setEstado(Estado.CANCELADA);
        }
    }

    public Cliente getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(Cliente codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    public List<Itemventa> getItemventaList() {
        return itemventaList;
    }

    public void setItemventaList(List<Itemventa> itemventaList) {
        this.itemventaList = itemventaList;
    }

    public void addItem(Itemventa itemVenta) {
        itemventaList.add(itemVenta);
    }

    public void removeItem(Itemventa itemVenta) {
        itemventaList.remove(itemVenta);
        if (itemVenta.getCodigo() != 0) {
            itensRemover.add(itemVenta);
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
        if (!(object instanceof Venta)) {
            return false;
        }
        Venta other = (Venta) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return this.codigo + " " +this.fechaVenta + " " + this.estado;
    }

}
