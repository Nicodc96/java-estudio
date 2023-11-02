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

-- Establece el alias 'Fecha de inicio en programación' a la columna init_date
SELECT `name`, `init_date` AS 'Fecha de inicio en programación' FROM `users` WHERE `name` = 'Nicolas';

-- Consulta igual que la anterior. Representa la posibilidad de usar comillas dobles para cadenas
SELECT `name`, `init_date` AS "Fecha de inicio en programación" FROM `users` WHERE `name` = "Nicolas";

-- Concatena en una sola columa los campos nombre y apellido
SELECT CONCAT('Nombre: ', `name`, ', Apellidos: ', `surname`) FROM `users`;

-- Concatena en una sola columa los campos nombre y apellido y le establece el alias 'Nombre completo'
SELECT CONCAT('Nombre: ', `name`, ', Apellidos: ', `surname`) AS 'Nombre completo' FROM `users`;