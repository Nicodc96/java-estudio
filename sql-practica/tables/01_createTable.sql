/* 
    El siguiente es un esqueleto de COMO se debe crear una tabla en SQL (MariaDB).

    Se utiliza esta sentencia para crear de manera manual una tabla dentro de nuestra base
    de datos. Para ello se debe indicar que, en cada de una de sus columnas, el nombre del
    dato a guardar y su TIPO.

    *ver tipos en W3School*

    NULL / NOT NULL: Esta restricción sirve para indicar si ese valor pueda tener o no valores nulos
    UNIQUE: Esta restricción sirve para indicar que no pueden existir valores iguales a este
    PRIMARY KEY: Indica que columna será la clave primaria, información principal para relación entre tablas.
    CHECK(condicion): Indica, si aplica, que sólo se ingresarán filas de datos que cumplan esa condición
    DEFAULT: Indica el valor por defecto que tendrá ese dato en cada fila
    AUTO_INCREMENT: Señala que la columna de esa fila (por lo general numérica) sumará +1 
    al valor anterior de la columna de la fila anterior.
 */
CREATE TABLE `clientes` (
    `id` INT NOT NULL AUTO_INCREMENT,
    `nombre` VARCHAR(100) NULL,
    `apellido` VARCHAR(100) NOT NULL,
    `edad` INT(3) NULL,
    `email` VARCHAR(100) NOT NULL,
    `updateAt` DATETIME NULL DEFAULT CURRENT_TIMESTAMP(),
    `deleteAt` DATETIME NULL DEFAULT CURRENT_TIMESTAMP(),
    UNIQUE(`id`),
    PRIMARY KEY(`id`),
    CHECK(`edad` >= 18)
);