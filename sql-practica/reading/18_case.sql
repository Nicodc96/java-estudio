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

-- Obtiene todos los datos de la tabla "users" y establece condiciones 
-- de visualización de cadenas de texto según el valor de la edad 
SELECT *,
CASE 
	WHEN `age` > 18 THEN 'Es mayor de edad'
    WHEN `age` = 18 THEN 'Acaba de cumplir la mayoría de edad'
    ELSE 'Es menor de edad'
END AS '¿Es mayor de edad?'
FROM `users`;

-- Obtiene todos los datos de la tabla "users" y establece 
-- condiciones de visualización de valores booleanos según el valor de la edad 
SELECT *,
CASE 
	WHEN `age` > 17 THEN `Verdadero`
    ELSE `Falso`
END AS '¿Es mayor de edad?'
FROM `users`;

/* 
    IMPORTANTE: Siempre se debe guardar los 'case' bajo un AS 'nombre' ya que
    de lo contrario en la consulta se mostrará la sentencia completa y no sería
    para nada estético.
*/