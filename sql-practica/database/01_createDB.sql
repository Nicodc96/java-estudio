/*
    En primer lugar se debe seleccionar una base de datos en el cual trabajaremos,
    en algunas terminales se selecciona automáticamente si se realiza una consulta
    dentro de los límites de esa base de datos. De otra manera, utilizaremos la siguiente
    sintaxis:

    USE DATABASE nombre_base_datos

    Si se quiere hacer una consulta cualquiera desde fuera de cualquier base de datos se debe
    utilizar el nombre de la base de datos seguido de la tabla, por ejemplo:

    SELECT * FROM consultora-db.usuarios;

    Si no existe una base de datos se debe utilizar la sintaxis:

    CREATE DATABSE 'consultora_db'
*/
CREATE DATABASE consultora_db;
USE DATABASE consultora_db;
