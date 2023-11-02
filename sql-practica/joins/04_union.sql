/*
    A diferencia de LEFT JOIN y RIGHT JOIN, el UNION o también conocido
    como FULL JOIN trae toda la información de una relación entre 
    una tabla A y una tabla B aunque no exista una relación.

    UNION a secas: No muestra duplicados
    UNION ALL: Muestra duplicados
*/

-- Obtiene todos los id de usuarios de las tablas dni y usuarios (exista o no relación)
SELECT `users`.`id` AS `u_user_id`, `dni`.`user_id` AS `d_user_id` FROM `users`
LEFT JOIN `dni`
ON `users`.`id` = `dni`.`user_id`
UNION
SELECT `users`.`id` AS `user_id`, `dni`.`user_id` AS `d_user_id`
FROM `users`
RIGHT JOIN `dni`
ON `users`.`id` = `dni`.`user_id`;

-- Obtiene todos los datos de las tablas dni y usuarios (exista o no relación)
SELECT *
FROM `users`
LEFT JOIN `dni`
ON `users`.`id` = `dni`.`user_id`
UNION
SELECT *
FROM `users`
RIGHT JOIN `dni`
ON `users`.`id` = `dni`.`user_id`;