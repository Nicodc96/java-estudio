/*
    Para entender LEFT JOIN se debe tener en cuenta que en una relación de tablas
    A y B siendo A la tabla a la que se le consulta:
    - SIEMPRE traerá la información de la tabla A
    - Se utiliza para traer información de A que TENGA O NO relación con B,
    siempre completará la información faltante con NULL
*/

-- Obtiene los datos de todos los usuarios junto a su dni (lo tenga o no)
SELECT * FROM `users`
LEFT JOIN `dni`
ON `users`.`id` = `dni`.`user_id`;

-- Obtiene el nombre de todos los usuarios junto a su dni (lo tenga o no)
SELECT `name`, `dni_number` FROM `users`
LEFT JOIN `dni`
ON `users`.`id` = `dni`.`user_id`;

-- Obtiene todos los dni junto al nombre de su usuario (lo tenga o no)
SELECT `name`, `dni_number` FROM `dni`
LEFT JOIN `users`
ON `users`.`id` = `dni`.`user_id`;

-- Obtiene el nombre de todos los usuarios junto a sus lenguajes (los tenga o no)
SELECT `users`.`name`, `languages`.`name` FROM `users`
LEFT JOIN `users_languages` 
ON `users`.`id` = `users_languages`.`user_id`
LEFT JOIN `languages` 
ON `users_languages`.`language_id` = `languages`.`language_id`;