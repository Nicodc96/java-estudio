/*
    Usaremos la siguiente tabla de referencia:
*/

CREATE TABLE `users`(
    `id` INT NOT NULL,
    `name` VARCHAR(50) NOT NULL,
    `surname` VARCHAR(50) NOT NULL,
    `email` VARCHAR(100) NOT NULL
);

-- Obtiene todos los datos de una tabla `users`

SELECT * FROM `users`;

-- Obtener un dato (columna) de una tabla `users`

SELECT `name` FROM `users`;

-- Obtener uno o más columnas en particular de una tabla `users`

SELECT `name`, `email` FROM `users`;