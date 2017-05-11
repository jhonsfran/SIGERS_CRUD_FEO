package entity;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Factura.class)
public abstract class Factura_ {

	public static volatile SingularAttribute<Factura, Integer> impuesto;
	public static volatile SingularAttribute<Factura, Integer> descuento;
	public static volatile SingularAttribute<Factura, String> idFactura;
	public static volatile SingularAttribute<Factura, Integer> totalPago;
	public static volatile SetAttribute<Factura, FacturaItems> facturaItemses;
	public static volatile SingularAttribute<Factura, Personal> personal;
	public static volatile SingularAttribute<Factura, Integer> propina;
	public static volatile SingularAttribute<Factura, Date> horaPago;
	public static volatile SetAttribute<Factura, FacturaFormaPago> facturaFormaPagos;
	public static volatile SingularAttribute<Factura, String> cedulaCliente;

}

