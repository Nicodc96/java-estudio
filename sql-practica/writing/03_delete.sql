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

/*
    IMPORTANTE: Para utilizar DELETE se debe fijar una cláusula WHERE para
    que elimine SI y SOLO SI se cumple dicha condición. El 99% del tiempo
    una sentencia DELETE lleva WHERE.
*/

-- Elimina el registro de la tabla "users" con identificador igual a 11
DELETE FROM `users` WHERE `id` = 11;