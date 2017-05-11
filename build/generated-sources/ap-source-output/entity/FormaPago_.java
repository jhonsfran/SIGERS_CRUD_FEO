package entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(FormaPago.class)
public abstract class FormaPago_ {

	public static volatile SingularAttribute<FormaPago, String> descripcion;
	public static volatile SingularAttribute<FormaPago, String> idPago;
	public static volatile SingularAttribute<FormaPago, String> nombre;
	public static volatile SetAttribute<FormaPago, FacturaFormaPago> facturaFormaPagos;

}

