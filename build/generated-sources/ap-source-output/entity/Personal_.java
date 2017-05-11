package entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Personal.class)
public abstract class Personal_ {

	public static volatile SingularAttribute<Personal, String> idPersonal;
	public static volatile SingularAttribute<Personal, String> tipoIdentificacion;
	public static volatile SetAttribute<Personal, Factura> facturas;
	public static volatile SingularAttribute<Personal, String> direccion;
	public static volatile SetAttribute<Personal, Pedido> pedidos;
	public static volatile SingularAttribute<Personal, String> nombre;
	public static volatile SingularAttribute<Personal, String> telefonoFijo;
	public static volatile SingularAttribute<Personal, String> telefonoCelular;
	public static volatile SingularAttribute<Personal, String> foto;
	public static volatile SingularAttribute<Personal, String> apellido;
	public static volatile SingularAttribute<Personal, String> correo;
	public static volatile SingularAttribute<Personal, String> contrasena;
	public static volatile SingularAttribute<Personal, String> horarioTurno;
	public static volatile SingularAttribute<Personal, String> cargo;

}

