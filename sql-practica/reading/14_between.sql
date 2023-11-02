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

-- Ordena todos los datos de la tabla "users" con edad comprendida entre 20 y 30
SELECT * FROM `users` WHERE `age` BETWEEN 20 AND 30;