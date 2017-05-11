package entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(ItemMenu.class)
public abstract class ItemMenu_ {

	public static volatile SingularAttribute<ItemMenu, Integer> precioActual;
	public static volatile SingularAttribute<ItemMenu, String> descripcion;
	public static volatile SingularAttribute<ItemMenu, Categoria> categoria;
	public static volatile SetAttribute<ItemMenu, FacturaItems> facturaItemses;
	public static volatile SetAttribute<ItemMenu, PedidoItem> pedidoItems;
	public static volatile SingularAttribute<ItemMenu, String> idItem;
	public static volatile SingularAttribute<ItemMenu, String> fotografia;
	public static volatile SingularAttribute<ItemMenu, Integer> cantidadDisponible;

}

