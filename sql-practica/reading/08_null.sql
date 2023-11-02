/*
    Usaremos la siguiente tabla de referencia:
*/

CREATE TABLE `users`(
    `id` INT NOT NULL,
    `name` VARCHAR(50) NOT NULL,
    `surname` VARCHAR(50) NOT NULL,
    `email` VARCHAR(100) NOT NULL
    `age` TINYINT NULL
);

-- Obtiene todos datos de la tabla "users" de la tabla "users" con email NULO
SELECT * FROM `users` WHERE `email` IS NULL;

-- Obtiene todos datos de la tabla "users" de la tabla "users" con email NO NULO
SELECT * FROM `users` WHERE `email` IS NOT NULL;

-- Obtiene todos datos de la tabla "users" de la tabla "users" con email NO NULO y edad igual a 15
SELECT * FROM `users` WHERE `email` IS NOT NULL AND `age` = 15;

-- Obtiene el nombre, apellido y edad de la tabla "users", y si la edad es NULA la muestra como 0
SELECT `name`, `surname`, IFNULL(`age`, 0) AS `age` FROM `users`;