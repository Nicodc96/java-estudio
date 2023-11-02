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

-- Cuenta cuantas filas contiene la tabla "users"
SELECT COUNT(*) FROM `users`;

-- Cuenta cuantas filas contienen un dato NO NULO en el campo edad de la tabla "users"
SELECT COUNT(`age`) FROM `users`;