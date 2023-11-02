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

-- Estable el valor 21 para la edad del registro de la tabla "users" con identificador igual a 11
UPDATE `users` SET `age` = '21' WHERE `id` = 11;

-- Estable el valor 20 para la edad del registro de la tabla "users" con identificador igual a 11
UPDATE `users` SET `age` = '20' WHERE `id` = 11;

-- Estable edad y una fecha para registro de la tabla "users" con identificador igual a 11
UPDATE `users` SET `age` = 20, `init_date` = '2020-10-12' WHERE `id` = 11;