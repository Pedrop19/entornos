DROP DATABASE IF EXISTS entornos;
CREATE DATABASE entornos CHARACTER SET utf8mb4;
USE entornos;

CREATE TABLE proveedor (
 codigo_prov INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
 nombre VARCHAR(100) NOT NULL
);

CREATE TABLE producto (
 codigo_prod INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
 nombre VARCHAR(100) NOT NULL,
 precio DOUBLE NOT NULL
);

CREATE TABLE cliente (
 codigo_cl INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
 nombre VARCHAR(100) NOT NULL
);

CREATE TABLE producto_proveedor (
	cod_prov INT UNSIGNED NOT NULL,
    cod_prod INT UNSIGNED NOT NULL,
    PRIMARY KEY (cod_prov, cod_prod),
    FOREIGN KEY (cod_prov) REFERENCES proveedor(codigo_prov),
	FOREIGN KEY (cod_prod) REFERENCES producto(codigo_prod)
);

CREATE TABLE producto_cliente (
	cod_cl INT UNSIGNED NOT NULL,
    cod_prod INT UNSIGNED NOT NULL,
    PRIMARY KEY (cod_cl, cod_prod),
    FOREIGN KEY (cod_cl) REFERENCES cliente(codigo_cl),
	FOREIGN KEY (cod_prod) REFERENCES producto(codigo_prod)
);