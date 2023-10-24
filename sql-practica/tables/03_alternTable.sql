/* Modificar una tabla YA existente */

/* Agregar una nueva columna */
ALTER TABLE `clientes`
ADD `dni` VARCHAR(150);

/* Renombrar una columna */
ALTER TABLE `clientes`
RENAME COLUMN `dni` TO `descripcion`;

/* Cambiar tipo de dato o ampliar límites del mismo */
ALTER TABLE `clientes`
MODIFY COLUMN `descripcion` VARCHAR(250);

/* Eliminar una columna */
ALTER TABLE `clientes`
DROP COLUMN `descripcion`;