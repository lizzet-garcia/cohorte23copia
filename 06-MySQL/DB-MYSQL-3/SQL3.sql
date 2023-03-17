USE business;

-- Revisar employee
SELECT * FROM employee;

-- ALIAS
SELECT last_name AS 'Apellido' FROM employee;

-- ALIAS ++
SELECT
    employee_id AS 'ID',
    first_name AS 'Nombre',
    last_name AS 'Apellido',
    department AS 'Departamento'
FROM employee;

-- Filtrar por nombre
-- BUSCAR a Monika

SELECT first_name FROM employee
WHERE first_name = 'Monika';

-- Filtrar doble
SELECT * FROM employee
WHERE salary = 500000 AND first_name = 'Vivek';

-- Filtrar por NOT
SELECT * FROM employee
WHERE NOT first_name = 'Barrack';

-- Filtrar por doble negacion
SELECT * FROM employee
WHERE NOT first_name = 'Santiago' AND NOT first_name = 'Ian';

-- Ordenamiento
-- ORDER BY
-- Default es orden descendiente
SELECT * FROM employee
ORDER BY department ASC, last_name DESC;

-- GROUP BY
SELECT * FROM employee
GROUP BY salary;

-- IN
SELECT * FROM employee
WHERE employee_id IN (1,3,7,8,5);

-- BETWEEN 
SELECT * FROM employee
WHERE salary BETWEEN 200000 AND 500000;

-- NOT BETWEEN 
SELECT * FROM employee
WHERE salary NOT BETWEEN 200000 AND 500000;

-- LIMIT
SELECT * FROM employee
LIMIT 3;

-- LIMIT + OFFSET (offset ignora los primeros 3 resultados y me da los otros 3)
SELECT * FROM employee
LIMIT 3 OFFSET 3;

-- LIKE (empiece con B)
SELECT * FROM employee
WHERE last_name LIKE 'B%';

-- LIKE (termina con B)
SELECT * FROM employee
WHERE last_name LIKE '%B';

-- case sensitive
SELECT * FROM employee
WHERE last_name LIKE BINARY '%B';

-- LIKE
SELECT * FROM employee
WHERE join_date LIKE '%02%';

-- UPDATE INFO
UPDATE employee
SET salary = 300000
WHERE employee_id = 5;

