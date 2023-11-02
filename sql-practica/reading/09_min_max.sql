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

-- Obtiene el valor menor del campo edad de la tabla "users"
SELECT MIN(`age`) FROM `users`;

-- Obtiene el valor mayor del campo edad de la tabla "users"
SELECT MAX(`age`) FROM `users`;