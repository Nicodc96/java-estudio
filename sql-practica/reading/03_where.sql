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

-- Filtra todos los datos de la tabla "users" con edad igual a 15
SELECT * FROM `users` WHERE `age` = 15;

-- Filtra todos los nombres de la tabla "users" con edad igual a 15
SELECT name FROM `users` WHERE `age` = 15;

-- Filtra todos los nombres distintos de la tabla "users" con edad igual a 15
SELECT DISTINCT `name` FROM `users` WHERE `age` = 15;

-- Filtra todas las edades distintas de la tabla "users" con edad igual a 15
SELECT DISTINCT `age` FROM `users` WHERE `age` = 15;