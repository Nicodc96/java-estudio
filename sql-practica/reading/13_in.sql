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

-- Ordena todos los datos de la tabla "users" con nombre igual a brais y sara
SELECT * FROM `users` WHERE `name` IN ('nicolas', 'sara');