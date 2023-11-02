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

-- Obtiene todos datos de la tabla "users" con email DISTINTO a sara@gmail.com
SELECT * FROM `users` WHERE NOT `email` = 'sara@gmail.com';

-- Obtiene todos datos de la tabla "users" con email DISTINTO a sara@gmail.com Y edad igual a 15
SELECT * FROM `users` WHERE NOT `email` = 'sara@gmail.com' AND `age` = 15;

-- Obtiene todos datos de la tabla "users" con email DISTINTO a sara@gmail.com O edad igual a 15
SELECT * FROM `users` WHERE NOT `email` = 'sara@gmail.com' OR `age` = 15;