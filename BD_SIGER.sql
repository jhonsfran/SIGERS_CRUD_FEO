DROP TABLE IF EXISTS Personal, pedido, categoria, item_menu, pedido_item, factura, forma_pago, factura_items, factura_forma_pago CASCADE;

create table Personal(
id_personal varchar(10) primary key,
nombre varchar(20) NOT NULL,
apellido varchar(20) NOT NULL,
tipo_identificacion varchar(20) NOT NULL,
cargo varchar(20) NOT NULL,
horario_turno varchar(20) NOT NULL,
foto varchar(50) NOT NULL,
direccion varchar(30) NOT NULL,
telefono_fijo varchar(10) NOT NULL,
telefono_celular varchar(10) NOT NULL,
correo varchar(30) NOT NULL,
contrasena varchar(30) NOT NULL
);

create table pedido(
id_pedido varchar(10) primary key,
id_mesa varchar(10) NOT NULL,
id_mesero varchar(10),
id_tipo varchar(10) NOT NULL,
hora_inicio timestamp NOT NULL,
hora_entrega timestamp NOT NULL,
foreign key (id_mesero) references personal(id_personal)
);

create table categoria(
id_categoria varchar(10) primary key,
nombre varchar(15) NOT NULL,
descripcion varchar(100) NOT NULL
);

create table item_menu(
id_item varchar(10) primary key,
fotografia varchar(50) NOT NULL,
precio_actual int NOT NULL,
descripcion varchar(100) NOT NULL,
categoria varchar(10),
cantidad_disponible int NOT NULL,
foreign key (categoria) references categoria(id_categoria)
);


create table pedido_item(
id_pedido varchar(10),
id_item varchar(10),
foreign key (id_pedido) references pedido(id_pedido),
foreign key (id_item) references item_menu(id_item)
);

create table factura(
id_factura varchar(10) primary key,
hora_pago timestamp NOT NULL,
propina int NOT NULL,
id_personal varchar(10),
descuento int NOT NULL,
impuesto int NOT NULL,
cedula_cliente varchar(10) NOT NULL,
total_pago int NOT NULL,
foreign key (id_personal) references personal(id_personal)
);

create table forma_pago(
id_pago varchar(10) primary key,
nombre varchar(10) NOT NULL,
descripcion varchar(100) NOT NULL
);

create table factura_items(
id_item varchar(10),
id_factura varchar(10),
foreign key (id_item) references item_menu(id_item),
foreign key (id_factura) references factura(id_factura)
);

create table factura_forma_pago(
id_pago varchar(10),
id_factura varchar(10),
foreign key(id_pago) references forma_pago(id_pago),
foreign key(id_factura) references factura(id_factura)
);