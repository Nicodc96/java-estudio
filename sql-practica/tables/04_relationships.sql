/*
    Tabla de referencia
*/

CREATE TABLE `users`(
    `id` INT AUTO_INCREMENT PRIMARY KEY,
    `dni_id` INT NOT NULL,
    `name` VARCHAR(50) NOT NULL,
    `surname` VARCHAR(50) NOT NULL,
    `email` VARCHAR(125) NOT NULL,
    `company_id` INT NOT NULL,
    FOREIGN KEY(`dni_id`) REFERENCES `dni`(`id`),
    FOREIGN KEY(`company_id`) REFERENCES `companies`(`id`)
)

/*
    Relación entre tablas: Uno a Uno (1:1)

    Es aquella relación en la que una columna de una tabla A se relaciona con un registro
    de una tabla B y viceversa.
*/

CREATE TABLE `dni`(
	`id` INT AUTO_INCREMENT PRIMARY KEY,
    `number` INT NOT NULL,
    `user_id` INT,
    UNIQUE(`id`),
    FOREIGN KEY(`id`) REFERENCES `users`(`id`)
);

/* 
    Relación entre tablas: Uno a Muchos (1:N)

    Esta relación es cuando una tabla tiene una columna con un dato el cual
    muchas filas de otra tabla comparten.
*/

CREATE TABLE `companies`(
	`id` INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    `name` VARCHAR(100) NOT NULL
);

-- En el ejemplo de arriba, el campo `company_id` de la tabla `users` es la clave
-- foránea de la clave primaria `id` de la tabla `company` 
   
-- Otra manera de agregar una referencia de claves primaria-foránea en una tabla
-- ya creada es de la siguiente manera:

ALTER TABLE `users` 
ADD CONSTRAINT `fk_companies`
FOREIGN KEY(`company_id`) REFERENCES `companies`(`id`);

/*
    Relación entre tablas: Muchos a Muchos (N:N)

    Esta relación sucede cuando en una columna de varias filas de una tabla
    comparte información de varias filas de otra tabla. Estos datos pueden repetirse o no.
    Por ejemplo: "Las personas conocen MUCHOS lenguajes de programación, un lenguajes de programación
    son conocidos por MUCHAS personas". Esta relación tiene un conflicto y es que es imposible relacionarlas
    directamente sin una tabla 'x' intermedia 1:1 (N:1 1:1 1:N).
*/

CREATE TABLE `languages`(
	`id` INT AUTO_INCREMENT PRIMARY KEY,
    `name` VARCHAR(100) NOT NULL
);

-- Tabla intermedia:

CREATE TABLE `users_languages`(
	`id` int AUTO_INCREMENT PRIMARY KEY,
    `user_id` int,
    `language_id` int,
    FOREIGN KEY(`user_id`) REFERENCES `users`(`id`),
    FOREIGN KEY(`language_id`) REFERENCES `languages`(`id`),
    UNIQUE (user_id, language_id)
);

-- Los campos user_id y language_id de esta tabla intermedia users_languages son cada una una clave
-- foránea de las claves primarias `id` de la tabla `users` e `id` de la tabla `languages`
-- Un usuario puede conocer muchos lenguajes. Un lenguaje puede ser conocido por muchas personas.


/*
    Relación en la misma tabla: Auto-referencia

    Relación que indica que un un registro en la tabla A puede relacionarse
    con otro registro de la tabla A.
*/