/*
    Para entender RIGHT JOIN se debe tener en cuenta que en una relación de tablas
    A y B siendo A la tabla a la que se le consulta:
    - SIEMPRE traerá la información de la tabla B
    - Se utiliza para traer información de B que TENGA O NO relación con A,
    siempre completará la información faltante con NULL
*/

-- Obtiene los datos de todos los dni junto a su usuario (lo tenga o no)
SELECT * FROM `users`
RIGHT JOIN `dni`
ON `users`.`id` = `dni`.`user_id`;

-- Obtiene el nombre de todos los dni junto a su usuario (lo tenga o no)
SELECT `name`, `dni_number` FROM `users`
RIGHT JOIN `dni`
ON `users`.`id` = `dni`.`user_id`;

-- Obtiene todos los nombres de usuarios junto al numero de su dni (lo tenga o no)
SELECT `name`, `dni_number` FROM `dni`
RIGHT JOIN `users`
ON `users`.`id` = `dni`.`user_id`;

-- Obtiene el nombre de todos los lenguajes junto a sus usuarios (los tenga o no)
SELECT `users`.`name`, `languages`.`name` FROM `users`
RIGHT JOIN `users_languages` 
ON `users`.`id` = `users_languages`.`user_id`
RIGHT JOIN `languages` 
ON `users_languages`.`language_id` = `languages`.`language_id`;