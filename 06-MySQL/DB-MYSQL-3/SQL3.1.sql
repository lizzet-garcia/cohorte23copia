SELECT * FROM employee
ORDER by salary ASC;

-- MIN
SELECT MIN(salary) FROM employee;
SELECT MIN (last_name) FROM employee;

-- MAX
SELECT MAX (salary) FROM employee;

-- AVG (promedio)
SELECT AVG (salary) AS promedio FROM employee;
SELECT AVG (join_date) FROM employee;

-- SUM
SELECT SUM(employee_id) FROM employee;
SELECT SUM (salary), AVG(salary) FROM employee;

-- COUNT
SELECT COUNT(employe_id) FROM employee;
SELECT COUNT (salary) FROM employee;
SELECT COUNT(DISTINCT(salary)) FROM employee;
