CREATE DATABASE  IF NOT EXISTS sistemaventa;

USE sistemaventa;

CREATE TABLE cliente (
  Codigo int(11) NOT NULL AUTO_INCREMENT,
  Nombre varchar(100) NOT NULL,
  DNI varchar(14) NOT NULL,
  FechaNacimiento date NOT NULL,
  PRIMARY KEY (Codigo)
);

CREATE TABLE proveedor (
  Codigo int(11) NOT NULL AUTO_INCREMENT,
  Nombre varchar(100) NOT NULL,
  CUIT varchar(18) NOT NULL,
  PRIMARY KEY (Codigo)
);

CREATE TABLE producto (
  Codigo int(11) NOT NULL AUTO_INCREMENT,
  Nombre varchar(100) NOT NULL,
  PrecioCompra decimal(10,2) NOT NULL,
  PrecioVenta decimal(10,2) NOT NULL,
  CantidadStock int NOT NULL,
  PRIMARY KEY (Codigo)
);

CREATE TABLE venta (
  Codigo int(11) NOT NULL AUTO_INCREMENT,
  CodigoCliente int(11) NOT NULL,
  FechaVenta date NOT NULL,
  ValorTotal decimal(10,2) NOT NULL,
  Situacion int(11) NOT NULL,
  PRIMARY KEY (Codigo),
  KEY FK_CodigoCliente_idx (CodigoCliente),
  CONSTRAINT FK_CodigoCliente FOREIGN KEY (CodigoCliente) REFERENCES cliente (Codigo)
);

CREATE TABLE compra (
  Codigo int(11) NOT NULL AUTO_INCREMENT,
  CodigoProveedor int(11) NOT NULL,
  FechaCompra date NOT NULL,
  ValorTotal decimal(10,2) NOT NULL,
  Situacion int(11) NOT NULL,
  PRIMARY KEY (Codigo),
  KEY FK_CodigoProveedor_idx (CodigoProveedor),
  CONSTRAINT FK_CodigoProveedor FOREIGN KEY (CodigoProveedor) REFERENCES proveedor (Codigo)
);

CREATE TABLE itemventa (
  Codigo int(11) NOT NULL AUTO_INCREMENT,
  CodigoProducto int(11) NOT NULL,
  CodigoVenta int(11) NOT NULL,
  Cantidad int(11) NOT NULL,
  ValorUnitario decimal(10,2) NOT NULL,
  PRIMARY KEY (Codigo),
  KEY FK_CodigoVenta_idx (CodigoVenta),
  KEY FK_CodigoProducto_idx (CodigoProducto),
  CONSTRAINT FK_CodigoProducto FOREIGN KEY (CodigoProducto) REFERENCES producto (Codigo) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT FK_CodigoVenta FOREIGN KEY (CodigoVenta) REFERENCES venta (Codigo) ON DELETE NO ACTION ON UPDATE NO ACTION
);

CREATE TABLE itemcompra (
  Codigo int(11) NOT NULL AUTO_INCREMENT,
  CodigoProducto int(11) NOT NULL,
  CodigoCompra int(11) NOT NULL,
  Cantidad int(11) NOT NULL,
  ValorUnitario decimal(10,2) NOT NULL,
  PRIMARY KEY (Codigo),
  KEY FK_CodigoCompra_idx2 (CodigoCompra),
  KEY FK_CodigoProducto_idx2 (CodigoProducto),
  CONSTRAINT FK_CodigoProducto2 FOREIGN KEY (CodigoProducto) REFERENCES producto (Codigo) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT FK_CodigoCompra2 FOREIGN KEY (CodigoCompra) REFERENCES compra (Codigo) ON DELETE NO ACTION ON UPDATE NO ACTION
);
