SELECT * FROM `users`;
SELECT `first_name` FROM `users`;

-- insertar datos a tabla pets
INSERT INTO `pets`
(first_name, fav_food, `type`, users_idusers)
VALUES
('Pepenka', 'carnita', 'perrito', 1),
('Nicky', 'Caldito con tortillitas', 'Doggo', 2),
('Pepperoni', 'Huesitos de manzanas', 'Doggo', 3);

-- seleccionar todo de pets
SELECT * FROM `pets`;

-- Filtrar por FK para identificar a owners
SELECT * FROM `pets`
WHERE users_idusers = 3;

ALTER TABLE pets
MODIFY idpets INT NOT NULL
AUTO_INCREMENT;

-- Selecciona todo de una tabla
SELECT * FROM users;

-- Seleccionar solo una columna
SELECT first_name FROM users;

-- Insertar datos a tabla pets
INSERT INTO pets
(first_name, fav_food, type, users_idusers)
VALUES
('Mica', 'Atun', 'Gato', 1),
('Jindori', 'Carne de Res', 'Perro', 1),
('Link', 'Zanahorias', 'Conejo', 3),
('Beatle', 'Salmon', 'Perro', 2);

-- Seleccionar todo de pets
SELECT * FROM pets;

-- Filtrar por FK para identificar a owners
SELECT * FROM pets
WHERE users_idusers = 3;






