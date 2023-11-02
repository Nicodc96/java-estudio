/*
    Usaremos la siguiente tabla de referencia:
*/

CREATE TABLE `users`(
    `id` INT NOT NULL,
    `name` VARCHAR(50) NOT NULL,
    `surname` VARCHAR(50) NOT NULL,
    `email` VARCHAR(100) NOT NULL
    `age` TINYINT NULL,
    `init_date` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP()
);

-- Inserta un registro con identificador, nombre y apellido en la tabla "users"
-- IMPORTANTE: Esto es en caso de que los valores no ingresados puedan contener NULL
INSERT INTO `users` (`id`, `name`, `surname`) VALUES (8, 'María', 'López');

-- Inserta un registro con nombre y apellido en la tabla "users"
-- IMPORTANTE: Esto es en caso de que los valores no ingresados puedan contener NULL
INSERT INTO `users` (`name`, `surname`) VALUES ('Paco', 'Pérez')

-- Inserta un registro con identificador no correlativo, nombre y apellido en la tabla "users"
-- IMPORTANTE: Esto es en caso de que los valores no ingresados puedan contener NULL
INSERT INTO `users` (`id`, `name`, `surname`) VALUES (11, 'El', 'Merma');