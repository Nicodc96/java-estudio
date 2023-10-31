
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
SELECT `*` FROM `usuarios` WHERE `id` = 2;
SELECT `*` FROM `usuarios` WHERE `nombre` LIKE 'juan';
SELECT `*` FROM `usuarios` WHERE `dni` BETWEEN 40000000 AND 70000000;
SELECT `*` FROM `usuarios` WHERE `email` LIKE '%@gmail.com'; /* Todos los usuarios cuyo email sean de tipo gmail */

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
INSERT INTO `usuarios` (`id`, `nombre`, `email`, `dni`) VALUES
(4, 'nicolas', 'diaznicox96@gmail.com', 39468894);

INSERT INTO `usuarios` (`id`, `nombre`, `email`, `dni`) VALUES
(4, 'nicolas', 'diaznicox96@gmail.com', 39468894),
(5, 'claudio', 'dcdiazcomputacion@gmail.com', 2149013),
(6, 'florencia', 'fdiaz02@gmail.com', 44205309);
