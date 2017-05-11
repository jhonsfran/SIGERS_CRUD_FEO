package entity;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Pedido.class)
public abstract class Pedido_ {

	public static volatile SingularAttribute<Pedido, String> idMesa;
	public static volatile SingularAttribute<Pedido, Date> horaEntrega;
	public static volatile SetAttribute<Pedido, PedidoItem> pedidoItems;
	public static volatile SingularAttribute<Pedido, Personal> personal;
	public static volatile SingularAttribute<Pedido, String> idTipo;
	public static volatile SingularAttribute<Pedido, String> idPedido;
	public static volatile SingularAttribute<Pedido, Date> horaInicio;

}

