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

-- Agrupa los resultados por edad diferente
SELECT MAX(`age`) FROM `users` GROUP BY `age`;

-- Agrupa los resultados por edad diferente y cuenta cuantos registros existen de cada una
SELECT COUNT(`age`), `age` FROM `users` GROUP BY `age`;

-- Agrupa los resultados por edad diferente, cuenta cuantos registros existen de cada una y los ordena
SELECT COUNT(`age`), `age` FROM `users` GROUP BY `age` ORDER BY `age` ASC;

-- Agrupa los resultados por edad diferente mayor de 15, cuenta cuantos registros existen de cada una y los ordena
SELECT COUNT(`age`), `age` FROM `users` WHERE `age` > 15 GROUP BY `age` ORDER BY `age` ASC;