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
USE DATABASE 'consultora_db';

/* 
    SELECT

    Sintaxis: 'SELECT columna(s) FROM nombre_tabla'

    Se utiliza esta consulta para obtener información específica o completa de una
    tabla de datos. En la parte de 'columna(s)' se puede seleccionar más de una columna
    separando por una coma (,) cada dato. Por ejemplo:

    table usuarios
    id      nombre      email               dni
    1       juan        juan05@gmail.com    24594728
    2       maria       mPerez@outlook.com  34592112
    3       pedro       pedrDiaz@z-bank.net 39401105

    SELECT nombre,email FROM usuarios;

    Además, se utiliza el '*' para indicar que se seleccionará todas las columnas
    de la tabla a consultar.
*/
SELECT nombre,dni FROM usuarios;

/*
    Cláusula WHERE

    Sintaxis: '... WHERE condicion(es)'

    Se utiliza esta cláusula para filtrar aquellas filas que se desea incluir o
    excluir de una consulta. Esta cláusula es EXTREMADAMENTE IMPORTANTE a la hora
    de actualizar o eliminar información de una base de datos.

    Un ejemplo:
    SELECT * FROM usuarios WHERE id = 2;

    Existen operadores que pueden utilizarse en este lenguaje de consultas:
    - AND
    - OR
    - =
    - != | <>
    - > | >=
    - < | <=
    - BETWEEN
    - LIKE
    - IN
*/
SELECT * FROM usuarios WHERE id = 2;
SELECT * FROM usuarios WHERE nombre LIKE 'juan';
SELECT * FROM usuarios WHERE dni BETWEEN 40000000 AND 70000000;
SELECT * FROM usuarios WHERE email LIKE '%@gmail.com'; /* Todos los usuarios cuyo email sean de tipo gmail */

/*
    Sentencia INSERT

    Sintaxis: 'INSERT INTO nombre_tabla (columna_1, columna_2 ...) VALUES (valor_1, valor_2 ...)'

    Esta sentencia se utiliza para ingresar información dentro de una tabla en nuestra
    base de datos. Se debe ingresar tantos datos como columnas posea dicha tabla, de lo
    contrario la consulta lanzará un error.

    Ejemplo:

    INSERT INTO usuarios (id, nombre, email, dni) VALUES
    (4, 'nicolas', 'diaznicox96@gmail.com', 39468894);

    Se puede ingresar mucha información de manera simultanea utilizando una coma (,)
    para separar la información:

    INSERT INTO usuarios (id, nombre, email, dni) VALUES
    (4, 'nicolas', 'diaznicox96@gmail.com', 39468894),
    (5, 'claudio', 'dcdiazcomputacion@gmail.com', 2149013),
    (6, 'florencia', 'fdiaz02@gmail.com', 44205309);
*/
INSERT INTO usuarios (id, nombre, email, dni) VALUES
(4, 'nicolas', 'diaznicox96@gmail.com', 39468894);

INSERT INTO usuarios (id, nombre, email, dni) VALUES
(4, 'nicolas', 'diaznicox96@gmail.com', 39468894),
(5, 'claudio', 'dcdiazcomputacion@gmail.com', 2149013),
(6, 'florencia', 'fdiaz02@gmail.com', 44205309);
