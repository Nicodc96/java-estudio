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

-- Ordena todos los datos de la tabla "users" por edad (ascendente por defecto)
SELECT * FROM `users` ORDER BY `age`;

-- Ordena todos los datos de la tabla "users" por edad de manera ascendente
SELECT * FROM `users` ORDER BY `age` ASC;

-- Ordena todos los datos de la tabla "users" por edad de manera descendente
SELECT * FROM `users` ORDER BY `age` DESC;

-- Obtiene todos los datos de la tabla "users" con email igual a sara@gmail.com y los ordena por edad de manera descendente
SELECT * FROM `users` WHERE `email` = 'sara@gmail.com' ORDER BY `age` DESC;

-- Obtiene todos los nombres de la tabla "users" con email igual a sara@gmail.com y los ordena por edad de manera descendente
SELECT `name` FROM `users` WHERE `email` = 'sara@gmail.com' ORDER BY `age` DESC;