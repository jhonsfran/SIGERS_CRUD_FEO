package entity;
// Generated 26/04/2017 03:04:33 PM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Factura generated by hbm2java
 */
@Entity
@Table(name="factura"
    ,schema="public"
)
public class Factura  implements java.io.Serializable {


     private String idFactura;
     private Personal personal;
     private Date horaPago;
     private Integer propina;
     private Integer descuento;
     private Integer impuesto;
     private String cedulaCliente;
     private Integer totalPago;
     private Set<FacturaItems> facturaItemses = new HashSet<FacturaItems>(0);
     private Set<FacturaFormaPago> facturaFormaPagos = new HashSet<FacturaFormaPago>(0);

    public Factura() {
    }

	
    public Factura(String idFactura) {
        this.idFactura = idFactura;
    }
    public Factura(String idFactura, Personal personal, Date horaPago, Integer propina, Integer descuento, Integer impuesto, String cedulaCliente, Integer totalPago, Set<FacturaItems> facturaItemses, Set<FacturaFormaPago> facturaFormaPagos) {
       this.idFactura = idFactura;
       this.personal = personal;
       this.horaPago = horaPago;
       this.propina = propina;
       this.descuento = descuento;
       this.impuesto = impuesto;
       this.cedulaCliente = cedulaCliente;
       this.totalPago = totalPago;
       this.facturaItemses = facturaItemses;
       this.facturaFormaPagos = facturaFormaPagos;
    }
   
     @Id 

    
    @Column(name="id_factura", nullable=false, length=10)
    public String getIdFactura() {
        return this.idFactura;
    }
    
    public void setIdFactura(String idFactura) {
        this.idFactura = idFactura;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="id_personal")
    public Personal getPersonal() {
        return this.personal;
    }
    
    public void setPersonal(Personal personal) {
        this.personal = personal;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="hora_pago", length=29)
    public Date getHoraPago() {
        return this.horaPago;
    }
    
    public void setHoraPago(Date horaPago) {
        this.horaPago = horaPago;
    }

    
    @Column(name="propina")
    public Integer getPropina() {
        return this.propina;
    }
    
    public void setPropina(Integer propina) {
        this.propina = propina;
    }

    
    @Column(name="descuento")
    public Integer getDescuento() {
        return this.descuento;
    }
    
    public void setDescuento(Integer descuento) {
        this.descuento = descuento;
    }

    
    @Column(name="impuesto")
    public Integer getImpuesto() {
        return this.impuesto;
    }
    
    public void setImpuesto(Integer impuesto) {
        this.impuesto = impuesto;
    }

    
    @Column(name="cedula_cliente", length=10)
    public String getCedulaCliente() {
        return this.cedulaCliente;
    }
    
    public void setCedulaCliente(String cedulaCliente) {
        this.cedulaCliente = cedulaCliente;
    }

    
    @Column(name="total_pago")
    public Integer getTotalPago() {
        return this.totalPago;
    }
    
    public void setTotalPago(Integer totalPago) {
        this.totalPago = totalPago;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="factura")
    public Set<FacturaItems> getFacturaItemses() {
        return this.facturaItemses;
    }
    
    public void setFacturaItemses(Set<FacturaItems> facturaItemses) {
        this.facturaItemses = facturaItemses;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="factura")
    public Set<FacturaFormaPago> getFacturaFormaPagos() {
        return this.facturaFormaPagos;
    }
    
    public void setFacturaFormaPagos(Set<FacturaFormaPago> facturaFormaPagos) {
        this.facturaFormaPagos = facturaFormaPagos;
    }




}


