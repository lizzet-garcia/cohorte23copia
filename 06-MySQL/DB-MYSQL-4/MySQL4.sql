USE generation;

-- INNER JOIN
-- Encontrar a que pais pertenecen
SELECT students.*, countries.name, countries.code 
FROM students
INNER JOIN countries
ON
students.nationality = countries.idCountries;

-- 
SELECT
 students.idStudent AS 'ID', 
students.name AS 'Nombre',
students.last_name AS 'Apellido',
countries.name AS 'Pais de origen', 
countries.code AS 'codigo del pais' 
FROM students
INNER JOIN countries
ON
students.nationality = countries.idCountries;

-- Encontramos que tipo de ID tienen
SELECT 
students.idStudent AS 'ID',
students.name AS 'Nombre',
students.last_name AS 'Apellido',
idtypes.name AS 'Tipo de ID de registro'
FROM students
INNER JOIN idtypes
ON students.IdType_id = idtypes.id_idTypes;

-- Abreviaciones
SELECT 
t1.name,
t2.name, 
t2.code 
FROM students t1
INNER JOIN countries t2
ON
t1.nationality = t2.idCountries;

--
SELECT * FROM students;
SELECT * FROM countries;
SELECT * FROM idtypes;
SELECT * FROM courses_has_students;
SELECT * FROM courses;
SELECT * FROM modules;

-- Estudiantes que esten registrados en un curso
-- Nombre, Id, Apellido y Curso al que pertenecen
SELECT
students.name AS 'Nombre',
students.last_name AS 'Apellido',
students.idStudent AS 'ID', 
courses_has_students.course_code AS 'curso'
FROM students
INNER JOIN courses_has_students
ON
courses_has_students.students_id_student = students.idStudent;

--
SELECT
t1.last_name AS 'Nombre',
t2.course_code AS 'codigo de curso',
t3.name AS 'curso',
t3.credits
FROM students t1
INNER JOIN courses_has_students t2
ON t1.idStudent = t2.students_id_student
INNER JOIN courses t3
ON t2.course_code = t3.code;

-- group by sirve para agrupar datos coincidentes
SELECT
t1.course_code AS 'codigo de curso',
t2.code AS 'codigo de curso',
t2.name AS 'curso'
FROM courses_has_students t1
INNER JOIN courses t2
ON t1.course_code = t2.code
GROUP BY t2.code;

-- ejercicios
-- encontrar estudiantes que sean del pais 125
SELECT students.idStudent AS 'ID',
countries.name AS 'Nombre', 
students.last_name AS 'Apellido',
countries.name AS 'País de origen',
countries.code AS 'Codigo de País'
FROM students -- desde TABLA A
INNER JOIN countries -- juntar con TABLA B
ON students.nationality = countries.idCountries
WHERE idCountries = '125';

-- contar estudiantes que pertenezcan al curso JAVA 1
SELECT COUNT(*)
FROM (
    SELECT
        t1.name AS 'Nombre',
        t1.last_name AS 'Apellido',
        t2.course_code AS 'Codigo de curso',
        t3.name AS 'Curso',
        t3.credits
    FROM students t1
    INNER JOIN courses_has_students t2
    ON t1.idStudent = t2.students_id_student
    INNER JOIN courses t3
    ON t2.course_code = t3.code
    WHERE course_code = 'JAVA-1'
) subquery;

-- contar estudiantes por cada modulo
SELECT 
    t1.name AS 'Nombre',
    t1.last_name AS 'Apellido',
    t2.course_code AS 'Codigo de curso',
    t3.name AS 'Curso',
    t3.credits,
    t4.name AS 'Nombre del Modulo',
    t4.code AS 'Codigo de Modulo'
FROM students t1
INNER JOIN courses_has_students t2
ON t1.idStudent = t2.students_id_student
INNER JOIN Courses t3
ON t2.course_code = t3.code
INNER JOIN Modules t4
ON t3.module_code = t4.code;

SELECT t4.code AS 'Codigo de Modulo', COUNT(*) AS 'Estudiantes en el Modulo'
FROM students t1
INNER JOIN courses_has_students t2 
ON t1.idStudent = t2.students_id_student
INNER JOIN Courses t3 
ON t2.course_code = t3.code
INNER JOIN Modules t4 
ON t3.module_code = t4.code
WHERE t4.code IN ('DB-MYSQL', 'JAVA', 'JS', 'ROLE', 'WEB-JAVA', 'INTRO-CS', 'INTRO-WEB')
GROUP BY t4.code;


-- encontrar estudiantes sin curso 




















