/*
    Usaremos las siguientes tablas de referencia:
*/

CREATE TABLE `users`(
    `id` INT NOT NULL AUTO_INCREMENTAL PRIMARY KEY,
    `name` VARCHAR(50) NOT NULL,
    `surname` VARCHAR(50) NOT NULL,
    `email` VARCHAR(100) NOT NULL
    `age` TINYINT NULL,
    `dni_id` INT NOT NULL,
    `company_id` INT NULL,
    `init_date` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP(),
    UNIQUE(`id`),
    FOREIGN KEY(`dni_id`) REFERENCES `dni`(`dni_id`)
);

CREATE TABLE `dni`(
    `dni_id` INT NOT NULL AUTO_INCREMENTAL PRIMARY KEY,
    `dni_number` VARCHAR(9) NOT NULL,
    `user_id` INT NOT NULL,
    UNIQUE(`dni_id`)
    FOREIGN KEY (`user_id`) REFERENCES `users`(`id`)
);

CREATE TABLE `companies`(
    `company_id` INT NOT NULL AUTO_INCREMENTAL PRIMARY KEY,
    `name` VARCHAR(50) NOT NULL
);

CREATE TABLE `languages`(
    `language_id` INT NOT NULL AUTO_INCREMENTAL PRIMARY KEY,
    `name` VARCHAR(50) NOT NULL
);

CREATE TABLE `users_languages`(
    `users_languages_id` INT NOT NULL AUTO_INCREMENTAL PRIMARY KEY,
    `user_id` INT NOT NULL,
    `language_id` INT NOT NULL,
    UNIQUE(`user_id`, `language_id`),
    FOREIGN KEY(`user_id`) REFERENCES `users`(`id`),
    FOREIGN KEY(`language_id`) REFERENCES `languages`(`language_id`)
);