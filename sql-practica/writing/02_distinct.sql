/*
    Usaremos la siguiente tabla de referencia:
*/

CREATE TABLE `users`(
    `id` INT NOT NULL,
    `name` VARCHAR(50) NOT NULL,
    `surname` VARCHAR(50) NOT NULL,
    `email` VARCHAR(100) NOT NULL
);

/*
    La cláusula DISTINCT hace referencia a seleccionar datos NO REPETIDOS entre sí
*/

-- Obtener todos los datos distintos de una tabla `users`

SELECT DISTINCT * FROM `users`;

-- Obtener los valores distintos de una columna `users`;

SELECT DISTINCT `name` FROM `users`;